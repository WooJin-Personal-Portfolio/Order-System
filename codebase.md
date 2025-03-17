# .gitattributes

```
/gradlew text eol=lf
*.bat text eol=crlf
*.jar binary

```

# .gitignore

```
HELP.md
.gradle
build/
!gradle/wrapper/gradle-wrapper.jar
!**/src/main/**/build/
!**/src/test/**/build/

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache
bin/
!**/src/main/**/bin/
!**/src/test/**/bin/

### IntelliJ IDEA ###
application.yml
.idea
*.iws
*.iml
*.ipr
out/
!**/src/main/**/out/
!**/src/test/**/out/

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/

### VS Code ###
.vscode/

```

# .idea/.gitignore

```
# Default ignored files
/shelf/
/workspace.xml
# Editor-based HTTP Client requests
/httpRequests/
# Datasource local storage ignored files
/dataSources/
/dataSources.local.xml

```

# .idea/.name

```
order
```

# .idea/compiler.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="CompilerConfiguration">
    <annotationProcessing>
      <profile default="true" name="Default" enabled="true" />
    </annotationProcessing>
    <bytecodeTargetLevel target="17" />
  </component>
</project>
```

# .idea/dataSources.local.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="dataSourceStorageLocal" created-in="IU-242.24807.4">
    <data-source name="orders@localhost" uuid="38aab27b-2ce7-4876-a936-fe1a31b8cc8c">
      <database-info product="MySQL" version="9.2.0" jdbc-version="4.2" driver-name="MySQL Connector/J" driver-version="mysql-connector-j-8.2.0 (Revision: 06a1f724497fd81c6a659131fda822c9e5085b6c)" dbms="MYSQL" exact-version="9.2.0" exact-driver-version="8.2">
        <extra-name-characters>#@</extra-name-characters>
        <identifier-quote-string>`</identifier-quote-string>
        <jdbc-catalog-is-schema>true</jdbc-catalog-is-schema>
      </database-info>
      <case-sensitivity plain-identifiers="exact" quoted-identifiers="exact" />
      <secret-storage>master_key</secret-storage>
      <user-name>root</user-name>
      <schema-mapping>
        <introspection-scope>
          <node kind="schema" qname="@" />
        </introspection-scope>
      </schema-mapping>
    </data-source>
  </component>
</project>
```

# .idea/dataSources.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="DataSourceManagerImpl" format="xml" multifile-model="true">
    <data-source source="LOCAL" name="orders@localhost" uuid="38aab27b-2ce7-4876-a936-fe1a31b8cc8c">
      <driver-ref>mysql.8</driver-ref>
      <synchronize>true</synchronize>
      <jdbc-driver>com.mysql.cj.jdbc.Driver</jdbc-driver>
      <jdbc-url>jdbc:mysql://localhost:3306/orders</jdbc-url>
      <jdbc-additional-properties>
        <property name="com.intellij.clouds.kubernetes.db.host.port" />
        <property name="com.intellij.clouds.kubernetes.db.enabled" value="false" />
        <property name="com.intellij.clouds.kubernetes.db.container.port" />
      </jdbc-additional-properties>
      <working-dir>$ProjectFileDir$</working-dir>
    </data-source>
  </component>
</project>
```

# .idea/dataSources/38aab27b-2ce7-4876-a936-fe1a31b8cc8c.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<dataSource name="orders@localhost">
  <database-model serializer="dbm" dbms="MYSQL" family-id="MYSQL" format-version="4.53">
    <root id="1">
      <DefaultCasing>exact</DefaultCasing>
      <DefaultEngine>InnoDB</DefaultEngine>
      <DefaultTmpEngine>InnoDB</DefaultTmpEngine>
      <Grants>|root||root||ALLOW_NONEXISTENT_DEFINER|G
