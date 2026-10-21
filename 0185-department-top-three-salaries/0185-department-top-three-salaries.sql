# Write your MySQL query statement belo
SELECT d.name as Department,e.name as Employee,e.salary as Salary
From Employee as e
JOIN Department as d
ON e.departmentId=d.id
Where 3>(select count(distinct(e2.salary))
        from Employee e2
        where e2.Salary>e.salary
        and e.DepartmentId=e2.DepartmentId)
