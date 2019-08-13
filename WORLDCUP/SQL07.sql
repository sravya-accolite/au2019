update player_info set player_score = player_score+10 
where team_id in 
(select team_id from team_performance group by team_id 
having avg(team_score) <=  ALL (select avg(team_score) from team_performance group by team_id) );

select player_score from player_info;