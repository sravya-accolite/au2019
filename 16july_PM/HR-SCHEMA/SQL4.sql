select department_name from departments d 
left join employees e 
on d.department_id=e.department_id
group by department_name
having count(e.employee_id)>5;