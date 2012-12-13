create table student(
       stu_id number,
       stu_name varchar2(255),
       stu_gender varchar2(2),
       stu_age number
)
tablespace finance;

create sequence s_student
increment by 1
start with 1;

alter table student
add constraint pk_student primary key(stu_id);