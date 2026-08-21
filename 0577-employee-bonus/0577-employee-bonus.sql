# Write your MySQL query statement below
SELECT E.name,B.bonus 
FROM Employee e
LEFT JOIN Bonus b
    On e.empId=b.empId
where b.bonus<1000
OR b.bonus IS NULL;