# Write your MySQL query statement below
select emp.name as Employee from Employee as emp join Employee as mgr on emp.managerId = mgr.id where emp.salary > mgr.salary;