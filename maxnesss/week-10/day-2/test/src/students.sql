# create database studentdb;
use studentdb;
create table students (student_id int primary key auto_increment, student_name varchar(20), student_age int, student_address varchar(20), student_phone varchar(20));
insert into students (student_name, student_age, student_address, student_phone) values ('John', 20, 'New York', '1234567890');
insert into students (student_name, student_age, student_address, student_phone) values ('Peter', 21, 'New York', '1234567890');
insert into students (student_name, student_age, student_address, student_phone) values ('Mark', 22, 'New York', '1234567890');

select * from students;