|root||root|localhost|ALLOW_NONEXISTENT_DEFINER|G
|root||root||ALTER|G
|root||root|localhost|ALTER|G
|root||root||ALTER ROUTINE|G
|root||root|localhost|ALTER ROUTINE|G
|root||root||APPLICATION_PASSWORD_ADMIN|G
|root||root|localhost|APPLICATION_PASSWORD_ADMIN|G
|root||mysql.infoschema|localhost|AUDIT_ABORT_EXEMPT|G
|root||mysql.session|localhost|AUDIT_ABORT_EXEMPT|G
|root||mysql.sys|localhost|AUDIT_ABORT_EXEMPT|G
|root||root||AUDIT_ABORT_EXEMPT|G
|root||root|localhost|AUDIT_ABORT_EXEMPT|G
|root||root||AUDIT_ADMIN|G
|root||root|localhost|AUDIT_ADMIN|G
|root||mysql.session|localhost|AUTHENTICATION_POLICY_ADMIN|G
|root||root||AUTHENTICATION_POLICY_ADMIN|G
|root||root|localhost|AUTHENTICATION_POLICY_ADMIN|G
|root||mysql.session|localhost|BACKUP_ADMIN|G
|root||root||BACKUP_ADMIN|G
|root||root|localhost|BACKUP_ADMIN|G
|root||root||BINLOG_ADMIN|G
|root||root|localhost|BINLOG_ADMIN|G
|root||root||BINLOG_ENCRYPTION_ADMIN|G
|root||root|localhost|BINLOG_ENCRYPTION_ADMIN|G
|root||mysql.session|localhost|CLONE_ADMIN|G
|root||root||CLONE_ADMIN|G
|root||root|localhost|CLONE_ADMIN|G
|root||mysql.session|localhost|CONNECTION_ADMIN|G
|root||root||CONNECTION_ADMIN|G
|root||root|localhost|CONNECTION_ADMIN|G
|root||root||CREATE|G
|root||root|localhost|CREATE|G
|root||root||CREATE ROLE|G
|root||root|localhost|CREATE ROLE|G
|root||root||CREATE ROUTINE|G
|root||root|localhost|CREATE ROUTINE|G
|root||root||CREATE TABLESPACE|G
|root||root|localhost|CREATE TABLESPACE|G
|root||root||CREATE TEMPORARY TABLES|G
|root||root|localhost|CREATE TEMPORARY TABLES|G
|root||root||CREATE USER|G
|root||root|localhost|CREATE USER|G
|root||root||CREATE VIEW|G
|root||root|localhost|CREATE VIEW|G
|root||root||CREATE_SPATIAL_REFERENCE_SYSTEM|G
|root||root|localhost|CREATE_SPATIAL_REFERENCE_SYSTEM|G
|root||root||DELETE|G
|root||root|localhost|DELETE|G
|root||root||DROP|G
|root||root|localhost|DROP|G
|root||root||DROP ROLE|G
|root||root|localhost|DROP ROLE|G
|root||root||ENCRYPTION_KEY_ADMIN|G
|root||root|localhost|ENCRYPTION_KEY_ADMIN|G
|root||root||EVENT|G
|root||root|localhost|EVENT|G
|root||root||EXECUTE|G
|root||root|localhost|EXECUTE|G
|root||root||FILE|G
|root||root|localhost|FILE|G
|root||mysql.infoschema|localhost|FIREWALL_EXEMPT|G
|root||mysql.session|localhost|FIREWALL_EXEMPT|G
|root||mysql.sys|localhost|FIREWALL_EXEMPT|G
|root||root||FIREWALL_EXEMPT|G
|root||root|localhost|FIREWALL_EXEMPT|G
|root||root||FLUSH_OPTIMIZER_COSTS|G
|root||root|localhost|FLUSH_OPTIMIZER_COSTS|G
|root||root||FLUSH_PRIVILEGES|G
|root||root|localhost|FLUSH_PRIVILEGES|G
|root||root||FLUSH_STATUS|G
|root||root|localhost|FLUSH_STATUS|G
|root||root||FLUSH_TABLES|G
|root||root|localhost|FLUSH_TABLES|G
|root||root||FLUSH_USER_RESOURCES|G
|root||root|localhost|FLUSH_USER_RESOURCES|G
|root||root||GROUP_REPLICATION_ADMIN|G
|root||root|localhost|GROUP_REPLICATION_ADMIN|G
|root||root||GROUP_REPLICATION_STREAM|G
|root||root|localhost|GROUP_REPLICATION_STREAM|G
|root||root||INDEX|G
|root||root|localhost|INDEX|G
|root||root||INNODB_REDO_LOG_ARCHIVE|G
|root||root|localhost|INNODB_REDO_LOG_ARCHIVE|G
|root||root||INNODB_REDO_LOG_ENABLE|G
|root||root|localhost|INNODB_REDO_LOG_ENABLE|G
|root||root||INSERT|G
|root||root|localhost|INSERT|G
|root||root||LOCK TABLES|G
|root||root|localhost|LOCK TABLES|G
|root||root||OPTIMIZE_LOCAL_TABLE|G
|root||root|localhost|OPTIMIZE_LOCAL_TABLE|G
|root||root||PASSWORDLESS_USER_ADMIN|G
|root||root|localhost|PASSWORDLESS_USER_ADMIN|G
|root||mysql.session|localhost|PERSIST_RO_VARIABLES_ADMIN|G
|root||root||PERSIST_RO_VARIABLES_ADMIN|G
|root||root|localhost|PERSIST_RO_VARIABLES_ADMIN|G
|root||root||PROCESS|G
|root||root|localhost|PROCESS|G
|root||root||REFERENCES|G
|root||root|localhost|REFERENCES|G
|root||root||RELOAD|G
|root||root|localhost|RELOAD|G
|root||root||REPLICATION CLIENT|G
|root||root|localhost|REPLICATION CLIENT|G
|root||root||REPLICATION SLAVE|G
|root||root|localhost|REPLICATION SLAVE|G
|root||root||REPLICATION_APPLIER|G
|root||root|localhost|REPLICATION_APPLIER|G
|root||root||REPLICATION_SLAVE_ADMIN|G
|root||root|localhost|REPLICATION_SLAVE_ADMIN|G
|root||root||RESOURCE_GROUP_ADMIN|G
|root||root|localhost|RESOURCE_GROUP_ADMIN|G
|root||root||RESOURCE_GROUP_USER|G
|root||root|localhost|RESOURCE_GROUP_USER|G
|root||root||ROLE_ADMIN|G
|root||root|localhost|ROLE_ADMIN|G
|root||mysql.infoschema|localhost|SELECT|G
|root||root||SELECT|G
|root||root|localhost|SELECT|G
|root||root||SENSITIVE_VARIABLES_OBSERVER|G
|root||root|localhost|SENSITIVE_VARIABLES_OBSERVER|G
|root||root||SERVICE_CONNECTION_ADMIN|G
|root||root|localhost|SERVICE_CONNECTION_ADMIN|G
|root||mysql.session|localhost|SESSION_VARIABLES_ADMIN|G
|root||root||SESSION_VARIABLES_ADMIN|G
|root||root|localhost|SESSION_VARIABLES_ADMIN|G
|root||root||SET_ANY_DEFINER|G
|root||root|localhost|SET_ANY_DEFINER|G
|root||root||SHOW DATABASES|G
|root||root|localhost|SHOW DATABASES|G
|root||root||SHOW VIEW|G
|root||root|localhost|SHOW VIEW|G
|root||root||SHOW_ROUTINE|G
|root||root|localhost|SHOW_ROUTINE|G
|root||mysql.session|localhost|SHUTDOWN|G
|root||root||SHUTDOWN|G
|root||root|localhost|SHUTDOWN|G
|root||mysql.session|localhost|SUPER|G
|root||root||SUPER|G
|root||root|localhost|SUPER|G
|root||mysql.infoschema|localhost|SYSTEM_USER|G
|root||mysql.session|localhost|SYSTEM_USER|G
|root||mysql.sys|localhost|SYSTEM_USER|G
|root||root||SYSTEM_USER|G
|root||root|localhost|SYSTEM_USER|G
|root||mysql.session|localhost|SYSTEM_VARIABLES_ADMIN|G
|root||root||SYSTEM_VARIABLES_ADMIN|G
|root||root|localhost|SYSTEM_VARIABLES_ADMIN|G
|root||root||TABLE_ENCRYPTION_ADMIN|G
|root||root|localhost|TABLE_ENCRYPTION_ADMIN|G
|root||root||TELEMETRY_LOG_ADMIN|G
|root||root|localhost|TELEMETRY_LOG_ADMIN|G
|root||root||TRANSACTION_GTID_TAG|G
|root||root|localhost|TRANSACTION_GTID_TAG|G
|root||root||TRIGGER|G
|root||root|localhost|TRIGGER|G
|root||root||UPDATE|G
|root||root|localhost|UPDATE|G
|root||root||XA_RECOVER_ADMIN|G
|root||root|localhost|XA_RECOVER_ADMIN|G
|root||root||grant option|G
|root||root|localhost|grant option|G
performance_schema|schema||mysql.session|localhost|SELECT|G
sys|schema||mysql.sys|localhost|TRIGGER|G</Grants>
      <ServerVersion>9.2.0</ServerVersion>
    </root>
    <collation id="2" parent="1" name="armscii8_general_ci">
      <Charset>armscii8</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="3" parent="1" name="armscii8_bin">
      <Charset>armscii8</Charset>
    </collation>
    <collation id="4" parent="1" name="ascii_general_ci">
      <Charset>ascii</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="5" parent="1" name="ascii_bin">
      <Charset>ascii</Charset>
    </collation>
    <collation id="6" parent="1" name="big5_chinese_ci">
      <Charset>big5</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="7" parent="1" name="big5_bin">
      <Charset>big5</Charset>
    </collation>
    <collation id="8" parent="1" name="binary">
      <Charset>binary</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="9" parent="1" name="cp1250_general_ci">
      <Charset>cp1250</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="10" parent="1" name="cp1250_czech_cs">
      <Charset>cp1250</Charset>
    </collation>
    <collation id="11" parent="1" name="cp1250_croatian_ci">
      <Charset>cp1250</Charset>
    </collation>
    <collation id="12" parent="1" name="cp1250_bin">
      <Charset>cp1250</Charset>
    </collation>
    <collation id="13" parent="1" name="cp1250_polish_ci">
      <Charset>cp1250</Charset>
    </collation>
    <collation id="14" parent="1" name="cp1251_bulgarian_ci">
      <Charset>cp1251</Charset>
    </collation>
    <collation id="15" parent="1" name="cp1251_ukrainian_ci">
      <Charset>cp1251</Charset>
    </collation>
    <collation id="16" parent="1" name="cp1251_bin">
      <Charset>cp1251</Charset>
    </collation>
    <collation id="17" parent="1" name="cp1251_general_ci">
      <Charset>cp1251</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="18" parent="1" name="cp1251_general_cs">
      <Charset>cp1251</Charset>
    </collation>
    <collation id="19" parent="1" name="cp1256_general_ci">
      <Charset>cp1256</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="20" parent="1" name="cp1256_bin">
      <Charset>cp1256</Charset>
    </collation>
    <collation id="21" parent="1" name="cp1257_lithuanian_ci">
      <Charset>cp1257</Charset>
    </collation>
    <collation id="22" parent="1" name="cp1257_bin">
      <Charset>cp1257</Charset>
    </collation>
    <collation id="23" parent="1" name="cp1257_general_ci">
      <Charset>cp1257</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="24" parent="1" name="cp850_general_ci">
      <Charset>cp850</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="25" parent="1" name="cp850_bin">
      <Charset>cp850</Charset>
    </collation>
    <collation id="26" parent="1" name="cp852_general_ci">
      <Charset>cp852</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="27" parent="1" name="cp852_bin">
      <Charset>cp852</Charset>
    </collation>
    <collation id="28" parent="1" name="cp866_general_ci">
      <Charset>cp866</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="29" parent="1" name="cp866_bin">
      <Charset>cp866</Charset>
    </collation>
    <collation id="30" parent="1" name="cp932_japanese_ci">
      <Charset>cp932</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="31" parent="1" name="cp932_bin">
      <Charset>cp932</Charset>
    </collation>
    <collation id="32" parent="1" name="dec8_swedish_ci">
      <Charset>dec8</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="33" parent="1" name="dec8_bin">
      <Charset>dec8</Charset>
    </collation>
    <collation id="34" parent="1" name="eucjpms_japanese_ci">
      <Charset>eucjpms</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="35" parent="1" name="eucjpms_bin">
      <Charset>eucjpms</Charset>
    </collation>
    <collation id="36" parent="1" name="euckr_korean_ci">
      <Charset>euckr</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="37" parent="1" name="euckr_bin">
      <Charset>euckr</Charset>
    </collation>
    <collation id="38" parent="1" name="gb18030_chinese_ci">
      <Charset>gb18030</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="39" parent="1" name="gb18030_bin">
      <Charset>gb18030</Charset>
    </collation>
    <collation id="40" parent="1" name="gb18030_unicode_520_ci">
      <Charset>gb18030</Charset>
    </collation>
    <collation id="41" parent="1" name="gb2312_chinese_ci">
      <Charset>gb2312</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="42" parent="1" name="gb2312_bin">
      <Charset>gb2312</Charset>
    </collation>
    <collation id="43" parent="1" name="gbk_chinese_ci">
      <Charset>gbk</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="44" parent="1" name="gbk_bin">
      <Charset>gbk</Charset>
    </collation>
    <collation id="45" parent="1" name="geostd8_general_ci">
      <Charset>geostd8</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="46" parent="1" name="geostd8_bin">
      <Charset>geostd8</Charset>
    </collation>
    <collation id="47" parent="1" name="greek_general_ci">
      <Charset>greek</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="48" parent="1" name="greek_bin">
      <Charset>greek</Charset>
    </collation>
    <collation id="49" parent="1" name="hebrew_general_ci">
      <Charset>hebrew</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="50" parent="1" name="hebrew_bin">
      <Charset>hebrew</Charset>
    </collation>
    <collation id="51" parent="1" name="hp8_english_ci">
      <Charset>hp8</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="52" parent="1" name="hp8_bin">
      <Charset>hp8</Charset>
    </collation>
    <collation id="53" parent="1" name="keybcs2_general_ci">
      <Charset>keybcs2</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="54" parent="1" name="keybcs2_bin">
      <Charset>keybcs2</Charset>
    </collation>
    <collation id="55" parent="1" name="koi8r_general_ci">
      <Charset>koi8r</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="56" parent="1" name="koi8r_bin">
      <Charset>koi8r</Charset>
    </collation>
    <collation id="57" parent="1" name="koi8u_general_ci">
      <Charset>koi8u</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="58" parent="1" name="koi8u_bin">
      <Charset>koi8u</Charset>
    </collation>
    <collation id="59" parent="1" name="latin1_german1_ci">
      <Charset>latin1</Charset>
    </collation>
    <collation id="60" parent="1" name="latin1_swedish_ci">
      <Charset>latin1</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="61" parent="1" name="latin1_danish_ci">
      <Charset>latin1</Charset>
    </collation>
    <collation id="62" parent="1" name="latin1_german2_ci">
      <Charset>latin1</Charset>
    </collation>
    <collation id="63" parent="1" name="latin1_bin">
      <Charset>latin1</Charset>
    </collation>
    <collation id="64" parent="1" name="latin1_general_ci">
      <Charset>latin1</Charset>
    </collation>
    <collation id="65" parent="1" name="latin1_general_cs">
      <Charset>latin1</Charset>
    </collation>
    <collation id="66" parent="1" name="latin1_spanish_ci">
      <Charset>latin1</Charset>
    </collation>
    <collation id="67" parent="1" name="latin2_czech_cs">
      <Charset>latin2</Charset>
    </collation>
    <collation id="68" parent="1" name="latin2_general_ci">
      <Charset>latin2</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="69" parent="1" name="latin2_hungarian_ci">
      <Charset>latin2</Charset>
    </collation>
    <collation id="70" parent="1" name="latin2_croatian_ci">
      <Charset>latin2</Charset>
    </collation>
    <collation id="71" parent="1" name="latin2_bin">
      <Charset>latin2</Charset>
    </collation>
    <collation id="72" parent="1" name="latin5_turkish_ci">
      <Charset>latin5</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="73" parent="1" name="latin5_bin">
      <Charset>latin5</Charset>
    </collation>
    <collation id="74" parent="1" name="latin7_estonian_cs">
      <Charset>latin7</Charset>
    </collation>
    <collation id="75" parent="1" name="latin7_general_ci">
      <Charset>latin7</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="76" parent="1" name="latin7_general_cs">
      <Charset>latin7</Charset>
    </collation>
    <collation id="77" parent="1" name="latin7_bin">
      <Charset>latin7</Charset>
    </collation>
    <collation id="78" parent="1" name="macce_general_ci">
      <Charset>macce</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="79" parent="1" name="macce_bin">
      <Charset>macce</Charset>
    </collation>
    <collation id="80" parent="1" name="macroman_general_ci">
      <Charset>macroman</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="81" parent="1" name="macroman_bin">
      <Charset>macroman</Charset>
    </collation>
    <collation id="82" parent="1" name="sjis_japanese_ci">
      <Charset>sjis</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="83" parent="1" name="sjis_bin">
      <Charset>sjis</Charset>
    </collation>
    <collation id="84" parent="1" name="swe7_swedish_ci">
      <Charset>swe7</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="85" parent="1" name="swe7_bin">
      <Charset>swe7</Charset>
    </collation>
    <collation id="86" parent="1" name="tis620_thai_ci">
      <Charset>tis620</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="87" parent="1" name="tis620_bin">
      <Charset>tis620</Charset>
    </collation>
    <collation id="88" parent="1" name="ucs2_general_ci">
      <Charset>ucs2</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="89" parent="1" name="ucs2_bin">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="90" parent="1" name="ucs2_unicode_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="91" parent="1" name="ucs2_icelandic_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="92" parent="1" name="ucs2_latvian_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="93" parent="1" name="ucs2_romanian_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="94" parent="1" name="ucs2_slovenian_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="95" parent="1" name="ucs2_polish_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="96" parent="1" name="ucs2_estonian_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="97" parent="1" name="ucs2_spanish_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="98" parent="1" name="ucs2_swedish_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="99" parent="1" name="ucs2_turkish_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="100" parent="1" name="ucs2_czech_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="101" parent="1" name="ucs2_danish_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="102" parent="1" name="ucs2_lithuanian_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="103" parent="1" name="ucs2_slovak_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="104" parent="1" name="ucs2_spanish2_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="105" parent="1" name="ucs2_roman_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="106" parent="1" name="ucs2_persian_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="107" parent="1" name="ucs2_esperanto_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="108" parent="1" name="ucs2_hungarian_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="109" parent="1" name="ucs2_sinhala_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="110" parent="1" name="ucs2_german2_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="111" parent="1" name="ucs2_croatian_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="112" parent="1" name="ucs2_unicode_520_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="113" parent="1" name="ucs2_vietnamese_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="114" parent="1" name="ucs2_general_mysql500_ci">
      <Charset>ucs2</Charset>
    </collation>
    <collation id="115" parent="1" name="ujis_japanese_ci">
      <Charset>ujis</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="116" parent="1" name="ujis_bin">
      <Charset>ujis</Charset>
    </collation>
    <collation id="117" parent="1" name="utf16_general_ci">
      <Charset>utf16</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="118" parent="1" name="utf16_bin">
      <Charset>utf16</Charset>
    </collation>
    <collation id="119" parent="1" name="utf16_unicode_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="120" parent="1" name="utf16_icelandic_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="121" parent="1" name="utf16_latvian_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="122" parent="1" name="utf16_romanian_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="123" parent="1" name="utf16_slovenian_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="124" parent="1" name="utf16_polish_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="125" parent="1" name="utf16_estonian_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="126" parent="1" name="utf16_spanish_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="127" parent="1" name="utf16_swedish_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="128" parent="1" name="utf16_turkish_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="129" parent="1" name="utf16_czech_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="130" parent="1" name="utf16_danish_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="131" parent="1" name="utf16_lithuanian_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="132" parent="1" name="utf16_slovak_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="133" parent="1" name="utf16_spanish2_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="134" parent="1" name="utf16_roman_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="135" parent="1" name="utf16_persian_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="136" parent="1" name="utf16_esperanto_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="137" parent="1" name="utf16_hungarian_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="138" parent="1" name="utf16_sinhala_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="139" parent="1" name="utf16_german2_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="140" parent="1" name="utf16_croatian_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="141" parent="1" name="utf16_unicode_520_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="142" parent="1" name="utf16_vietnamese_ci">
      <Charset>utf16</Charset>
    </collation>
    <collation id="143" parent="1" name="utf16le_general_ci">
      <Charset>utf16le</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="144" parent="1" name="utf16le_bin">
      <Charset>utf16le</Charset>
    </collation>
    <collation id="145" parent="1" name="utf32_general_ci">
      <Charset>utf32</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="146" parent="1" name="utf32_bin">
      <Charset>utf32</Charset>
    </collation>
    <collation id="147" parent="1" name="utf32_unicode_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="148" parent="1" name="utf32_icelandic_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="149" parent="1" name="utf32_latvian_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="150" parent="1" name="utf32_romanian_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="151" parent="1" name="utf32_slovenian_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="152" parent="1" name="utf32_polish_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="153" parent="1" name="utf32_estonian_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="154" parent="1" name="utf32_spanish_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="155" parent="1" name="utf32_swedish_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="156" parent="1" name="utf32_turkish_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="157" parent="1" name="utf32_czech_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="158" parent="1" name="utf32_danish_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="159" parent="1" name="utf32_lithuanian_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="160" parent="1" name="utf32_slovak_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="161" parent="1" name="utf32_spanish2_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="162" parent="1" name="utf32_roman_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="163" parent="1" name="utf32_persian_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="164" parent="1" name="utf32_esperanto_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="165" parent="1" name="utf32_hungarian_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="166" parent="1" name="utf32_sinhala_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="167" parent="1" name="utf32_german2_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="168" parent="1" name="utf32_croatian_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="169" parent="1" name="utf32_unicode_520_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="170" parent="1" name="utf32_vietnamese_ci">
      <Charset>utf32</Charset>
    </collation>
    <collation id="171" parent="1" name="utf8mb3_general_ci">
      <Charset>utf8mb3</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="172" parent="1" name="utf8mb3_tolower_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="173" parent="1" name="utf8mb3_bin">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="174" parent="1" name="utf8mb3_unicode_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="175" parent="1" name="utf8mb3_icelandic_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="176" parent="1" name="utf8mb3_latvian_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="177" parent="1" name="utf8mb3_romanian_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="178" parent="1" name="utf8mb3_slovenian_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="179" parent="1" name="utf8mb3_polish_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="180" parent="1" name="utf8mb3_estonian_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="181" parent="1" name="utf8mb3_spanish_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="182" parent="1" name="utf8mb3_swedish_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="183" parent="1" name="utf8mb3_turkish_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="184" parent="1" name="utf8mb3_czech_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="185" parent="1" name="utf8mb3_danish_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="186" parent="1" name="utf8mb3_lithuanian_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="187" parent="1" name="utf8mb3_slovak_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="188" parent="1" name="utf8mb3_spanish2_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="189" parent="1" name="utf8mb3_roman_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="190" parent="1" name="utf8mb3_persian_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="191" parent="1" name="utf8mb3_esperanto_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="192" parent="1" name="utf8mb3_hungarian_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="193" parent="1" name="utf8mb3_sinhala_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="194" parent="1" name="utf8mb3_german2_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="195" parent="1" name="utf8mb3_croatian_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="196" parent="1" name="utf8mb3_unicode_520_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="197" parent="1" name="utf8mb3_vietnamese_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="198" parent="1" name="utf8mb3_general_mysql500_ci">
      <Charset>utf8mb3</Charset>
    </collation>
    <collation id="199" parent="1" name="utf8mb4_general_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="200" parent="1" name="utf8mb4_bin">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="201" parent="1" name="utf8mb4_unicode_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="202" parent="1" name="utf8mb4_icelandic_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="203" parent="1" name="utf8mb4_latvian_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="204" parent="1" name="utf8mb4_romanian_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="205" parent="1" name="utf8mb4_slovenian_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="206" parent="1" name="utf8mb4_polish_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="207" parent="1" name="utf8mb4_estonian_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="208" parent="1" name="utf8mb4_spanish_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="209" parent="1" name="utf8mb4_swedish_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="210" parent="1" name="utf8mb4_turkish_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="211" parent="1" name="utf8mb4_czech_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="212" parent="1" name="utf8mb4_danish_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="213" parent="1" name="utf8mb4_lithuanian_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="214" parent="1" name="utf8mb4_slovak_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="215" parent="1" name="utf8mb4_spanish2_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="216" parent="1" name="utf8mb4_roman_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="217" parent="1" name="utf8mb4_persian_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="218" parent="1" name="utf8mb4_esperanto_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="219" parent="1" name="utf8mb4_hungarian_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="220" parent="1" name="utf8mb4_sinhala_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="221" parent="1" name="utf8mb4_german2_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="222" parent="1" name="utf8mb4_croatian_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="223" parent="1" name="utf8mb4_unicode_520_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="224" parent="1" name="utf8mb4_vietnamese_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="225" parent="1" name="utf8mb4_0900_ai_ci">
      <Charset>utf8mb4</Charset>
      <DefaultForCharset>1</DefaultForCharset>
    </collation>
    <collation id="226" parent="1" name="utf8mb4_de_pb_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="227" parent="1" name="utf8mb4_is_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="228" parent="1" name="utf8mb4_lv_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="229" parent="1" name="utf8mb4_ro_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="230" parent="1" name="utf8mb4_sl_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="231" parent="1" name="utf8mb4_pl_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="232" parent="1" name="utf8mb4_et_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="233" parent="1" name="utf8mb4_es_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="234" parent="1" name="utf8mb4_sv_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="235" parent="1" name="utf8mb4_tr_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="236" parent="1" name="utf8mb4_cs_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="237" parent="1" name="utf8mb4_da_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="238" parent="1" name="utf8mb4_lt_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="239" parent="1" name="utf8mb4_sk_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="240" parent="1" name="utf8mb4_es_trad_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="241" parent="1" name="utf8mb4_la_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="242" parent="1" name="utf8mb4_eo_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="243" parent="1" name="utf8mb4_hu_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="244" parent="1" name="utf8mb4_hr_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="245" parent="1" name="utf8mb4_vi_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="246" parent="1" name="utf8mb4_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="247" parent="1" name="utf8mb4_de_pb_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="248" parent="1" name="utf8mb4_is_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="249" parent="1" name="utf8mb4_lv_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="250" parent="1" name="utf8mb4_ro_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="251" parent="1" name="utf8mb4_sl_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="252" parent="1" name="utf8mb4_pl_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="253" parent="1" name="utf8mb4_et_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="254" parent="1" name="utf8mb4_es_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="255" parent="1" name="utf8mb4_sv_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="256" parent="1" name="utf8mb4_tr_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="257" parent="1" name="utf8mb4_cs_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="258" parent="1" name="utf8mb4_da_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="259" parent="1" name="utf8mb4_lt_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="260" parent="1" name="utf8mb4_sk_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="261" parent="1" name="utf8mb4_es_trad_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="262" parent="1" name="utf8mb4_la_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="263" parent="1" name="utf8mb4_eo_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="264" parent="1" name="utf8mb4_hu_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="265" parent="1" name="utf8mb4_hr_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="266" parent="1" name="utf8mb4_vi_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="267" parent="1" name="utf8mb4_ja_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="268" parent="1" name="utf8mb4_ja_0900_as_cs_ks">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="269" parent="1" name="utf8mb4_0900_as_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="270" parent="1" name="utf8mb4_ru_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="271" parent="1" name="utf8mb4_ru_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="272" parent="1" name="utf8mb4_zh_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="273" parent="1" name="utf8mb4_0900_bin">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="274" parent="1" name="utf8mb4_nb_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="275" parent="1" name="utf8mb4_nb_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="276" parent="1" name="utf8mb4_nn_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="277" parent="1" name="utf8mb4_nn_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="278" parent="1" name="utf8mb4_sr_latn_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="279" parent="1" name="utf8mb4_sr_latn_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="280" parent="1" name="utf8mb4_bs_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="281" parent="1" name="utf8mb4_bs_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="282" parent="1" name="utf8mb4_bg_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="283" parent="1" name="utf8mb4_bg_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="284" parent="1" name="utf8mb4_gl_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="285" parent="1" name="utf8mb4_gl_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="286" parent="1" name="utf8mb4_mn_cyrl_0900_ai_ci">
      <Charset>utf8mb4</Charset>
    </collation>
    <collation id="287" parent="1" name="utf8mb4_mn_cyrl_0900_as_cs">
      <Charset>utf8mb4</Charset>
    </collation>
    <schema id="288" parent="1" name="mysql">
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </schema>
    <schema id="289" parent="1" name="information_schema">
      <CollationName>utf8mb3_general_ci</CollationName>
    </schema>
    <schema id="290" parent="1" name="performance_schema">
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </schema>
    <schema id="291" parent="1" name="sys">
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </schema>
    <schema id="292" parent="1" name="orders">
      <Current>1</Current>
      <LastIntrospectionLocalTimestamp>2025-03-15.12:13:18</LastIntrospectionLocalTimestamp>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </schema>
    <user id="293" parent="1" name="root">
      <Plugin>caching_sha2_password</Plugin>
    </user>
    <user id="294" parent="1" name="mysql.infoschema">
      <CanLogin>0</CanLogin>
      <Host>localhost</Host>
      <Plugin>caching_sha2_password</Plugin>
    </user>
    <user id="295" parent="1" name="mysql.session">
      <CanLogin>0</CanLogin>
      <Host>localhost</Host>
      <Plugin>caching_sha2_password</Plugin>
    </user>
    <user id="296" parent="1" name="mysql.sys">
      <CanLogin>0</CanLogin>
      <Host>localhost</Host>
      <Plugin>caching_sha2_password</Plugin>
    </user>
    <user id="297" parent="1" name="root">
      <Host>localhost</Host>
      <Plugin>caching_sha2_password</Plugin>
    </user>
    <table id="298" parent="292" name="category">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="299" parent="292" name="category_item">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="300" parent="292" name="category_seq">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="301" parent="292" name="delivery">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="302" parent="292" name="delivery_seq">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="303" parent="292" name="item">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="304" parent="292" name="item_seq">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="305" parent="292" name="member">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="306" parent="292" name="member_seq">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="307" parent="292" name="order_item">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="308" parent="292" name="order_item_seq">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="309" parent="292" name="orders">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <table id="310" parent="292" name="orders_seq">
      <Engine>InnoDB</Engine>
      <CollationName>utf8mb4_0900_ai_ci</CollationName>
    </table>
    <column id="311" parent="298" name="category_id">
      <NotNull>1</NotNull>
      <Position>1</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="312" parent="298" name="parent_id">
      <Position>2</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="313" parent="298" name="name">
      <Position>3</Position>
      <StoredType>varchar(255)|0s</StoredType>
    </column>
    <foreign-key id="314" parent="298" name="FK2y94svpmqttx80mshyny85wqr">
      <ColNames>parent_id</ColNames>
      <RefColNames>category_id</RefColNames>
      <RefTableName>category</RefTableName>
    </foreign-key>
    <index id="315" parent="298" name="PRIMARY">
      <ColNames>category_id</ColNames>
      <Type>btree</Type>
      <Unique>1</Unique>
    </index>
    <index id="316" parent="298" name="FK2y94svpmqttx80mshyny85wqr">
      <ColNames>parent_id</ColNames>
      <Type>btree</Type>
    </index>
    <key id="317" parent="298" name="PRIMARY">
      <NameSurrogate>1</NameSurrogate>
      <Primary>1</Primary>
      <UnderlyingIndexName>PRIMARY</UnderlyingIndexName>
    </key>
    <column id="318" parent="299" name="category_id">
      <NotNull>1</NotNull>
      <Position>1</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="319" parent="299" name="item_id">
      <NotNull>1</NotNull>
      <Position>2</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <foreign-key id="320" parent="299" name="FKcq2n0opf5shyh84ex1fhukcbh">
      <ColNames>category_id</ColNames>
      <RefColNames>category_id</RefColNames>
      <RefTableName>category</RefTableName>
    </foreign-key>
    <foreign-key id="321" parent="299" name="FKu8b4lwqutcdq3363gf6mlujq">
      <ColNames>item_id</ColNames>
      <RefColNames>item_id</RefColNames>
      <RefTableName>item</RefTableName>
    </foreign-key>
    <index id="322" parent="299" name="FKcq2n0opf5shyh84ex1fhukcbh">
      <ColNames>category_id</ColNames>
      <Type>btree</Type>
    </index>
    <index id="323" parent="299" name="FKu8b4lwqutcdq3363gf6mlujq">
      <ColNames>item_id</ColNames>
      <Type>btree</Type>
    </index>
    <column id="324" parent="300" name="next_val">
      <Position>1</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="325" parent="301" name="delivery_id">
      <NotNull>1</NotNull>
      <Position>1</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="326" parent="301" name="city">
      <Position>2</Position>
      <StoredType>varchar(255)|0s</StoredType>
    </column>
    <column id="327" parent="301" name="street">
      <Position>3</Position>
      <StoredType>varchar(255)|0s</StoredType>
    </column>
    <column id="328" parent="301" name="zipcode">
      <Position>4</Position>
      <StoredType>varchar(255)|0s</StoredType>
    </column>
    <column id="329" parent="301" name="status">
      <Position>5</Position>
      <StoredType>enum(&apos;COMP&apos;, &apos;READY&apos;)|0e</StoredType>
    </column>
    <index id="330" parent="301" name="PRIMARY">
      <ColNames>delivery_id</ColNames>
      <Type>btree</Type>
      <Unique>1</Unique>
    </index>
    <key id="331" parent="301" name="PRIMARY">
      <NameSurrogate>1</NameSurrogate>
      <Primary>1</Primary>
      <UnderlyingIndexName>PRIMARY</UnderlyingIndexName>
    </key>
    <column id="332" parent="302" name="next_val">
      <Position>1</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="333" parent="303" name="price">
      <NotNull>1</NotNull>
      <Position>1</Position>
      <StoredType>int|0s</StoredType>
    </column>
    <column id="334" parent="303" name="stock_quantity">
      <NotNull>1</NotNull>
      <Position>2</Position>
      <StoredType>int|0s</StoredType>
    </column>
    <column id="335" parent="303" name="item_id">
      <NotNull>1</NotNull>
      <Position>3</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="336" parent="303" name="name">
      <Position>4</Position>
      <StoredType>varchar(255)|0s</StoredType>
    </column>
    <index id="337" parent="303" name="PRIMARY">
      <ColNames>item_id</ColNames>
      <Type>btree</Type>
      <Unique>1</Unique>
    </index>
    <key id="338" parent="303" name="PRIMARY">
      <NameSurrogate>1</NameSurrogate>
      <Primary>1</Primary>
      <UnderlyingIndexName>PRIMARY</UnderlyingIndexName>
    </key>
    <column id="339" parent="304" name="next_val">
      <Position>1</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="340" parent="305" name="member_id">
      <NotNull>1</NotNull>
      <Position>1</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="341" parent="305" name="city">
      <Position>2</Position>
      <StoredType>varchar(255)|0s</StoredType>
    </column>
    <column id="342" parent="305" name="name">
      <Position>3</Position>
      <StoredType>varchar(255)|0s</StoredType>
    </column>
    <column id="343" parent="305" name="street">
      <Position>4</Position>
      <StoredType>varchar(255)|0s</StoredType>
    </column>
    <column id="344" parent="305" name="zipcode">
      <Position>5</Position>
      <StoredType>varchar(255)|0s</StoredType>
    </column>
    <index id="345" parent="305" name="PRIMARY">
      <ColNames>member_id</ColNames>
      <Type>btree</Type>
      <Unique>1</Unique>
    </index>
    <key id="346" parent="305" name="PRIMARY">
      <NameSurrogate>1</NameSurrogate>
      <Primary>1</Primary>
      <UnderlyingIndexName>PRIMARY</UnderlyingIndexName>
    </key>
    <column id="347" parent="306" name="next_val">
      <Position>1</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="348" parent="307" name="count">
      <NotNull>1</NotNull>
      <Position>1</Position>
      <StoredType>int|0s</StoredType>
    </column>
    <column id="349" parent="307" name="order_price">
      <NotNull>1</NotNull>
      <Position>2</Position>
      <StoredType>int|0s</StoredType>
    </column>
    <column id="350" parent="307" name="item_id">
      <Position>3</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="351" parent="307" name="order_id">
      <Position>4</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="352" parent="307" name="order_item_id">
      <NotNull>1</NotNull>
      <Position>5</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <foreign-key id="353" parent="307" name="FKija6hjjiit8dprnmvtvgdp6ru">
      <ColNames>item_id</ColNames>
      <RefColNames>item_id</RefColNames>
      <RefTableName>item</RefTableName>
    </foreign-key>
    <foreign-key id="354" parent="307" name="FKt4dc2r9nbvbujrljv3e23iibt">
      <ColNames>order_id</ColNames>
      <RefColNames>order_id</RefColNames>
      <RefTableName>orders</RefTableName>
    </foreign-key>
    <index id="355" parent="307" name="PRIMARY">
      <ColNames>order_item_id</ColNames>
      <Type>btree</Type>
      <Unique>1</Unique>
    </index>
    <index id="356" parent="307" name="FKija6hjjiit8dprnmvtvgdp6ru">
      <ColNames>item_id</ColNames>
      <Type>btree</Type>
    </index>
    <index id="357" parent="307" name="FKt4dc2r9nbvbujrljv3e23iibt">
      <ColNames>order_id</ColNames>
      <Type>btree</Type>
    </index>
    <key id="358" parent="307" name="PRIMARY">
      <NameSurrogate>1</NameSurrogate>
      <Primary>1</Primary>
      <UnderlyingIndexName>PRIMARY</UnderlyingIndexName>
    </key>
    <column id="359" parent="308" name="next_val">
      <Position>1</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="360" parent="309" name="delivery_id">
      <Position>1</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="361" parent="309" name="member_id">
      <Position>2</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="362" parent="309" name="order_date">
      <Position>3</Position>
      <StoredType>datetime(6)|0s</StoredType>
    </column>
    <column id="363" parent="309" name="order_id">
      <NotNull>1</NotNull>
      <Position>4</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
    <column id="364" parent="309" name="status">
      <Position>5</Position>
      <StoredType>enum(&apos;CANCEL&apos;, &apos;ORDER&apos;)|0e</StoredType>
    </column>
    <foreign-key id="365" parent="309" name="FKtkrur7wg4d8ax0pwgo0vmy20c">
      <ColNames>delivery_id</ColNames>
      <RefColNames>delivery_id</RefColNames>
      <RefTableName>delivery</RefTableName>
    </foreign-key>
    <foreign-key id="366" parent="309" name="FKpktxwhj3x9m4gth5ff6bkqgeb">
      <ColNames>member_id</ColNames>
      <RefColNames>member_id</RefColNames>
      <RefTableName>member</RefTableName>
    </foreign-key>
    <index id="367" parent="309" name="UK9ct0l8xfeaiqruabcqjh1neui">
      <ColNames>delivery_id</ColNames>
      <Type>btree</Type>
      <Unique>1</Unique>
    </index>
    <index id="368" parent="309" name="PRIMARY">
      <ColNames>order_id</ColNames>
      <Type>btree</Type>
      <Unique>1</Unique>
    </index>
    <index id="369" parent="309" name="FKpktxwhj3x9m4gth5ff6bkqgeb">
      <ColNames>member_id</ColNames>
      <Type>btree</Type>
    </index>
    <key id="370" parent="309" name="PRIMARY">
      <NameSurrogate>1</NameSurrogate>
      <Primary>1</Primary>
      <UnderlyingIndexName>PRIMARY</UnderlyingIndexName>
    </key>
    <key id="371" parent="309" name="UK9ct0l8xfeaiqruabcqjh1neui">
      <UnderlyingIndexName>UK9ct0l8xfeaiqruabcqjh1neui</UnderlyingIndexName>
    </key>
    <column id="372" parent="310" name="next_val">
      <Position>1</Position>
      <StoredType>bigint|0s</StoredType>
    </column>
  </database-model>
