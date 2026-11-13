# Write your MySQL query statement below
WITH o AS (SELECT customer_number,COUNT(customer_number) AS c
FROM orders
GROUP BY customer_number)

SELECT customer_number
FROM o
WHERE c = (SELECT MAX(c) FROM o);