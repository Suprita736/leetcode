# Write your MySQL query statement below
SELECT actor_id,director_id
FROM (SELECT actor_id, director_id,COUNT(actor_id) AS c
FROM ActorDirector
GROUP BY actor_id,director_id) AS ActorDirector
WHERE c >= 3;