</dataSource>
```

# .idea/dataSources/38aab27b-2ce7-4876-a936-fe1a31b8cc8c/storage_v2/_src_/schema/orders.5WLfww.meta

```meta
#n:orders
!<md> [0, 0, null, null, -2147483648, -2147483648]

```

# .idea/gradle.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="GradleMigrationSettings" migrationVersion="1" />
  <component name="GradleSettings">
    <option name="linkedExternalProjectsSettings">
      <GradleProjectSettings>
        <option name="delegatedBuild" value="false" />
        <option name="testRunner" value="PLATFORM" />
        <option name="externalProjectPath" value="$PROJECT_DIR$" />
        <option name="gradleJvm" value="homebrew-17" />
        <option name="modules">
          <set>
            <option value="$PROJECT_DIR$" />
          </set>
        </option>
      </GradleProjectSettings>
    </option>
  </component>
</project>
```

# .idea/jarRepositories.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="RemoteRepositoriesConfiguration">
    <remote-repository>
      <option name="id" value="central" />
      <option name="name" value="Maven Central repository" />
      <option name="url" value="https://repo1.maven.org/maven2" />
    </remote-repository>
    <remote-repository>
      <option name="id" value="jboss.community" />
      <option name="name" value="JBoss Community repository" />
      <option name="url" value="https://repository.jboss.org/nexus/content/repositories/public/" />
    </remote-repository>
    <remote-repository>
      <option name="id" value="MavenRepo" />
      <option name="name" value="MavenRepo" />
      <option name="url" value="https://repo.maven.apache.org/maven2/" />
    </remote-repository>
  </component>
