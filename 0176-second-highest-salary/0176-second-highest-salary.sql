# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
Where salary<(Select MAX(salary) FROM Employee);