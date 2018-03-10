create schema if not exists test;
use test;
drop table if exists students;
create table students (
  stud_id int(11) not null auto_increment,
  name varchar(45) not null,
  primary key (stud_id)
)ENgine=InnoDB DEFAUlt charset = utf8;