</project>
```

# .idea/misc.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="ExternalStorageConfigurationManager" enabled="true" />
  <component name="FrameworkDetectionExcludesConfiguration">
    <file type="web" url="file://$PROJECT_DIR$" />
  </component>
  <component name="ProjectRootManager" version="2" languageLevel="JDK_17" project-jdk-name="openjdk-23" project-jdk-type="JavaSDK" />
</project>
```

# .idea/modules.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="ProjectModuleManager">
    <modules>
      <module fileurl="file://$PROJECT_DIR$/.idea/modules/order.main.iml" filepath="$PROJECT_DIR$/.idea/modules/order.main.iml" />
    </modules>
  </component>
</project>
```

# .idea/modules/order.main.iml

```iml
<?xml version="1.0" encoding="UTF-8"?>
<module version="4">
  <component name="AdditionalModuleElements">
    <content url="file://$MODULE_DIR$/../../src/main" dumb="true">
      <sourceFolder url="file://$MODULE_DIR$/../../src/main/resources" type="java-resource" />
    </content>
  </component>
</module>
```

# .idea/uiDesigner.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="Palette2">
    <group name="Swing">
      <item class="com.intellij.uiDesigner.HSpacer" tooltip-text="Horizontal Spacer" icon="/com/intellij/uiDesigner/icons/hspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">
        <default-constraints vsize-policy="1" hsize-policy="6" anchor="0" fill="1" />
      </item>
      <item class="com.intellij.uiDesigner.VSpacer" tooltip-text="Vertical Spacer" icon="/com/intellij/uiDesigner/icons/vspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">
        <default-constraints vsize-policy="6" hsize-policy="1" anchor="0" fill="2" />
      </item>
      <item class="javax.swing.JPanel" icon="/com/intellij/uiDesigner/icons/panel.svg" removable="false" auto-create-binding="false" can-attach-label="false">
        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3" />
      </item>
      <item class="javax.swing.JScrollPane" icon="/com/intellij/uiDesigner/icons/scrollPane.svg" removable="false" auto-create-binding="false" can-attach-label="true">
        <default-constraints vsize-policy="7" hsize-policy="7" anchor="0" fill="3" />
      </item>
      <item class="javax.swing.JButton" icon="/com/intellij/uiDesigner/icons/button.svg" removable="false" auto-create-binding="true" can-attach-label="false">
        <default-constraints vsize-policy="0" hsize-policy="3" anchor="0" fill="1" />
        <initial-values>
          <property name="text" value="Button" />
        </initial-values>
      </item>
      <item class="javax.swing.JRadioButton" icon="/com/intellij/uiDesigner/icons/radioButton.svg" removable="false" auto-create-binding="true" can-attach-label="false">
        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />
        <initial-values>
          <property name="text" value="RadioButton" />
        </initial-values>
      </item>
      <item class="javax.swing.JCheckBox" icon="/com/intellij/uiDesigner/icons/checkBox.svg" removable="false" auto-create-binding="true" can-attach-label="false">
        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />
        <initial-values>
          <property name="text" value="CheckBox" />
        </initial-values>
      </item>
      <item class="javax.swing.JLabel" icon="/com/intellij/uiDesigner/icons/label.svg" removable="false" auto-create-binding="false" can-attach-label="false">
        <default-constraints vsize-policy="0" hsize-policy="0" anchor="8" fill="0" />
        <initial-values>
          <property name="text" value="Label" />
        </initial-values>
      </item>
      <item class="javax.swing.JTextField" icon="/com/intellij/uiDesigner/icons/textField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
          <preferred-size width="150" height="-1" />
        </default-constraints>
      </item>
      <item class="javax.swing.JPasswordField" icon="/com/intellij/uiDesigner/icons/passwordField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
          <preferred-size width="150" height="-1" />
        </default-constraints>
      </item>
      <item class="javax.swing.JFormattedTextField" icon="/com/intellij/uiDesigner/icons/formattedTextField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
          <preferred-size width="150" height="-1" />
        </default-constraints>
      </item>
      <item class="javax.swing.JTextArea" icon="/com/intellij/uiDesigner/icons/textArea.svg" removable="false" auto-create-binding="true" can-attach-label="true">
        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
          <preferred-size width="150" height="50" />
        </default-constraints>
      </item>
      <item class="javax.swing.JTextPane" icon="/com/intellij/uiDesigner/icons/textPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">
        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
          <preferred-size width="150" height="50" />
        </default-constraints>
      </item>
      <item class="javax.swing.JEditorPane" icon="/com/intellij/uiDesigner/icons/editorPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">
        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
          <preferred-size width="150" height="50" />
        </default-constraints>
      </item>
      <item class="javax.swing.JComboBox" icon="/com/intellij/uiDesigner/icons/comboBox.svg" removable="false" auto-create-binding="true" can-attach-label="true">
        <default-constraints vsize-policy="0" hsize-policy="2" anchor="8" fill="1" />
      </item>
      <item class="javax.swing.JTable" icon="/com/intellij/uiDesigner/icons/table.svg" removable="false" auto-create-binding="true" can-attach-label="false">
        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
          <preferred-size width="150" height="50" />
        </default-constraints>
      </item>
      <item class="javax.swing.JList" icon="/com/intellij/uiDesigner/icons/list.svg" removable="false" auto-create-binding="true" can-attach-label="false">
        <default-constraints vsize-policy="6" hsize-policy="2" anchor="0" fill="3">
          <preferred-size width="150" height="50" />
        </default-constraints>
      </item>
      <item class="javax.swing.JTree" icon="/com/intellij/uiDesigner/icons/tree.svg" removable="false" auto-create-binding="true" can-attach-label="false">
        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
          <preferred-size width="150" height="50" />
        </default-constraints>
      </item>
      <item class="javax.swing.JTabbedPane" icon="/com/intellij/uiDesigner/icons/tabbedPane.svg" removable="false" auto-create-binding="true" can-attach-label="false">
        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">
          <preferred-size width="200" height="200" />
        </default-constraints>
      </item>
      <item class="javax.swing.JSplitPane" icon="/com/intellij/uiDesigner/icons/splitPane.svg" removable="false" auto-create-binding="false" can-attach-label="false">
        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">
          <preferred-size width="200" height="200" />
        </default-constraints>
      </item>
      <item class="javax.swing.JSpinner" icon="/com/intellij/uiDesigner/icons/spinner.svg" removable="false" auto-create-binding="true" can-attach-label="true">
        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />
      </item>
      <item class="javax.swing.JSlider" icon="/com/intellij/uiDesigner/icons/slider.svg" removable="false" auto-create-binding="true" can-attach-label="false">
        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />
      </item>
      <item class="javax.swing.JSeparator" icon="/com/intellij/uiDesigner/icons/separator.svg" removable="false" auto-create-binding="false" can-attach-label="false">
        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3" />
      </item>
      <item class="javax.swing.JProgressBar" icon="/com/intellij/uiDesigner/icons/progressbar.svg" removable="false" auto-create-binding="true" can-attach-label="false">
        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1" />
      </item>
      <item class="javax.swing.JToolBar" icon="/com/intellij/uiDesigner/icons/toolbar.svg" removable="false" auto-create-binding="false" can-attach-label="false">
        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1">
          <preferred-size width="-1" height="20" />
        </default-constraints>
      </item>
      <item class="javax.swing.JToolBar$Separator" icon="/com/intellij/uiDesigner/icons/toolbarSeparator.svg" removable="false" auto-create-binding="false" can-attach-label="false">
        <default-constraints vsize-policy="0" hsize-policy="0" anchor="0" fill="1" />
      </item>
      <item class="javax.swing.JScrollBar" icon="/com/intellij/uiDesigner/icons/scrollbar.svg" removable="false" auto-create-binding="true" can-attach-label="false">
        <default-constraints vsize-policy="6" hsize-policy="0" anchor="0" fill="2" />
      </item>
    </group>
  </component>
</project>
```

# .idea/vcs.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="VcsDirectoryMappings">
    <mapping directory="" vcs="Git" />
  </component>
