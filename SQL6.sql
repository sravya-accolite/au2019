create table cricket_match(matches int(6),player varchar(20),score int(5));
insert into cricket_match values(1 ,'A', 0);
insert into cricket_match values(1 ,'b', 101);
insert into cricket_match values(1 ,'c', 55);
insert into cricket_match values(1 ,'d', 23);
insert into cricket_match values(1 ,'e', 12);
insert into cricket_match values(1 ,'f', 100);
insert into cricket_match values(2 ,'A', 146);
insert into cricket_match values(2 ,'b', 120);
insert into cricket_match values(2 ,'c', 104);
insert into cricket_match values(2 ,'d', 3);
insert into cricket_match values(2 ,'e', 54);
insert into cricket_match values(2 ,'f', 111);
select * from cricket_match;
select player from cricket_match where score>=100 and matches in (1,2);
select player from cricket_match where score>=100 and matches =1 or matches=2  