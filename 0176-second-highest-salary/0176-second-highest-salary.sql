# Write your MySQL query statement below
SELECT(
    SELECT DISTINCT salary
    FROM(
        SELECT 
            salary,
            DENSE_RANK() OVER (ORDER BY salary DESC) As rnk
        FROM Employee
    ) AS RankedSalaries
    Where rnk=2

) AS SecondHighestSalary;