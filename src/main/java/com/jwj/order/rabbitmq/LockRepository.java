package com.jwj.order.rabbitmq;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Supplier;

@Slf4j
@Component
@RequiredArgsConstructor
public class LockRepository {

	private static final String GET_LOCK = "SELECT GET_LOCK(?, ?)";
	private static final String RELEASE_LOCK = "SELECT RELEASE_LOCK(?)";
	private static final String EXCEPTION_MESSAGE = "Lock 획득을 수행하는 도중 예외가 발생했습니다.";

	private final DataSource dataSource;

	public <T> T executeWithLock(String lockName, int timoutSeconds, Supplier<T> supplier) {

		try (Connection connection = dataSource.getConnection()) {
			try {
				getLock(connection, lockName, timoutSeconds);	// GET_LOCK() : 락 획득
				return supplier.get();
			} finally {
				releaseLock(connection, lockName);				// RELEASE_LOCK() : 락 해제
			}
		} catch (SQLException | RuntimeException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	// GET_LOCK()
	private void getLock(Connection connection, String lockName, int timeoutseconds) throws SQLException {

		try (PreparedStatement preparedStatement = connection.prepareStatement(GET_LOCK)) {
			preparedStatement.setString(1, lockName);
			preparedStatement.setInt(2, timeoutseconds);

			checkResultSet(lockName, preparedStatement, "GetLock_");
		}
	}

	// RELEASE_LOCK()
	private void releaseLock(Connection connection, String lockName) throws SQLException {
		try (PreparedStatement preparedStatement = connection.prepareStatement(RELEASE_LOCK)) {
			preparedStatement.setString(1, lockName);

			checkResultSet(lockName, preparedStatement, "ReleaseLock_");
		}
	}

	// 결과 반환
	private void checkResultSet(String userLockName, PreparedStatement preparedStatement, String type) throws SQLException {
		try (ResultSet resultSet = preparedStatement.executeQuery()) {
			if (!resultSet.next()) {
				log.error("USER LEVEL LOCK 쿼리 결과 값이 없습니다. type = {}, userLockName = {}, connection = {}", type, userLockName, preparedStatement.getConnection());
				throw new RuntimeException(EXCEPTION_MESSAGE);
			}
			int result = resultSet.getInt(1);
			if (result != 1) {
				log.error("USER LEVEL LOCK 쿼리 결과 값이 1이 아닙니다. type = {}, result = {}, userLockName = {}, connection = {}", type, result, userLockName, preparedStatement.getConnection());
				throw new RuntimeException(EXCEPTION_MESSAGE);
			}
		}
	}
}