</project>
```

# .idea/workspace.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="AutoImportSettings">
    <option name="autoReloadType" value="SELECTIVE" />
  </component>
  <component name="ChangeListManager">
    <list default="true" id="664e1888-5808-4e0c-938f-28f5980f12df" name="Changes" comment="[refactor] REST API 스타일에 맞춰 리팩토링">
      <change afterPath="$PROJECT_DIR$/src/main/java/com/jwj/order/exception/LockAcquisitionException.java" afterDir="false" />
      <change afterPath="$PROJECT_DIR$/src/main/java/com/jwj/order/rabbitmq/LockRepository.java" afterDir="false" />
      <change afterPath="$PROJECT_DIR$/src/main/java/com/jwj/order/rabbitmq/OrderConsumer.java" afterDir="false" />
      <change afterPath="$PROJECT_DIR$/src/main/java/com/jwj/order/rabbitmq/OrderPublisher.java" afterDir="false" />
      <change afterPath="$PROJECT_DIR$/src/main/java/com/jwj/order/rabbitmq/RabbitMqConfig.java" afterDir="false" />
      <change afterPath="$PROJECT_DIR$/src/test/java/com/jwj/order/service/OrderServiceTest.java" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/build.gradle" beforeDir="false" afterPath="$PROJECT_DIR$/build.gradle" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/codebase.md" beforeDir="false" afterPath="$PROJECT_DIR$/codebase.md" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/docker-compose.yml" beforeDir="false" afterPath="$PROJECT_DIR$/docker-compose.yml" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/src/main/java/com/jwj/order/controller/OrderController.java" beforeDir="false" afterPath="$PROJECT_DIR$/src/main/java/com/jwj/order/controller/OrderController.java" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/src/main/java/com/jwj/order/domain/Item.java" beforeDir="false" afterPath="$PROJECT_DIR$/src/main/java/com/jwj/order/domain/Item.java" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/src/main/java/com/jwj/order/domain/Order.java" beforeDir="false" afterPath="$PROJECT_DIR$/src/main/java/com/jwj/order/domain/Order.java" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/src/main/java/com/jwj/order/repository/ItemRepository.java" beforeDir="false" afterPath="$PROJECT_DIR$/src/main/java/com/jwj/order/repository/ItemRepository.java" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/src/main/java/com/jwj/order/service/OrderService.java" beforeDir="false" afterPath="$PROJECT_DIR$/src/main/java/com/jwj/order/service/OrderService.java" afterDir="false" />
      <change beforePath="$PROJECT_DIR$/src/main/java/com/jwj/order/util/InitDb.java" beforeDir="false" afterPath="$PROJECT_DIR$/src/main/java/com/jwj/order/util/InitDb.java" afterDir="false" />
    </list>
    <option name="SHOW_DIALOG" value="false" />
    <option name="HIGHLIGHT_CONFLICTS" value="true" />
    <option name="HIGHLIGHT_NON_ACTIVE_CHANGELIST" value="false" />
    <option name="LAST_RESOLUTION" value="IGNORE" />
  </component>
  <component name="ExternalProjectsData">
    <projectState path="$PROJECT_DIR$">
      <ProjectState />
    </projectState>
  </component>
  <component name="ExternalProjectsManager">
    <system id="GRADLE">
      <state>
        <projects_view>
          <tree_state>
            <expand>
              <path>
                <item name="" type="6a2764b6:ExternalProjectsStructure$RootNode" />
                <item name="order" type="f1a62948:ProjectNode" />
              </path>
            </expand>
            <select />
          </tree_state>
        </projects_view>
      </state>
    </system>
  </component>
  <component name="FileTemplateManagerImpl">
    <option name="RECENT_TEMPLATES">
      <list>
        <option value="JUnit5 Test Class" />
        <option value="Class" />
      </list>
    </option>
  </component>
  <component name="Git.Settings">
    <option name="RECENT_GIT_ROOT_PATH" value="$PROJECT_DIR$" />
  </component>
  <component name="KubernetesApiPersistence">{}</component>
  <component name="KubernetesApiProvider">{
  &quot;isMigrated&quot;: true
}</component>
  <component name="ProjectColorInfo">{
  &quot;associatedIndex&quot;: 7
}</component>
  <component name="ProjectId" id="2uINV43MgyDJENjw9IUhVz25Od0" />
  <component name="ProjectViewState">
    <option name="autoscrollToSource" value="true" />
    <option name="openDirectoriesWithSingleClick" value="true" />
    <option name="showLibraryContents" value="true" />
    <option name="showScratchesAndConsoles" value="false" />
    <option name="sortByType" value="true" />
    <option name="sortKey" value="BY_TYPE" />
  </component>
  <component name="PropertiesComponent"><![CDATA[{
  "keyToString": {
    "Gradle.Build Order-System.executor": "Run",
    "JUnit.OrderServiceTest.executor": "Run",
    "RequestMappingsPanelOrder0": "0",
    "RequestMappingsPanelOrder1": "1",
    "RequestMappingsPanelWidth0": "75",
    "RequestMappingsPanelWidth1": "75",
    "RunOnceActivity.ShowReadmeOnStart": "true",
    "Spring Boot.OrderApplication.executor": "Run",
    "com.intellij.testIntegration.createTest.CreateTestDialog.defaultLibrary": "JUnit5",
    "com.intellij.testIntegration.createTest.CreateTestDialog.defaultLibrarySuperClass.JUnit5": "",
    "git-widget-placeholder": "feat-orders",
    "kotlin-language-version-configured": "true",
    "last_opened_file_path": "/Users/jwj/Desktop/Order-System",
    "node.js.detected.package.eslint": "true",
    "node.js.detected.package.tslint": "true",
    "node.js.selected.package.eslint": "(autodetect)",
    "node.js.selected.package.tslint": "(autodetect)",
    "nodejs_package_manager_path": "npm",
    "settings.editor.selected.configurable": "reference.settingsdialog.project.gradle",
    "vue.rearranger.settings.migration": "true"
  },
  "keyToStringList": {
    "DatabaseDriversLRU": [
      "mysql"
    ]
  }
}]]></component>
  <component name="RecentsManager">
    <key name="MoveFile.RECENT_KEYS">
      <recent name="$PROJECT_DIR$/src/main/resources/templates" />
      <recent name="$PROJECT_DIR$/src/main/java/com/jwj/order" />
      <recent name="$PROJECT_DIR$" />
      <recent name="$PROJECT_DIR$/src/main/resources" />
    </key>
    <key name="CreateTestDialog.Recents.Supers">
      <recent name="" />
    </key>
    <key name="CreateTestDialog.RecentsKey">
      <recent name="com.jwj.order.service" />
    </key>
  </component>
  <component name="RunManager" selected="Spring Boot.OrderApplication">
    <configuration name="OrderServiceTest" type="JUnit" factoryName="JUnit" temporary="true" nameIsGenerated="true">
      <module name="order.test" />
      <extension name="coverage">
        <pattern>
          <option name="PATTERN" value="com.jwj.order.service.*" />
          <option name="ENABLED" value="true" />
        </pattern>
      </extension>
      <option name="PACKAGE_NAME" value="com.jwj.order.service" />
      <option name="MAIN_CLASS_NAME" value="com.jwj.order.service.OrderServiceTest" />
      <option name="TEST_OBJECT" value="class" />
      <method v="2">
        <option name="Make" enabled="true" />
      </method>
    </configuration>
    <configuration default="true" type="JetRunConfigurationType">
      <method v="2">
        <option name="Make" enabled="true" />
      </method>
    </configuration>
    <configuration default="true" type="KotlinStandaloneScriptRunConfigurationType">
      <option name="filePath" />
      <method v="2">
        <option name="Make" enabled="true" />
      </method>
    </configuration>
    <configuration name="OrderApplication" type="SpringBootApplicationConfigurationType" factoryName="Spring Boot" nameIsGenerated="true">
      <module name="order.main" />
      <option name="SPRING_BOOT_MAIN_CLASS" value="com.jwj.order.OrderApplication" />
      <method v="2">
        <option name="Make" enabled="true" />
      </method>
    </configuration>
    <recent_temporary>
      <list>
        <item itemvalue="JUnit.OrderServiceTest" />
      </list>
    </recent_temporary>
  </component>
  <component name="SharedIndexes">
    <attachedChunks>
      <set>
        <option value="bundled-jdk-9823dce3aa75-28b599e66164-intellij.indexing.shared.core-IU-242.24807.4" />
        <option value="bundled-js-predefined-d6986cc7102b-5c90d61e3bab-JavaScript-IU-242.24807.4" />
      </set>
    </attachedChunks>
  </component>
  <component name="SpellCheckerSettings" RuntimeDictionaries="0" Folders="0" CustomDictionaries="0" DefaultDictionary="application-level" UseSingleDictionary="true" transferred="true" />
  <component name="TaskManager">
    <task active="true" id="Default" summary="Default task">
      <changelist id="664e1888-5808-4e0c-938f-28f5980f12df" name="Changes" comment="" />
      <created>1741932148625</created>
      <option name="number" value="Default" />
      <option name="presentableId" value="Default" />
      <updated>1741932148625</updated>
      <workItem from="1741932149721" duration="26002000" />
      <workItem from="1742021361785" duration="8083000" />
      <workItem from="1742031667566" duration="381000" />
      <workItem from="1742035933636" duration="248000" />
      <workItem from="1742036479916" duration="47487000" />
    </task>
    <task id="LOCAL-00001" summary="[feat] 주문 시스템 개발">
      <option name="closed" value="true" />
      <created>1741934334361</created>
      <option name="number" value="00001" />
      <option name="presentableId" value="LOCAL-00001" />
      <option name="project" value="LOCAL" />
      <updated>1741934334361</updated>
    </task>
    <task id="LOCAL-00002" summary="[chore] docker-compose 추가(RabbitMQ, MySQL) 추가">
      <option name="closed" value="true" />
      <created>1741934437689</created>
      <option name="number" value="00002" />
      <option name="presentableId" value="LOCAL-00002" />
      <option name="project" value="LOCAL" />
      <updated>1741934437689</updated>
    </task>
    <task id="LOCAL-00003" summary="[chore] 필요한 의존성 추가">
      <option name="closed" value="true" />
      <created>1741934455363</created>
      <option name="number" value="00003" />
      <option name="presentableId" value="LOCAL-00003" />
      <option name="project" value="LOCAL" />
      <updated>1741934455363</updated>
    </task>
    <task id="LOCAL-00004" summary="[refactor] REST API 스타일에 맞춰 리팩토링">
      <option name="closed" value="true" />
      <created>1741975024972</created>
      <option name="number" value="00004" />
      <option name="presentableId" value="LOCAL-00004" />
      <option name="project" value="LOCAL" />
      <updated>1741975024972</updated>
    </task>
    <option name="localTasksCounter" value="5" />
    <servers />
  </component>
  <component name="TypeScriptGeneratedFilesManager">
    <option name="version" value="3" />
  </component>
  <component name="Vcs.Log.Tabs.Properties">
    <option name="TAB_STATES">
      <map>
        <entry key="MAIN">
          <value>
            <State />
          </value>
        </entry>
      </map>
    </option>
  </component>
  <component name="VcsManagerConfiguration">
    <MESSAGE value="[feat] 주문 시스템 개발" />
    <MESSAGE value="[chore] docker-compose 추가(RabbitMQ, MySQL) 추가" />
    <MESSAGE value="[chore] 필요한 의존성 추가" />
    <MESSAGE value="[refactor] REST API 스타일에 맞춰 리팩토링" />
    <option name="LAST_COMMIT_MESSAGE" value="[refactor] REST API 스타일에 맞춰 리팩토링" />
  </component>
</project>
```

# build.gradle

```gradle
plugins {
	id 'java'
	id 'org.springframework.boot' version '3.4.3'
	id 'io.spring.dependency-management' version '1.1.7'
}

group = 'com.jwj'
version = '0.0.1-SNAPSHOT'

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	implementation 'org.springframework.boot:spring-boot-starter-amqp'
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.projectlombok:lombok'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	testImplementation 'org.springframework.amqp:spring-rabbit-test'
	runtimeOnly 'com.mysql:mysql-connector-j'
	testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}

tasks.named('test') {
	useJUnitPlatform()
}

```

# docker-compose.yml

```yml
services:
  rabbitmq:
    image: rabbitmq:3.12.11-management
    container_name: rabbit-mq-container
    hostname: rabbitmq
    ports:
      - "5672:5672"
      - "15672:15672"
    environment:
      - RABBITMQ_DEFAULT_USER=guest
      - RABBITMQ_DEFAULT_PASS=guest


  mysql:
    image: mysql
    ports:
      - "3306:3306"
    environment:
      - MYSQL_DATABASE=orders
      - MYSQL_ROOT_PASSWORD=password
      - MYSQL_PASSWORD=password
    volumes:
      - mysql_data:/var/lib/mysql
    healthcheck:
      test: [ "CMD", "mysqladmin", "ping", "-h", "localhost", "-u", "root", "-p$$MYSQL_ROOT_PASSWORD" ]
      interval: 10s
      timeout: 5s
      retries: 5

volumes:
  mysql_data:
```

# gradle/wrapper/gradle-wrapper.jar

This is a binary file of the type: Binary

# gradle/wrapper/gradle-wrapper.properties

```properties
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
distributionUrl=https\://services.gradle.org/distributions/gradle-8.12.1-bin.zip
networkTimeout=10000
validateDistributionUrl=true
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists

```

# gradlew

