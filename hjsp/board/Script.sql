create table board(
num int auto_increment primary key,
subject varchar(100) not null,
content text,
hit int default 0,
writeDate datetime default now(),
updateDate datetime ,
deleteDate datetime);

desc board;

insert into board(subject,content) values('테스트','테스트입니다요');

select * from board;

select @@global.time_zone, @@session.time_zone;

insert into board(subject,content) values('테스트2','테스트입니다요2');