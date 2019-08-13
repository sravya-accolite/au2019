select l.city,d.department_name,count(e.employee_id)
from locations l 
left join departments d 
on l.location_id=d.location_id
left join employees e 
on d.department_id=e.department_id
group by l.city,d.department_name;