```
#!/bin/sh

#
# Copyright © 2015-2021 the original authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# SPDX-License-Identifier: Apache-2.0
#

##############################################################################
#
#   Gradle start up script for POSIX generated by Gradle.
#
#   Important for running:
#
#   (1) You need a POSIX-compliant shell to run this script. If your /bin/sh is
#       noncompliant, but you have some other compliant shell such as ksh or
#       bash, then to run this script, type that shell name before the whole
#       command line, like:
#
#           ksh Gradle
#
#       Busybox and similar reduced shells will NOT work, because this script
#       requires all of these POSIX shell features:
#         * functions;
#         * expansions «$var», «${var}», «${var:-default}», «${var+SET}»,
#           «${var#prefix}», «${var%suffix}», and «$( cmd )»;
#         * compound commands having a testable exit status, especially «case»;
#         * various built-in commands including «command», «set», and «ulimit».
#
#   Important for patching:
#
#   (2) This script targets any POSIX shell, so it avoids extensions provided
#       by Bash, Ksh, etc; in particular arrays are avoided.
#
#       The "traditional" practice of packing multiple parameters into a
#       space-separated string is a well documented source of bugs and security
#       problems, so this is (mostly) avoided, by progressively accumulating
#       options in "$@", and eventually passing that to Java.
#
#       Where the inherited environment variables (DEFAULT_JVM_OPTS, JAVA_OPTS,
#       and GRADLE_OPTS) rely on word-splitting, this is performed explicitly;
#       see the in-line comments for details.
#
#       There are tweaks for specific operating systems such as AIX, CygWin,
#       Darwin, MinGW, and NonStop.
#
#   (3) This script is generated from the Groovy template
#       https://github.com/gradle/gradle/blob/HEAD/platforms/jvm/plugins-application/src/main/resources/org/gradle/api/internal/plugins/unixStartScript.txt
#       within the Gradle project.
#
#       You can find Gradle at https://github.com/gradle/gradle/.
#
##############################################################################

# Attempt to set APP_HOME

# Resolve links: $0 may be a link
app_path=$0

# Need this for daisy-chained symlinks.
while
    APP_HOME=${app_path%"${app_path##*/}"}  # leaves a trailing /; empty if no leading path
    [ -h "$app_path" ]
do
    ls=$( ls -ld "$app_path" )
    link=${ls#*' -> '}
    case $link in             #(
      /*)   app_path=$link ;; #(
      *)    app_path=$APP_HOME$link ;;
    esac
done

# This is normally unused
# shellcheck disable=SC2034
APP_BASE_NAME=${0##*/}
# Discard cd standard output in case $CDPATH is set (https://github.com/gradle/gradle/issues/25036)
APP_HOME=$( cd -P "${APP_HOME:-./}" > /dev/null && printf '%s
' "$PWD" ) || exit

# Use the maximum available, or set MAX_FD != -1 to use that value.
MAX_FD=maximum

warn () {
    echo "$*"
} >&2

die () {
    echo
    echo "$*"
    echo
    exit 1
} >&2

# OS specific support (must be 'true' or 'false').
cygwin=false
msys=false
darwin=false
nonstop=false
case "$( uname )" in                #(
  CYGWIN* )         cygwin=true  ;; #(
  Darwin* )         darwin=true  ;; #(
  MSYS* | MINGW* )  msys=true    ;; #(
  NONSTOP* )        nonstop=true ;;
esac

CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar


# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
        # IBM's JDK on AIX uses strange locations for the executables
        JAVACMD=$JAVA_HOME/jre/sh/java
    else
        JAVACMD=$JAVA_HOME/bin/java
    fi
    if [ ! -x "$JAVACMD" ] ; then
        die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
else
    JAVACMD=java
    if ! command -v java >/dev/null 2>&1
    then
        die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
fi

# Increase the maximum file descriptors if we can.
if ! "$cygwin" && ! "$darwin" && ! "$nonstop" ; then
    case $MAX_FD in #(
      max*)
        # In POSIX sh, ulimit -H is undefined. That's why the result is checked to see if it worked.
        # shellcheck disable=SC2039,SC3045
        MAX_FD=$( ulimit -H -n ) ||
            warn "Could not query maximum file descriptor limit"
    esac
    case $MAX_FD in  #(
      '' | soft) :;; #(
      *)
        # In POSIX sh, ulimit -n is undefined. That's why the result is checked to see if it worked.
        # shellcheck disable=SC2039,SC3045
        ulimit -n "$MAX_FD" ||
            warn "Could not set maximum file descriptor limit to $MAX_FD"
    esac
fi

# Collect all arguments for the java command, stacking in reverse order:
#   * args from the command line
#   * the main class name
#   * -classpath
#   * -D...appname settings
#   * --module-path (only if needed)
#   * DEFAULT_JVM_OPTS, JAVA_OPTS, and GRADLE_OPTS environment variables.

# For Cygwin or MSYS, switch paths to Windows format before running java
if "$cygwin" || "$msys" ; then
    APP_HOME=$( cygpath --path --mixed "$APP_HOME" )
    CLASSPATH=$( cygpath --path --mixed "$CLASSPATH" )

    JAVACMD=$( cygpath --unix "$JAVACMD" )

    # Now convert the arguments - kludge to limit ourselves to /bin/sh
    for arg do
        if
            case $arg in                                #(
              -*)   false ;;                            # don't mess with options #(
              /?*)  t=${arg#/} t=/${t%%/*}              # looks like a POSIX filepath
                    [ -e "$t" ] ;;                      #(
              *)    false ;;
            esac
        then
            arg=$( cygpath --path --ignore --mixed "$arg" )
        fi
        # Roll the args list around exactly as many times as the number of
        # args, so each arg winds up back in the position where it started, but
        # possibly modified.
        #
        # NB: a `for` loop captures its iteration list before it begins, so
        # changing the positional parameters here affects neither the number of
        # iterations, nor the values presented in `arg`.
        shift                   # remove old arg
        set -- "$@" "$arg"      # push replacement arg
    done
fi


# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

# Collect all arguments for the java command:
#   * DEFAULT_JVM_OPTS, JAVA_OPTS, JAVA_OPTS, and optsEnvironmentVar are not allowed to contain shell fragments,
#     and any embedded shellness will be escaped.
#   * For example: A user cannot expect ${Hostname} to be expanded, as it is an environment variable and will be
#     treated as '${Hostname}' itself on the command line.

set -- \
        "-Dorg.gradle.appname=$APP_BASE_NAME" \
        -classpath "$CLASSPATH" \
        org.gradle.wrapper.GradleWrapperMain \
        "$@"

# Stop when "xargs" is not available.
if ! command -v xargs >/dev/null 2>&1
then
    die "xargs is not available"
fi

# Use "xargs" to parse quoted args.
#
# With -n1 it outputs one arg per line, with the quotes and backslashes removed.
#
# In Bash we could simply go:
#
#   readarray ARGS < <( xargs -n1 <<<"$var" ) &&
#   set -- "${ARGS[@]}" "$@"
#
# but POSIX shell has neither arrays nor command substitution, so instead we
# post-process each arg (as a line of input to sed) to backslash-escape any
# character that might be a shell metacharacter, then use eval to reverse
# that process (while maintaining the separation between arguments), and wrap
# the whole thing up as a single "set" statement.
#
# This will of course break if any of these variables contains a newline or
# an unmatched quote.
#

eval "set -- $(
        printf '%s\n' "$DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS" |
        xargs -n1 |
        sed ' s~[^-[:alnum:]+,./:=@_]~\\&~g; ' |
        tr '\n' ' '
    )" '"$@"'

exec "$JAVACMD" "$@"

```

# gradlew.bat

```bat
@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem
@rem SPDX-License-Identifier: Apache-2.0
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  Gradle startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
@rem This is normally unused
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS="-Xmx64m" "-Xms64m"

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH. 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME% 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\gradle\wrapper\gradle-wrapper.jar


@rem Execute Gradle
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GRADLE_OPTS% "-Dorg.gradle.appname=%APP_BASE_NAME%" -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable GRADLE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%GRADLE_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega

```

# out/production/resources/application.yml

```yml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/orders
    username: root
    password: password

    hikari:
      maximum-pool-size: 30

  jpa:
    hibernate:
      ddl-auto: create
    generate-ddl: false
    show-sql: true
    properties:
      hibernate:
        format_sql: true
        use_sql_comments: true
        connection:
          characterEncoding: UTF-8
    defer-datasource-initialization: true

  rabbitmq:
    port: 5672
    host: localhost
    username: guest
    password: guest
```

# README.md

```md
## 📝 개요

* 프로젝트 기간 : 2025.03.13 ~ 2025.03.16
* 프로젝트 인원 : 1명
* 프로젝트 주제 : 주문 알림 시스템 개발

## 📝 기획 계기

* RabbitMQ는 다양한 Exchange 전략을 제공합니다.
* SpotEditor 프로젝트에서 팔로우 시 1:1 실시간 알림과 더불어 활동 피드 발생 시 특정 다수의 팔로워들에게 알림이 발송되어야하는 요구사항이 있었습니다.
* DLQ, DLX 등에 대해 확실한 이해를 통해 프로덕션급의 시스템을 개발해보기 위해 토이 프로젝트를 기획하게 되었습니다.

## 📕 구현 내용

* 주문자 주문ID별 정확한 라우팅을 통해 주문 상태를 업데이트할 수 있다.

## 📗 기술 스택

## 📘 공부한 내용 정리

```

# settings.gradle

```gradle
rootProject.name = 'order'

```

# src/main/java/com/jwj/order/controller/ItemController.java

```java
package com.jwj.order.controller;

import com.jwj.order.domain.Item;
import com.jwj.order.dto.ItemCreateRequest;
import com.jwj.order.repository.ItemRepository;
import com.jwj.order.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;
    private final ItemRepository itemRepository;

    // 상품 생성 REST API
    @PostMapping("/items/new")
    public ResponseEntity<Void> create(@RequestBody ItemCreateRequest request) {

        itemService.saveItem(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    // 상품 목록 조회 REST API
    @GetMapping("/items/{itemId}")
    public ResponseEntity<Item> list(@PathVariable("itemId") Long itemId) {

        Item item = itemRepository.findById(itemId).orElse(null);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(item);
    }
}






```

# src/main/java/com/jwj/order/controller/MemberController.java

```java
package com.jwj.order.controller;

import com.jwj.order.domain.Member;
import com.jwj.order.dto.MemberCreateRequest;
import com.jwj.order.dto.MemberListDTO;
import com.jwj.order.repository.MemberRepository;
import com.jwj.order.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;
    private final MemberService memberService;

    // 회원 생성 REST API
    @PostMapping("/members/new")
    public ResponseEntity<Void> create(@RequestBody MemberCreateRequest request) {

        memberService.join(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    // 회원 목록 조회 REST API
    @GetMapping("/members")
    public ResponseEntity<List<Member>> list() {
        List<Member> members = memberRepository.findAll();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(members);
    }
}

```

# src/main/java/com/jwj/order/controller/OrderController.java

```java
package com.jwj.order.controller;

import com.jwj.order.domain.Order;
import com.jwj.order.dto.OrderCanceledRequest;
import com.jwj.order.dto.OrderCreateRequest;
import com.jwj.order.dto.OrderDto;
import com.jwj.order.rabbitmq.OrderPublisher;
import com.jwj.order.repository.OrderRepository;
import com.jwj.order.repository.OrderSearch;
import com.jwj.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderPublisher orderPublisher;
    private final OrderRepository orderRepository;
    private final OrderService orderService;

    // 주문 생성 REST API
    @PostMapping("/orders")
    public ResponseEntity<Long> order(@RequestBody OrderCreateRequest request) {

        // 주문 시 메시지를 발행
        orderPublisher.publishOrderCreatedEvent(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    // 주문 필터링 조회 REST API
    @GetMapping("/orders")
    public ResponseEntity<List<OrderDto>> orderList(@RequestBody OrderSearch orderSearch) {
        // 엔티티 리스트 조회
        List<Order> orders = orderRepository.findOrders(orderSearch);

        // DTO로 변환
        List<OrderDto> result = orders.stream()
                .map(order -> new OrderDto(order))
                .collect(Collectors.toList());

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    // 주문 취소 REST API
    @DeleteMapping("/orders/{orderId}/cancel")
    public ResponseEntity<Void> cancelOrder(@PathVariable("orderId") Long orderId) {

        // 주문 취소
        orderService.cancelOrder(orderId);

        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }
}
```

# src/main/java/com/jwj/order/domain/Address.java

```java
package com.jwj.order.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}

```

# src/main/java/com/jwj/order/domain/Category.java

```java
package com.jwj.order.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;


@Entity
@Getter @Setter
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "category_item",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> items = new ArrayList<>();

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

    //==연관관계 메서드==//
    public void addChildCategory(Category child) {
        this.child.add(child);
        child.setParent(this);
    }

}

```

# src/main/java/com/jwj/order/domain/Delivery.java

```java
package com.jwj.order.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @JsonIgnore
    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; //READY, COMP
}

```

# src/main/java/com/jwj/order/domain/DeliveryStatus.java

```java
package com.jwj.order.domain;

public enum DeliveryStatus {
    READY, COMP
}

```

# src/main/java/com/jwj/order/domain/Item.java

```java
package com.jwj.order.domain;

import com.jwj.order.dto.ItemCreateRequest;
import com.jwj.order.exception.NotEnoughStockException;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();

    public void addStock(int quantity) {
        this.stockQuantity += quantity;
    }

    public void removeStock(int quantity) {
        int restStock = this.stockQuantity - quantity;
        if (restStock < 0) {
            throw new NotEnoughStockException("need more stock");
        }
        this.stockQuantity = restStock;
    }

    @Builder
    private Item(String name, int price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public static Item toEntity(ItemCreateRequest request) {
        return Item.builder()
                .name(request.getName())
                .price(request.getPrice())
                .stockQuantity(request.getStockQuantity())
                .build();
    }
}

```

# src/main/java/com/jwj/order/domain/Member.java

```java
package com.jwj.order.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jwj.order.dto.MemberCreateRequest;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    @Builder
    private Member(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // 정적 팩토리 메서드(DTO -> 엔티티)
    public static Member toEntity(MemberCreateRequest request) {
        return Member.builder()
                .name(request.getName())
                .address(request.getAddress())
                .build();
    }
}

```

# src/main/java/com/jwj/order/domain/Order.java

```java
package com.jwj.order.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "orders")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @JsonIgnore
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<>();

    @JsonIgnore
    @OneToOne(fetch = LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    private LocalDateTime orderDate; //주문시간

    @Enumerated(EnumType.STRING)
    private OrderStatus status; //주문상태 [ORDER, CANCEL]

    //==연관관계 메서드==//
    public void setMember(Member member) {
        this.member = member;
        member.getOrders().add(this);
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
        delivery.setOrder(this);
    }

    //==생성 메서드==//
    public static Order createOrder(Member member, Delivery delivery, List<OrderItem> orderItems) {
        Order order = new Order();
        order.setMember(member);
        order.setDelivery(delivery);
        for (OrderItem orderItem : orderItems) {
            order.addOrderItem(orderItem);
        }
        order.setStatus(OrderStatus.ORDER);
        order.setOrderDate(LocalDateTime.now());
        return order;
    }

    //==비즈니스 로직==//
    /**
     * 주문 취소
     */
    public void cancel() {
        if (delivery.getStatus() == DeliveryStatus.COMP) {
            throw new IllegalStateException("이미 배송완료된 상품은 취소가 불가능합니다.");
        }

        this.setStatus(OrderStatus.CANCEL);
        for (OrderItem orderItem : orderItems) {
            orderItem.cancel();
        }
    }

    //==조회 로직==//
    /**
     * 전체 주문 가격 조회
     */
    public int getTotalPrice() {
        int totalPrice = 0;
        for (OrderItem orderItem : orderItems) {
            totalPrice += orderItem.getTotalPrice();
        }
        return totalPrice;
    }
}
```

# src/main/java/com/jwj/order/domain/OrderItem.java

```java
package com.jwj.order.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @JsonIgnore
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice; //주문 가격
    private int count; //주문 수량

    //==생성 메서드==//
    public static OrderItem createOrderItem(Item item, int orderPrice, int count) {
        OrderItem orderItem = new OrderItem();
        orderItem.setItem(item);
        orderItem.setOrderPrice(orderPrice);
        orderItem.setCount(count);

        item.removeStock(count);
        return orderItem;
    }

    //==비즈니스 로직==//
    public void cancel() {
        getItem().addStock(this.count);
    }

    //==조회 로직==//

    /**
     * 주문상품 전체 가격 조회
     */
    public int getTotalPrice() {
        return getOrderPrice() * getCount();
    }
}

```

# src/main/java/com/jwj/order/domain/OrderStatus.java

```java
package com.jwj.order.domain;

public enum OrderStatus {
    ORDER, CANCEL
}

```

