package com.accolite.au.employee;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.accolite.au.Employe.Main;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.DEFAULT)
public class MainTest {

	private Main app = new Main();
	private static Employee emp = new Employee();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		emp.setEmployeeId(281);
		emp.setEmployeeName("sravya");
		emp.setDept("acc");
		emp.setSalary(57000);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Test case being tested...");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test(expected=NullPointerException.class)
	public void testIsListEmp()
	{
		assertNotEquals("true",app.isListEmpty());
	}
	

	@Test
	public void testAddEmployee() {
		assertEquals(emp,app.addEmployee(emp));
	}

	@Test(expected=NullPointerException.class)
	public void testListEmployee()
	{
		assertNotEquals("false",app.ListEmployee());
	}
	
	@Test
	public void testGetEmployee() {
		assertEquals(1,app.getEmployee("sravya"));
	}
	
	@Test
	public void testUpdateEmployee()
	{
		assertNotEquals(emp.getEmployeeName(),app.updateEmployee("sravya", 281));
		assertNotEquals("not found",app.updateEmployee("sravya", 281));
		assertNotNull(app.updateEmployee("sravya", 281));
	}
	
	@Test
	public void testDeleteEmployee() {
		assertNotEquals(1,app.deleteEmployee(281));
	}
	
	@Test
	public void testGetSalaryFromDept()
	{
		assertNotNull(app.getSalaryFromDept("Acc"));
	}
}
