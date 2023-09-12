

-- Database of to-do tasks
/* Delete the tables if they already exist */
drop table if exists Tasks;

/* Create the schema for our tables */
create table tasks(id int unsigned auto_increment primary key, name text, is_finished bool);

/* C - Insert into out db */
insert into tasks values(1,'Walk the dog',false);
insert into tasks values(2,'Clean the house',true);
insert into tasks values(3,'Buy new car',false);
insert into tasks values(4,'Learn how to fly',false);

/* R - select all not finished tasks */
select * from tasks where is_finished = false;

/* U - update task no.4 to: learn how to drive a car  and task no.2 to finished*/
UPDATE tasks SET name='Learn how to drive a car' WHERE id=4;
update tasks set is_finished=false where id=2;

/* D - delete task no.1 */
delete from tasks where id = 1;


