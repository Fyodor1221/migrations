-- changeset parfyonov:1
create table PERSONS (
                           id int auto_increment,
                           name varchar(100),
                           surname varchar(100),
                           age int,
                           phone_number varchar(100),
                           primary key (id)
);