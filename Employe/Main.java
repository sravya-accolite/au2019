package com.accolite.au.Employe;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sound.sampled.Line;

import com.accolite.au.employee.Employee;



//delete 
//get all employess(list)
//find by id 
//update emp

public class Main {

	public static void main(String[] args) {

	}
	
	
	public boolean isListEmpty()
	{
		List<Employee> employees=getEmpList();
		if(employees==null) 
		{	
			throw new NullPointerException();
		}
		else
			return false;
	}
	
	private List<Employee> getEmpList() {
		// TODO Auto-generated method stub
		return null;
	}


	public Employee addEmployee(Employee emp)
	{
		List<Employee> employees=getEmpList();
		if(employees==null) {
			employees=new ArrayList<Employee>();
		}
		employees.add(emp);
		le.setEmpList(employees);
		return emp;
	}
	
	public boolean ListEmployee()
	{
			List<Employee> employees=getEmpList();
			for(Employee em:employees)
			{
				System.out.println(em.getEmployeeName()+" "+em.getEmployeeId());
			}
			return true;
	}
	
	public int getEmployee(String emp_name)
	{   
		List<Employee> e = getEmpList();
		for(Employee em:e)
		{
			if(em.getEmployeeName()==emp_name)
			{
				return 1;
			}
		}
		return 0;
	}
	public String updateEmployee(String name,int id)
	{
		List<Employee> employees=le.getEmpList();
		for(Employee em:employees)
		{
			if(em.getEmployeeId()==id)
			{
				em.setEmployeeName(name);
				System.out.println("Employee with id:"+id+" is updated to:"+name);
				return em.getEmployeeName();
			}
		}
		return "not found";
	}
	
	public int deleteEmployee(int id)
	{
		List<Employee> employees=getEmpList();
		if(employees==null) 
			return 0;
		else 
		{
			for(Employee em:employees)
			{
				if(em.getEmployeeId()==id)
				{
					employees.remove(em);
					return 1;
				}
			}
		}
		return 0;
	}
	public int getSalaryFromDept(String dept)
	{
		List<Employee> employees=getEmpList();
		for(Employee em:employees)
		{
			if(em.getDept().equals(dept))
			{
				return em.getSalary();
			}
		}
		return (Integer) null;
	}
}

