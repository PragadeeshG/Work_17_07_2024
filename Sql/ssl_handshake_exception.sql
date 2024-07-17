create table if not exists ssl_handshake_exception(
key_store_file_name Integer not null,
key_store_password Integer null,
server_root varchar(255) null,
server_inter Integer null,
main_cert varchar(255) null,
cert_type varchar(255) null,
trustore_type varchar(255) null,
org_name varchar(255) null,
ca_name varchar(255) null,
validity varchar(255) null,
remarks varchar(255) null,
constraint ssl_handshake_exception_pk primary key(key_store_file_name));