# src/main/java/com/jwj/order/dto/ItemCreateRequest.java

```java
package com.jwj.order.dto;

import com.jwj.order.domain.Item;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemCreateRequest {

	private String name;
	private int price;
	private int stockQuantity;

	public static ItemCreateRequest toDto(Item item) {
		return ItemCreateRequest.builder()
                .name(item.getName())
                .price(item.getPrice())
                .stockQuantity(item.getStockQuantity())
                .build();
	}
}

```

# src/main/java/com/jwj/order/dto/MemberCreateRequest.java

```java
package com.jwj.order.dto;

import com.jwj.order.domain.Address;
import com.jwj.order.domain.Member;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberCreateRequest {

	private String name;
	private Address address;

	// 정적 팩토리 메서드(엔티티 -> DTO)
	public static MemberCreateRequest toDto(Member member) {
		return MemberCreateRequest.builder()
				.name(member.getName())
				.address(member.getAddress())
				.build();
	}
}

```

# src/main/java/com/jwj/order/dto/MemberListDTO.java

```java
package com.jwj.order.dto;

import lombok.Data;

@Data
public class MemberListDTO {
}

```

# src/main/java/com/jwj/order/dto/OrderCanceledRequest.java

```java
package com.jwj.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderCanceledRequest {

	private Long orderId;
}

```

# src/main/java/com/jwj/order/dto/OrderCreateRequest.java

```java
package com.jwj.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreateRequest {

	private long memberId;
	private List<OrderItemRequest> orderItems;
}

```

# src/main/java/com/jwj/order/dto/OrderDto.java

```java
package com.jwj.order.dto;

import com.jwj.order.domain.Order;
import com.jwj.order.domain.OrderItem;
import com.jwj.order.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class OrderDto {
	private Long id;
	private String memberName;
	private LocalDateTime orderDate;
	private OrderStatus status;
	private List<OrderItemDto> orderItems;
	private String deliveryAddress;
	private String deliveryStatus;
	private int totalPrice;

	public OrderDto(Order order) {
		this.id = order.getId();
		this.memberName = order.getMember().getName();
		this.orderDate = order.getOrderDate();
		this.status = order.getStatus();
		this.totalPrice = order.getTotalPrice();

		this.orderItems = order.getOrderItems().stream()
				.map(OrderItemDto::new)
				.collect(Collectors.toList());

		if (order.getDelivery() != null) {
			if (order.getDelivery().getAddress() != null) {
				this.deliveryAddress = order.getDelivery().getAddress().toString();
			}
			this.deliveryStatus = order.getDelivery().getStatus().toString();
		}
	}
}
```

# src/main/java/com/jwj/order/dto/OrderItemDto.java

```java
package com.jwj.order.dto;

import com.jwj.order.domain.OrderItem;
import lombok.Data;

@Data
public class OrderItemDto {
	private Long id;
	private String itemName;
	private int orderPrice;
	private int count;
	private int totalPrice;

	public OrderItemDto(OrderItem orderItem) {
		this.id = orderItem.getId();
		this.itemName = orderItem.getItem().getName();
		this.orderPrice = orderItem.getOrderPrice();
		this.count = orderItem.getCount();
		this.totalPrice = orderItem.getTotalPrice();
	}
}
```

# src/main/java/com/jwj/order/dto/OrderItemRequest.java

```java
package com.jwj.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemRequest {

	private long itemId;
	private int count;
}

```

# src/main/java/com/jwj/order/dto/OrderListDTO.java

```java
package com.jwj.order.dto;

import com.jwj.order.domain.Order;
import com.jwj.order.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderListDTO {
	private Long id;
	private String memberName;
	private LocalDateTime orderDate;
	private OrderStatus status;
	private int totalPrice;
	private String deliveryAddress;
	private String deliveryStatus;

	public OrderListDTO(Order order) {
		this.id = order.getId();
		this.memberName = order.getMember().getName();
		this.orderDate = order.getOrderDate();
		this.status = order.getStatus();
		this.totalPrice = order.getTotalPrice();

		if (order.getDelivery() != null) {
			if (order.getDelivery().getAddress() != null) {
				this.deliveryAddress = order.getDelivery().getAddress().toString();
			}
			this.deliveryStatus = order.getDelivery().getStatus().toString();
		}
	}
}
```

# src/main/java/com/jwj/order/exception/LockAcquisitionException.java

```java
package com.jwj.order.exception;

public class LockAcquisitionException extends RuntimeException {

	public LockAcquisitionException(String message) {
		super(message);
	}

	public LockAcquisitionException(String message, Throwable cause) {
		super(message, cause);
	}
}
```

# src/main/java/com/jwj/order/exception/NotEnoughStockException.java

```java
package com.jwj.order.exception;

public class NotEnoughStockException extends RuntimeException {

    public NotEnoughStockException() {
        super();
    }

    public NotEnoughStockException(String message) {
        super(message);
    }

    public NotEnoughStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStockException(Throwable cause) {
        super(cause);
    }

}

```

# src/main/java/com/jwj/order/OrderApplication.java

```java
package com.jwj.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

}

```

# src/main/java/com/jwj/order/rabbitmq/LockRepository.java

```java
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
	private static final String EXCEPTION_MESSAGE = "LOCK을 수행하는 도중 예외가 발생했습니다.";

	private final DataSource dataSource;

	public <T> T executeWithLock(String lockName, int timoutSeconds, Supplier<T> supplier) {

		try (Connection connection = dataSource.getConnection()) {
			try {
				getLock(connection, lockName, timoutSeconds);
				return supplier.get();
			} finally {
				releaseLock(connection, lockName);
			}
		} catch (SQLException | RuntimeException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	private void getLock(Connection connection,
						 String lockName,
						 int timeoutseconds) throws SQLException {

		try (PreparedStatement preparedStatement = connection.prepareStatement(GET_LOCK)) {
			preparedStatement.setString(1, lockName);
			preparedStatement.setInt(2, timeoutseconds);

			checkResultSet(lockName, preparedStatement, "GetLock_");
		}
	}

	private void releaseLock(Connection connection,
							 String lockName) throws SQLException {
		try (PreparedStatement preparedStatement = connection.prepareStatement(RELEASE_LOCK)) {
			preparedStatement.setString(1, lockName);

			checkResultSet(lockName, preparedStatement, "ReleaseLock_");
		}
	}

	private void checkResultSet(String userLockName,
								PreparedStatement preparedStatement,
								String type) throws SQLException {
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
```

# src/main/java/com/jwj/order/rabbitmq/OrderConsumer.java

```java
package com.jwj.order.rabbitmq;

import com.jwj.order.dto.OrderCreateRequest;
import com.jwj.order.repository.ItemRepository;
import com.jwj.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.jwj.order.rabbitmq.RabbitMqConfig.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderConsumer {

	private final OrderService orderService;
	private final RabbitTemplate rabbitTemplate;

	// 주문 대기열에 있는 메시지를 가져와 주문 처리 및 재고 반영
	@RabbitListener(queues = ORDER_QUEUE, concurrency = "10")
	@Transactional
	public void consumeOrderCreatedEvent(OrderCreateRequest request) {
		try {
			log.info("주문 이벤트 수신 완료: {}", request);

			// 주문 처리 메서드 호출
			orderService.order(request.getMemberId(), request);
			log.info("주문이 성공적으로 완료되었습니다!");
		} catch (Exception e) {
			log.error("주문에 실패했습니다! 오류: {}", e.getMessage(), e);

			// 데드락 또는 락 획득 실패인 경우 즉시 DLQ로 이동
			if (e.getMessage().contains("Deadlock") || e.getMessage().contains("Lock")) {
				log.warn("데드락 또는 락 획득 실패로 인한 주문 실패, DLQ로 이동: {}", request.getMemberId());

				// 실패한 주문 메시지를 DLQ로 보낸다.
				rabbitTemplate.convertAndSend(
						DEADLETTER_EXCHANGE,
						DEADLETTER_ROUTING_KEY,
						request
				);

				// 재시도하지 않고 메시지 거부
				throw new AmqpRejectAndDontRequeueException("데드락 발생으로 처리 중단: " + e.getMessage());
			}

			throw e;
		}
	}

	// DLQ에 들어간 메시지 재처리
	// 동시성 수준 및 백오프 설정 추가
	@RabbitListener(queues = DEADLETTER_QUEUE, concurrency = "5")
	@Transactional
	public void consumeFailedMessage(OrderCreateRequest request) throws InterruptedException {
		try {
			log.info("DLQ 메시지 처리 중: {}", request);

			// 5초 대기 후 다시 시도 (데드락 해소를 위한 시간 제공)
			Thread.sleep(5000);

			// 재처리를 위해 원래 큐로 다시 전송
			rabbitTemplate.convertAndSend(
					ORDER_EXCHANGE,
					ORDER_ROUTING_KEY,
					request
			);

			log.info("DLQ 메시지를 원래 큐로 다시 전송했습니다: {}", request.getMemberId());
		} catch (Exception e) {
			log.error("DLQ 메시지 처리 실패: {}", e.getMessage(), e);

			// 여러 번 실패한 경우 로그만 남기고 폐기 (선택적)
			if (e.getMessage().contains("처리 횟수 초과")) {
				log.error("최대 재시도 횟수 초과, 메시지 폐기: {}", request);
				return;
			}

			// 실패한 메시지 재시도를 위해 다시 DLQ 큐로 보내기
			rabbitTemplate.convertAndSend(
					DEADLETTER_EXCHANGE,
					DEADLETTER_ROUTING_KEY,
					request
			);
			throw e;
		}
	}
}
```

# src/main/java/com/jwj/order/rabbitmq/OrderPublisher.java

```java
package com.jwj.order.rabbitmq;

import com.jwj.order.dto.OrderCreateRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static com.jwj.order.rabbitmq.RabbitMqConfig.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderPublisher {

	private final RabbitTemplate rabbitTemplate;

	// 주문 요청을 메시지 큐로 발행
	public void publishOrderCreatedEvent(OrderCreateRequest request) {
		try {
			log.info("주문 생성 이벤트 발행: {}", request);
			rabbitTemplate.convertAndSend(ORDER_EXCHANGE, ORDER_ROUTING_KEY, request);
		} catch (Exception e) {
			log.error("주문 생성 이벤트 발행 실패: {}", e.getMessage());
			throw new RuntimeException("주문 메시지 발행 실패", e);
		}
	}
}

```

# src/main/java/com/jwj/order/rabbitmq/RabbitMqConfig.java

```java
package com.jwj.order.rabbitmq;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

	public static final String ORDER_EXCHANGE = "ORDER_EXCHANGE";			// 주문 익스체인지
	public static final String ORDER_QUEUE = "ORDER_QUEUE";					// 주문 대기열
	public static final String ORDER_ROUTING_KEY = "ORDER_CREATED";			// 주문 라우팅 키

	public static final String DEADLETTER_EXCHANGE = "DEAD_LETTER_EXCHANGE";
	public static final String DEADLETTER_QUEUE = "DEAD_LETTER_QUEUE";
	public static final String DEADLETTER_ROUTING_KEY = "DEAD_LETTER";

	// Message Converter
	@Bean
	public MessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	// RabbitTemplate
	@Bean
	public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(messageConverter());
		return rabbitTemplate;
	}

	// MessageListenerAdapter
	@Bean
	public MessageListenerAdapter messageListenerAdapter(OrderConsumer consumer) {
		MessageListenerAdapter messageListenerAdapter = new MessageListenerAdapter(consumer);
		messageListenerAdapter.setMessageConverter(messageConverter());
		return messageListenerAdapter;
	}

	// SimpleMessageListenerContainer - 동시성 조정
	@Bean
	public SimpleMessageListenerContainer simpleMessageListenerContainer(ConnectionFactory connectionFactory) {
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.setQueueNames(ORDER_QUEUE);

		container.setConcurrentConsumers(10);
		container.setPrefetchCount(20);	// 동시 처리량
		return container;
	}

	// DLX(DeadLetterExchange)
	@Bean
	public DirectExchange deadLetterExchange() {
		return new DirectExchange(DEADLETTER_EXCHANGE);
	}

	// DLQ(DeadLetterQueue)
	@Bean
	public Queue deadLetterQueue() {
		return QueueBuilder.durable(DEADLETTER_QUEUE)
				.build();
	}

	// DLQ와 DLX 연결
	@Bean
	public Binding deadLetterBinding() {
		return BindingBuilder.bind(deadLetterQueue())
				.to(deadLetterExchange())
				.with(DEADLETTER_ROUTING_KEY);
	}

	// 주문 Exchange
	@Bean
	public TopicExchange orderExchange() {
		return new TopicExchange(ORDER_EXCHANGE);
	}

	// 주문 Queue - 동시 처리 요청 제한
	@Bean
	public Queue orderQueue() {
		return QueueBuilder.durable(ORDER_QUEUE)
				.withArgument("x-dead-letter-exchange", DEADLETTER_EXCHANGE)
				.withArgument("x-dead-letter-routing-key", DEADLETTER_ROUTING_KEY)
				.build();
	}

	// 주문 Binding
	@Bean
	public Binding orderBinding() {
		return BindingBuilder.bind(orderQueue())
				.to(orderExchange())
				.with(ORDER_ROUTING_KEY);
	}
}
```

# src/main/java/com/jwj/order/repository/ItemRepository.java

```java
package com.jwj.order.repository;

import com.jwj.order.domain.Item;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {

	// 기존 메서드는 유지하고, 비관적 락을 적용한 메서드 추가
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	@Query("select i from Item i where i.id = :id")
	Optional<Item> findByIdWithPessimisticLock(@Param("id") Long id);
}
```

# src/main/java/com/jwj/order/repository/MemberRepository.java

```java
package com.jwj.order.repository;

import com.jwj.order.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByName(String name);
}

```

# src/main/java/com/jwj/order/repository/OrderRepository.java

```java
package com.jwj.order.repository;

import com.jwj.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>, OrderRepositoryCustom {

}


```

# src/main/java/com/jwj/order/repository/OrderRepositoryCustom.java

