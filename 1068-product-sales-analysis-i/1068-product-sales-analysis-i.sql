# Write your MySQL query statement below
SELECT p.product_name,s.year,s.price 
From SALES AS s
Inner JOIN Product as p
ON p.product_id=s.product_id;