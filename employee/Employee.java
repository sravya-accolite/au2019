package com.accolite.au.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Employee {
	int salary;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	String dept;
	
	private static int EmployeeId;
	private String employeeName;
//	public Employee(int i, String string) {
//		// TODO Auto-generated constructor stub
//	}
//	public Employee(int i, String string) {
		// TODO Auto-generated constructor stub
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public static void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public static void setEmployeeName(String employeeName) {
		//this.employeeName = employeeName;
	}
	
	public void setListTitles(List<String> employee1) {
		// TODO Auto-generated method stub
	}
	public List<String> getListTitles() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	}
	