create table color(color_id int(5),color_name varchar(20));
insert into color values(10,'BLUE');
insert into color values(20,'WHITE');
insert into color values(30,'BLACK');
insert into color values(40,'RED');
insert into color values(50,'GREEN');
select * from color;
create table sizes(size_code varchar(35),descriptions varchar(40));
insert into sizes values('xs','extra small');
insert into sizes values('s','small');
insert into sizes values('m','medium');
insert into sizes values('l','large');
insert into sizes values('xl','extra large');
insert into sizes values('xxl','double extra large');
SELECT 
    a.color_name,  b.size_code
FROM 
    color AS a 
  CROSS JOIN 
    sizes AS b;
