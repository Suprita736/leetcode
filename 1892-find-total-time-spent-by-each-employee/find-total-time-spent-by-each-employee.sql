# Write your MySQL query statement below
WITH temp AS (SELECT emp_id, event_day,out_time - in_time AS total_time
FROM Employees)

SELECT event_day AS day,emp_id,sum(total_time) AS total_time
FROM temp
GROUP BY emp_id,event_day;