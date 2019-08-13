select * from team_info x 
join (select team_id,avg(team_score),count(*) 
from team_performance group by team_id) y
 on x.team_id=y.team_id;
