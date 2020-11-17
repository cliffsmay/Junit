/**
 * @author Cliff Smay
 * CS 320 Milestone One
 * January 30, 2020 
 */

package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.*;

// This program tests the Employee model class

public class TestEmployee {
	private Employee employee;
	
	// Gets called before the test run

	@Before
	public void before() {
		this.employee = new Employee("Joseph Brown", "1111");
	}
	
	// Tests that the employee get name method is correct

	@Test
	public void testGetName() {
		assertTrue(employee.getName().equals("Joseph Brown"));
	}
	
	// Tests that the employee get id method is correct

	@Test
	public void testGetId() {
		assertTrue(employee.getId().equals("1111"));
	}
	
	// Tests that the employee get password method is correct

	@Test
	public void testGetPassword() {
		assertTrue(employee.getPassword().equals("Open"));
	}

}
