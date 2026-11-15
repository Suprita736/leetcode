# Write your MySQL query statement below
SELECT sell_date, COUNT(sell_date) AS num_sold, GROUP_CONCAT(DISTINCT product SEPARATOR ',') AS products
FROM (SELECT DISTINCT sell_date, product
FROM Activities
GROUP BY sell_date,product) AS Activities
GROUP BY sell_date
ORDER BY sell_date;