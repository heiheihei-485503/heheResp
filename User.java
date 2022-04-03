ln -s /usr/local/mysql/bin/mysql /usr/bin/mysql

cp mysql.server/ etc/init.d/mysql

ln -s /usr/lib64/libtinfo.so.6/usr/lib64/libtinfo.so.5
ln -s /usr/lib64/libncurses.so.6/usr/lib64/libncurses.so.5

./mysqld  --initialize  --user=mysql     --basedir=/usr/local/mysql/  --datadir=/usr/local/mysql/data/    --lc_messages_dir=/usr/local/mysql/share  --lc_messages_dir=en_US   

./mysqld --initialize-insecure|--initialize --user=mysql --basedir=/usr/local/mysql/ --datadir=数据库存储目录

explicit_defaults_for_timestamp=true

2021-12-16T10:03:46.838567Z 1 [Note] A temporary password is generated for root@localhost: ji(x6dhd&r5Q

2021-12-16T10:03:46.470421Z 0 [Warning] TIMESTAMP with implicit DEFAULT value is deprecated. Please use --explicit_defaults_for_timestamp server option (see documentation for more details).
2021-12-16T10:03:46.470553Z 0 [ERROR] Can't find error-message file '/usr/local/mysql/share/en_US/errmsg.sys'. Check error-message file location and 'lc-messages-dir' configuration directive.
2021-12-16T10:03:46.744346Z 0 [Warning] InnoDB: New log files created, LSN=45790
2021-12-16T10:03:46.780808Z 0 [Warning] InnoDB: Creating foreign key constraint system tables.
2021-12-16T10:03:46.837094Z 0 [Warning] No existing UUID has been found, so we assume that this is the first time that this server has been started. Generating a new UUID: 7583a732-5e57-11ec-8184-000c293dbdbc.
2021-12-16T10:03:46.837753Z 0 [Warning] Gtid table is not ready to be used. Table 'mysql.gtid_executed' cannot be opened.
2021-12-16T10:03:46.838567Z 1 [Note] A temporary password is generated for root@localhost: ji(x6dhd&r5Q


