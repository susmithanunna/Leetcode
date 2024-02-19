# Write your MySQL query statement below
select en.unique_id,e.name from Employees as e left join EmployeeUNI as en on e.id=en.id