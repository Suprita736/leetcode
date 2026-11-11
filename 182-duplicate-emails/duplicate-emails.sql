# Write your MySQL query statement below
WITH temp AS(SELECT email, COUNT(email) AS no_of_email 
FROM Person
GROUP BY email)

SELECT email FROM temp WHERE no_of_email > 1;