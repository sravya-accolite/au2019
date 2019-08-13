select * from employees;

delimiter $$
create procedure getNewSalary(IN empId int,IN hike int,OUT sal float)
BEGIN
	declare curSalary int;
    select salary into curSalary from employee where employee_id=empId;
    select (curSalary+((hike*curSalary)/100)) into sal;
END$$
 call getNewSalary(11,10,@new_sal);
select @new_sal as New_Salary;