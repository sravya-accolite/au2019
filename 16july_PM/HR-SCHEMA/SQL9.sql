
  
        call getNewSalary(11,10,@new_sal);
select @new_sal as New_Salary;

delimiter $$
create procedure updateSal(IN empId int)
BEGIN
	call getNewSalary(empId,13,@new_sal);
	update employee set salary=@new_sal where employee_id=empId;
END$$