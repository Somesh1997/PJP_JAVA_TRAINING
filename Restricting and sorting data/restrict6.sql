select first_name as "Employee",salary as "Monthly Salary"
 from employees
 where (department_id=20 or department_id=50)and (salary between 5000 and 12000);
