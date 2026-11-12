# Write your MySQL query statement below
SELECT w1.id 
FROM weather w1
JOIN weather w2 
ON w2.recordDate = DATE_SUB(w1.recordDate, INTERVAL 1 DAY)
WHERE w2.temperature < w1.temperature;