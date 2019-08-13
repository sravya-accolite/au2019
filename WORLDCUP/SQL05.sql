select * from player_info x 
join (select player_id,team_id,sum(player_match_wickets) 
from player_statistics x group by player_id,team_id order by sum(player_match_wickets) desc limit 5) y 
on x.team_id = y.team_id and x.player_id=y.player_id;