```java
package com.jwj.order.repository;

import com.jwj.order.domain.Order;

import java.util.List;

public interface OrderRepositoryCustom {

	List<Order> findOrders(OrderSearch orderSearch);
	List<Order> findAllByString(OrderSearch orderSearch);

}

```

# src/main/java/com/jwj/order/repository/OrderRepositoryCustomImpl.java

```java
package com.jwj.order.repository;

import com.jwj.order.domain.Order;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryCustomImpl implements OrderRepositoryCustom {

	private final EntityManager em;

	@Override
	public List<Order> findOrders(OrderSearch orderSearch) {
		return findAllByString(orderSearch);
	}

	@Override
	public List<Order> findAllByString(OrderSearch orderSearch) {
		return em.createQuery("SELECT o FROM Order o WHERE o.status = :status", Order.class)
				.setParameter("status", orderSearch.getOrderStatus())
				.getResultList();
	}
}

```

# src/main/java/com/jwj/order/repository/OrderSearch.java

```java
package com.jwj.order.repository;

import com.jwj.order.domain.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderSearch {

    private String memberName; //회원 이름
    private OrderStatus orderStatus; //주문 상태[ORDER, CANCEL]
}

```

# src/main/java/com/jwj/order/service/ItemService.java

```java
package com.jwj.order.service;

import com.jwj.order.domain.Item;
import com.jwj.order.dto.ItemCreateRequest;
import com.jwj.order.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    // 상품 저장 비즈니스 로직
    @Transactional
    public void saveItem(ItemCreateRequest request) {

        Item item = Item.builder()
                .name(request.getName())
                .price(request.getPrice())
                .stockQuantity(request.getStockQuantity())
                .build();
        itemRepository.save(item);
    }
}

```

# src/main/java/com/jwj/order/service/MemberService.java

```java
package com.jwj.order.service;

import com.jwj.order.domain.Member;
import com.jwj.order.dto.MemberCreateRequest;
import com.jwj.order.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    // 회원 가입
    @Transactional
    public Long join(MemberCreateRequest request) {

        validateDuplicateMember(request);

        Member member = Member.builder()
                .name(request.getName())
                .address(request.getAddress())
                .build();

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(MemberCreateRequest request) {
        String name = request.getName();
        List<Member> findMembers = memberRepository.findByName(name);
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
}

```

# src/main/java/com/jwj/order/service/OrderService.java

```java
package com.jwj.order.service;

import com.jwj.order.domain.*;
import com.jwj.order.domain.Item;
import com.jwj.order.dto.OrderCreateRequest;
import com.jwj.order.dto.OrderItemRequest;
import com.jwj.order.rabbitmq.LockRepository;
import com.jwj.order.repository.ItemRepository;
import com.jwj.order.repository.MemberRepository;
import com.jwj.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final MemberRepository memberRepository;
    private final ItemRepository itemRepository;
    private final LockRepository lockRepository;

    private static final int DEFAULT_LOCK_TIMEOUT = 3; // 3초 타임아웃

    // 주문 생성 비즈니스 로직
    @Transactional
    public Long order(Long memberId, OrderCreateRequest request) {
        return lockRepository.executeWithLock("order_" + memberId, DEFAULT_LOCK_TIMEOUT, () -> {
            //엔티티 조회
            Member member = memberRepository.findById(memberId)
                    .orElseThrow(() -> new IllegalArgumentException("회원을 찾을 수 없습니다: " + memberId));

            //주문상품 생성
            List<OrderItem> orderItemList = request.getOrderItems().stream()
                    .map(orderItemRequest -> {
                        Item item = itemRepository.findByIdWithPessimisticLock(orderItemRequest.getItemId())
                                .orElseThrow(() -> new IllegalArgumentException("상품을 찾을 수 없습니다: " + orderItemRequest.getItemId()));
                        // 재고 확인 로직 추가
                        if (item.getStockQuantity() < orderItemRequest.getCount()) {
                            throw new IllegalStateException("재고가 부족합니다: " + item.getName());
                        }
                        return OrderItem.createOrderItem(item, item.getPrice(), orderItemRequest.getCount());
                    })
                    .collect(Collectors.toList());

            //배송정보 생성
            Delivery delivery = new Delivery();
            delivery.setAddress(member.getAddress());
            delivery.setStatus(DeliveryStatus.READY);

            //주문 생성
            Order order = Order.createOrder(member, delivery, orderItemList);

            //주문 저장
            orderRepository.save(order);

            return order.getId();
        });
    }

    // 주문 취소 비즈니스 로직
    @Transactional
    public void cancelOrder(Long orderId) {

        Order order = orderRepository.findById(orderId).orElse(null);
        order.cancel();
    }
}
```

# src/main/java/com/jwj/order/util/InitDb.java

```java
package com.jwj.order.util;

import com.jwj.order.domain.*;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static com.jwj.order.domain.DeliveryStatus.READY;

@Component
@RequiredArgsConstructor
public class InitDb {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.dbInit1();
        initService.dbInit2();
        initService.initMembers();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;

        public void dbInit1() {
            System.out.println("Init1" + this.getClass());
            Member member = createMember("userA", "서울", "1", "1111");
            em.persist(member);

            Item book1 = createItem("JPA1 BOOK", 10000, 10000);
            em.persist(book1);

            Item book2 = createItem("JPA2 BOOK", 20000, 10000);
            em.persist(book2);

//            OrderItem orderItem1 = OrderItem.createOrderItem(book1, 10000, 1);
//            OrderItem orderItem2 = OrderItem.createOrderItem(book2, 20000, 2);
//
//            Delivery delivery = createDelivery(member);
//            Order order = Order.createOrder(member, delivery, Arrays.asList(orderItem1, orderItem2));
//            em.persist(order);
        }

        public void dbInit2() {
            Member member = createMember("userB", "진주", "2", "2222");
            em.persist(member);

            Item book1 = createItem("SPRING1 BOOK", 20000, 10000);
            em.persist(book1);

            Item book2 = createItem("SPRING2 BOOK", 40000, 10000);
            em.persist(book2);

//            OrderItem orderItem1 = OrderItem.createOrderItem(book1, 20000, 3);
//            OrderItem orderItem2 = OrderItem.createOrderItem(book2, 40000, 4);
//
//            Delivery delivery = createDelivery(member);
//            Order order = Order.createOrder(member, delivery, Arrays.asList(orderItem1, orderItem2));
//            em.persist(order);
        }

        // 추가된 메서드: 498명의 추가 멤버 생성 (기존 2명 + 498명 = 총 500명)
        public void initMembers() {
            System.out.println("Initializing 498 additional members...");

            // 기존에 2명이 있으므로 ID는 3부터 시작하여 500까지 생성
            IntStream.rangeClosed(3, 10000).forEach(i -> {
                String userName = "user" + i;
                String city = "City" + i;
                String street = String.valueOf(i);
                String zipcode = String.format("%04d", i);

                Member member = createMember(userName, city, street, zipcode);
                em.persist(member);

                // 100명마다 flush와 clear를 수행하여 메모리 관리
                if (i % 100 == 0) {
                    em.flush();
                    em.clear();
                    System.out.println("Persisted " + i + " members");
                }
            });

            System.out.println("Finished initializing all 500 members");
        }

        private Member createMember(String name, String city, String street, String zipcode) {
            return Member.builder()
                    .name(name)
                    .address(new Address(city, street, zipcode))
                    .build();
        }

        private Item createItem(String name, int price, int stockQuantity) {
            return Item.builder()
                    .name(name)
                    .price(price)
                    .stockQuantity(stockQuantity)
                    .build();
        }

        private Delivery createDelivery(Member member) {
            Delivery delivery = new Delivery();
            delivery.setAddress(member.getAddress());
            delivery.setStatus(READY);
            return delivery;
        }
    }
}
```

# src/main/resources/application.yml

```yml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/orders
    username: root
    password: password

    hikari:
      maximum-pool-size: 30

  jpa:
    hibernate:
      ddl-auto: create
    generate-ddl: false
    show-sql: true
    properties:
      hibernate:
        format_sql: true
        use_sql_comments: true
        connection:
          characterEncoding: UTF-8
    defer-datasource-initialization: true

  rabbitmq:
    port: 5672
    host: localhost
    username: guest
    password: guest
```

# src/test/java/com/jwj/order/OrderApplicationTests.java

```java
package com.jwj.order;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderApplicationTests {

	@Test
	void contextLoads() {
	}

}

```

# src/test/java/com/jwj/order/service/OrderServiceTest.java

```java
package com.jwj.order.service;

import com.jwj.order.domain.Item;
import com.jwj.order.domain.Member;
import com.jwj.order.dto.OrderCreateRequest;
import com.jwj.order.dto.OrderItemRequest;
import com.jwj.order.rabbitmq.OrderPublisher;
import com.jwj.order.repository.ItemRepository;
import com.jwj.order.repository.MemberRepository;
import com.jwj.order.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class OrderServiceTest {

	@Autowired private OrderPublisher orderPublisher;
	@Autowired private ItemRepository itemRepository;
	@Autowired private OrderRepository orderRepository;

	@BeforeEach
	void setup() {
		// 테스트에 필요한 초기 데이터 설정
		// 실제 환경에서는 @SQL 스크립트나 별도의 설정 클래스로 분리하는 것이 좋습니다
		Item item = itemRepository.findById(1L).orElse(null);
		if (item != null) {
			// 재고 초기화 (테스트마다 초기 상태로 리셋)
			item.setStockQuantity(100);
			itemRepository.save(item);
		}
	}

	@Test
	void concurrencyWithMessageQueue() throws InterruptedException {
		// given
		int threadCount = 50; // 보다 현실적인 스레드 수
		ExecutorService executorService = Executors.newFixedThreadPool(32); // 스레드 풀 크기 감소
		CountDownLatch latch = new CountDownLatch(threadCount);

		// when - OrderPublisher를 통해 메시지 발행
		for (long i = 1; i <= threadCount; i++) {
			final Long memberId = i;
			executorService.submit(() -> {
				try {
					OrderCreateRequest req = new OrderCreateRequest();
					OrderItemRequest orderItemRequest = new OrderItemRequest();
					req.setMemberId(memberId);
					orderItemRequest.setItemId(1L);
					orderItemRequest.setCount(2); // 각 주문당 2개씩 주문 (더 빠른 재고 소진)
					req.setOrderItems(Arrays.asList(orderItemRequest));

					// 직접 Consumer 호출 대신 Publisher를 통해 메시지 발행
					orderPublisher.publishOrderCreatedEvent(req);
				} finally {
					latch.countDown();
				}
			});
		}

		// 모든 메시지 발행 대기
		latch.await(30, TimeUnit.SECONDS);

		// 스레드 풀 종료
		executorService.shutdown();
		executorService.awaitTermination(10, TimeUnit.SECONDS);

		// then - 비동기 처리 완료를 기다림
		// Awaitility 라이브러리를 사용하여 조건이 충족될 때까지 대기
		await().atMost(60, TimeUnit.SECONDS)
				.pollInterval(2, TimeUnit.SECONDS)
				.until(() -> {
					Item item = itemRepository.findById(1L).get();
					// 모든 주문이 처리되었거나 재고가 0이 되었는지 확인
					int expectedRemainingStock = Math.max(0, 100 - (threadCount * 2));
					int actualStock = item.getStockQuantity();

					System.out.println("현재 재고: " + actualStock + ", 예상 재고: " + expectedRemainingStock);
					return actualStock == expectedRemainingStock || actualStock == 0;
				});

		// 주문 수 확인 (재고 부족으로 일부 실패할 수 있음)
		long orderCount = orderRepository.count();
		System.out.println("총 생성된 주문 수: " + orderCount);

		// 각 주문이 정상적으로 처리되었는지 확인
		Item item = itemRepository.findById(1L).get();
		int expectedRemainingStock = Math.max(0, 100 - (threadCount * 2));
		assertThat(item.getStockQuantity()).isEqualTo(expectedRemainingStock);
	}

	@Test
	void concurrencyWithInsufficientStock() throws InterruptedException {
		// given
		Item item = itemRepository.findById(1L).get();
		// 의도적으로 낮은 재고 설정
		item.setStockQuantity(1);
		itemRepository.save(item);

		int threadCount = 10000; // 재고보다 많은 주문
		ExecutorService executorService = Executors.newFixedThreadPool(8);
		CountDownLatch latch = new CountDownLatch(threadCount);

		// when - 의도적으로 재고 부족 상황 생성
		for (long i = 1; i <= threadCount; i++) {
			final Long memberId = i;
			executorService.submit(() -> {
				try {
					OrderCreateRequest req = new OrderCreateRequest();
					OrderItemRequest orderItemRequest = new OrderItemRequest();
					req.setMemberId(memberId);
					orderItemRequest.setItemId(1L);
					orderItemRequest.setCount(1);
					req.setOrderItems(Arrays.asList(orderItemRequest));

					orderPublisher.publishOrderCreatedEvent(req);
				} finally {
					latch.countDown();
				}
			});
		}

		latch.await(30, TimeUnit.SECONDS);
		executorService.shutdown();
		executorService.awaitTermination(10, TimeUnit.SECONDS);

		// then - 재고가 0이 될 때까지 기다림
		await().atMost(60, TimeUnit.SECONDS)
				.pollInterval(2, TimeUnit.SECONDS)
				.until(() -> {
					Item updatedItem = itemRepository.findById(1L).get();
					System.out.println("현재 재고: " + updatedItem.getStockQuantity());
					// 모든 유효한 주문이 처리되어 재고가 0이 되었는지 확인
					return updatedItem.getStockQuantity() == 0;
				});

		// 정확히 10개의 주문만 성공해야 함 (나머지는 재고 부족으로 실패)
		Item updatedItem = itemRepository.findById(1L).get();
		assertThat(updatedItem.getStockQuantity()).isEqualTo(0);

		// 실제 생성된 주문 수 확인
		long orderCount = orderRepository.count();
		System.out.println("재고 부족 테스트 - 총 생성된 주문 수: " + orderCount);
		assertThat(orderCount).isLessThanOrEqualTo(10); // 최대 10개만 성공해야 함
	}
}
```

