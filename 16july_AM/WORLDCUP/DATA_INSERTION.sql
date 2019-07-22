insert into player_statistics(match_id,player_id,player_match_score,player_match_wickets,team_id) values(1,7,85,0,1);
Insert into player_statistics Values(2,23,100,0,4);
Insert into player_statistics Values(2,25,120,1,3);
Insert into player_statistics Values(2,26,50,0,3);
Insert into player_statistics Values(2,24,2,5,4);
Insert into player_statistics Values(3,30,28,2,5);
Insert into player_statistics Values(3,39,21,3,2);
Insert into player_statistics Values(4,38,123,0,1);
Insert into player_statistics Values(4,42,1,4,5);
Insert into player_statistics Values(5,30,78,3,5);
Insert into player_statistics Values(5,23,56,0,4);

SELECT * FROM player_statistics;
-------------------------------------------------------------------------------------------------------------------
insert into team_info values(1,'india',2);
insert into team_info values(2,'south africa',0);
insert into team_info values(3,'england',1);
insert into team_info values(4,'australia',0);
insert into team_info values(5,'west indies',2);
-----------------------------------------------------------------------------------------------------------------------
insert into team_performance values(1,1,250,8,"won");
Insert into team_performance(match_id,team_id,team_score,team_wickets,status) Values(2,4,250,8 ,"lost");
Insert into team_performance(match_id,team_id,team_score,team_wickets,status) Values(2,3,251,6,"won");
Insert into team_performance(match_id,team_id,team_score,team_wickets,status) Values(3,5,278,5,"won");
Insert into team_performance(match_id,team_id,team_score,team_wickets,status) Values(3 ,2,200,10,"lost");
Insert into team_performance(match_id,team_id,team_score,team_wickets,status) Values(4 ,1,350,5,"won");
Insert into team_performance(match_id,team_id,team_score,team_wickets,status) Values(4,5,203,10,"lost");
Insert into team_performance(match_id,team_id,team_score,team_wickets,status) Values(5 ,5,324,7,"won");
Insert into team_performance(match_id,team_id,team_score,team_wickets,status) Values(5 ,4,250,8,"lost");
---------------------------------------------------------------------------------------------------------------------------

insert into player_info values(7,1,"ms dhoni","batsman","5000",2);
insert into player_info values(11,1,"kholi","batsman","8000",2);
insert into player_info values(3,1,"bumrah","bowler","100",100);
insert into player_info values(17,1,"jadeja","bowler","500",80);
insert into player_info values(18,1,"bhuvaneshwar","bowler","50",90);
insert into player_info values(7,2,"faf","batsman","5000",2);
insert into player_info values(11,2,"duminy","batsman","8000",2);
insert into player_info values(3,2,"tahir","bowler","100",100);
insert into player_info values(17,2,"steyn","bowler","500",80);
insert into player_info values(18,2,"devillers","batsman","5000",0);
Insert into player_info Values(23,4,"Kane","batsman",4598,2);
Insert into player_info Values(25,3,"root","batsman",6789,10);
Insert into player_info Values(26,3,"buttler","batsman",3488,0);
Insert into player_info Values(24,4,"boult","bowler",450,27);
Insert into player_info Values(30,5,"gayle","batsman",6570,24);
Insert into player_info Values(31,3,"stokes","allrounder",4678,30);
Insert into player_info Values(32,5,"holder","bowler",2399,70);
Insert into player_info Values(37,3,"ali","allrounder",5643,58);
Insert into player_info Values(38,1,"dhawan","batsman",8000,0);
Insert into player_info Values(39,2,"shamsi","batsman",3211,23);
Insert into player_info Values(40,4,"henry","bowler",123,89);
Insert into player_info Values(41,4,"guptill","batsman",7570,0);
Insert into player_info Values(42,5,"cottrell","bowler",34,40);
Insert into player_info Values(43,3,"morgan","batsman",9876,0); 
Insert into player_info Values(44,3,"roy","batsman",6678,0);
select * from player_info;



