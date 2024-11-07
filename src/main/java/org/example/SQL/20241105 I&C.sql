insert into member3
values (5,5,5,5,now());
select * from member3;

insert into member3
values(6,6,6,6,now(),'삼성');

insert into member3
values(8,8,8,8,now());



CREATE TABLE example1 (
 id INT AUTO_INCREMENT,
 name VARCHAR(50),
 created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (id)
);

select * from example1;

insert into example1 values (null,2,default,default);

delete from example1 where name = 2;
desc example1;

insert into example1 (name) values ('Jane Smith');
update example1
set updated_at = '2021-02-21 12:34:56'
where id = 11;

select * from member3;

SELECT location, COUNT(*) 
FROM member3 
GROUP BY location 
HAVING COUNT(*) > 1;

UPDATE member3 
SET location = NULL 
WHERE location = '';

insert into
member3(name,tel,team,company,location)
values (4,3,now(),default,'강남');
create database shop6;

CREATE TABLE shop6.productOrder (
    id VARCHAR(100) PRIMARY KEY COMMENT '아이디',
    title VARCHAR(100) NOT NULL COMMENT '제품 이름',
    price INT COMMENT '제품 가격',
    buydate DATE COMMENT '제품 구매일', 
    addr VARCHAR(200) NOT NULL DEFAULT 'home' COMMENT '제품 배송 주소'
);

select * from shop6.productOrder;
desc shop6.productOrder;
delete from shop6.productOrder;
use shop6;
insert into productOrder values (100,'hat',1000,now(),'office');
insert into productOrder values (200,'mouse',2000,now(),default);
insert into productOrder values (300,'pen',default,now(),default);

delete from productOrder where id = 3;

CREATE TABLE member4
 ( ID VARCHAR(100) PRIMARY KEY,
PW VARCHAR(100),
NAME VARCHAR(100),
TEL VARCHAR(100),
TEAM DATE, 
COMPANY VARCHAR(100) DEFAULT 'multi' NOT NULL,
LOCATION VARCHAR(100) UNIQUE);

select * from product3;
insert into member4
values (1,1,1,1,sysdate(),default,'대구');

select * from school.dept;
select ename, sal*12 as '연봉' from emp;
use exc;
select * from exc.product3 order by price desc;
select * from exc.product3 order by company;
select distinct * from exc.product3;
select price * 5 as 'price5' from exc.product3;
select company,name from exc.product3 where price = 5000;
select company,name,price from exc.product3 where price >= 3000 and price <= 6000;
select name,company from product3 where company != 'c100';
select name,price from product3 where company = 'c100' or company = 'c200';
select * from product3 where name like '%4';
select * from product3 where content like '%food%';
update product3 set content = '품절' where price = 5000;
update product3 set img = 'o.img' where id = 100 or id = 102;
select * from emp order by sal desc;
delete from product3 where name = 'c100';
delete from product3;
drop table product3;

use sakila;
create table city1 
as select * from city;
select * from city1;
use world;
create table city1
as select * from city;
select * from city1;
select ID,Name from city1 order by CountryCode;
select distinct CountryCode from city1;
select distinct district from city1 order by district desc;
select name as '도시명',CountryCode as '나라코드',
Population as '인구수' from city1 where population = '234323';
select name, population  from city1 where countrycode like 'N%';
select name from city1 where District  like 'K%' or '%G';
select name,district from city1 where population >=450000 or population <=700000;
SELECT id, name FROM city1 WHERE countrycode NOT IN ('AFG', 'NLD', 'ASM');
select id,name from city1 where district is null;
select * from city1 where countrycode = 'NRD' and district = 'Gelderland';

