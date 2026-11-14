# Write your MySQL query statement below
SELECT p.Product_name, s.year, s.price
FROM Sales s
LEFT JOIN Product p
ON p.product_id=s.product_id;