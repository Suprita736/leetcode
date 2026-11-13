# Write your MySQL query statement below
SELECT class
FROM (SELECT class,COUNT(class) AS class_count
FROM Courses
GROUP BY class) AS class_c
WHERE class_count >= 5;