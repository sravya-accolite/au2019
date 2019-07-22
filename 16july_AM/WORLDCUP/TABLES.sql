create table player_statistics(        
match_id INT NOT NULL,    
player_id INT NOT NULL,    
player_match_score INT,    
player_match_wickets INT,    
primary key(match_id,player_id) 
);
ALTER TABLE player_statistics
ADD FOREIGN KEY (player_id) REFERENCES player_info(player_id);
ALter table player_statistics add column team_id INT NOT NULL;
alter table player_statistics drop primary key, add primary key(match_id,player_id, team_id);
ALTER TABLE player_statistics
ADD FOREIGN KEY (team_id) REFERENCES team_info(team_id);

---------------------------------------------------------------------------
create table player_info(
player_id INT NOT NULL,
team_id INT NOT NULL,
player_name varchar(256) NOT NULL,
player_type varchar(256) NOT NULL CHECK (player_type IN ('batsman','bowler','allrounder')),
player_score INT,
player_wickets INT,
primary key(player_id)
);
ALTER TABLE player_info
ADD FOREIGN KEY (team_id) REFERENCES team_info(team_id);
alter table player_info drop primary key, add primary key(player_id, team_id);
desc player_info;
----------------------------------------------------
create table team_info (
team_id int not null,
team_name varchar(256),
matches_win int,
primary key (team_id)
);
---------------------------------------------------------------
create table team_performance(
   match_id INT NOT NULL,
   team_id INT NOT NULL,
   team_score INT,
   team_wickets INT,
   status varchar(256) NOT NULL CHECK (status IN ('won','lost','draw')),
   primary key(match_id,team_id)
);
ALTER TABLE team_performance
ADD FOREIGN KEY (team_id) REFERENCES team_info(team_id);
desc team_performance;
--------------------------------------------------------------------------------

desc team_info;






