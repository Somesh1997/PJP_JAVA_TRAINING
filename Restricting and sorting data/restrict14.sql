select last_name,job_id,salary
 from employees 
 where (job_id='SA_REP' or job_id='ST_CLERK')and salary not in(2500,3500,7000);



