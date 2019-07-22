create table friend_list(Nam varchar(50),friend_name varchar(20));
insert into friend_list values('sam','ram');
insert into friend_list values('sam','vamsi');
insert into friend_list values('vamsi','ram');
insert into friend_list values('vamsi','john');
insert into friend_list values('ram','vijay');
insert into friend_list values('ram','anand');
select * from friend_list;
select f.nam,f1.friend_name AS 'FRIEND_OF_FRIEND of SAM' from friend_list f inner join friend_list f1 on f.nam=f1.nam;
select nam,friend_name as 'FRIEND_OF_FIREND OF SAM' from friend_list where nam='sam' and
friend_name in (select friend_name from friend_list where 
friend_name in (select friend_name from friend_list where nam='ram'));
