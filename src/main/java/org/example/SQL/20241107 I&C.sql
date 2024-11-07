-- 데이터베이스생성
CREATE DATABASE company;
USE company;

-- departments 테이블 생성
CREATE TABLE departments (
 department_id INT PRIMARY KEY,
 department_name VARCHAR(50) NOT NULL,
 location_id INT
);
-- employees 테이블 생성
CREATE TABLE employees (
 employee_id INT PRIMARY KEY,
 first_name VARCHAR(50),
 last_name VARCHAR(50),
 department_id INT,
 job_id VARCHAR(20),
 salary DECIMAL(10, 2),
 FOREIGN KEY (department_id) REFERENCES
departments(department_id)
);

-- departments 테이블에 데이터 삽입
INSERT INTO departments (department_id, department_name,
location_id) VALUES
(1, 'Sales', 1700),
(2, 'Engineering', 1800),
(3, 'HR', 1700),
(4, 'Finance', 1900);
-- employees 테이블에 데이터 삽입

INSERT INTO employees (employee_id, first_name, last_name,
department_id, job_id, salary) VALUES
(101, 'John', 'Doe', 1, 'Salesman', 60000),
(102, 'Jane', 'Smith', 2, 'Engineer', 80000),
(103, 'Sam', 'Brown', 1, 'Salesman', 62000),
(104, 'Sue', 'Wilson', 3, 'HR Specialist', 55000),
(105, 'Jim', 'Taylor', 2, 'Engineer', 78000),
(106, 'Amy', 'Adams', 4, 'Accountant', 70000);

select * from employees;
select * from departments;

## fk가 설정되어 있는 경우
## 1. 테이블 생성 : fk가 없는 테이블부터( dept --> emp)
## 2. 데이터 삽입 : fk가 없는 테이블부터 ( dept --> emp)

select department_id from departments
union all -- 중복허용O 그냥 union은 중복허용 안됨
select employee_id from employees;


select * from departments;

select location_id
from departments
where department_id <=2
union
select location_id
from departments
where department_id <=3;

use shop;
 CREATE TABLE `bbs` (
  `no` int PRIMARY KEY AUTO_INCREMENT ,
  `title` varchar(45),
  `content` varchar(45),
  `writer` varchar(45)
);
select * from bbs;
update bbs 
set writer = 'ice'
where no in (101, 103, 105, 107);


insert into `bbs` values (100,'fun1','fun contents1','ice');
insert into `bbs` values (101,'fun1','fun contents1','ice');
insert into `bbs` values (102,'fun1','fun contents1','ice');
insert into `bbs` values (103,'fun1','fun contents1','ice');
insert into `bbs` values (104,'fun1','fun contents1','ice');
insert into `bbs` values (105,'fun1','fun contents1','ice');
insert into `bbs` values (106,'fun1','fun contents1','ice');
insert into `bbs` values (107,'fun1','fun contents1','ice');
insert into `bbs` values (108,'fun1','fun contents1','ice');
insert into `bbs` values (109,'fun1','fun contents1','ice');
insert into `bbs` values (110,'fun1','fun contents1','ice');


create table member(
	id varchar(250) primary key,
    pw varchar(250),
    name varchar(250),
    tel varchar(250)
);
insert into member
values
('ice', '1234,', 'ice', '5555'),
('apple', '1234,', 'apple', '5555');


alter table bbs
add
foreign key (writer) references member(id);

desc bbs;

select b.no,b.title,b.writer, m.tel from bbs b
 join member m on m.name = b. writer
 WHERE b.writer = m.id
 order by b.no;
 use school;
 select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.sal,
 e.comm, e.deptno, d.dname, d.loc
 from emp e, dept d
 where e.deptno = d.deptno
 order by empno;

select e.empno, e.ename, e.job, d.dname, d.deptno
from emp e, dept  d
where e.deptno = d.deptno and empno > 7400
order by empno;

select e.empno, e.ename, e.job, d.dname, d.deptno
from emp e
join dept d
on e.deptno = d.deptno -- 조인 기준 조건 on뒤에 써줌!
where empno > 7400 -- 부가적인 조건
order by empno;

-- 조인할 양쪽 테이블에 기준되는 컬럼값이 동일하게 나온 경우만 조인


use shop;
select m.id, m.name, b.no, b.title, b.content
from member m  join bbs b on
m.id = b.writer;

select m.id, m.name, b.no, b.title, b.content
from member m, bbs b
where m.id = b.writer;

select m.id, m.name, b.no, b.title, b.content
from member m join bbs b on
m.id = b.writer
where b.no>105
order by b.title desc;

insert into member values ('melon', '1234', 'melon', '7777');
insert into member values ('pen', '1234', 'pen', '8888');
update member set pw = '1234';

select * from member;
select count(*) from member;

select m.*,b.no, b.title
from member m
left join bbs b
on m.id = b.writer;