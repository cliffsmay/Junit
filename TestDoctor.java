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

// This program tests the Doctor model class

public class TestDoctor {
	private Doctor doctor;
	
	// Gets called before the test run

	@Before
	public void before() {
		this.doctor = new Doctor("Jonathan Smith", "1234");
		this.doctor.setId("1234");
	}
	
	// Tests that the doctor set name method is correct

	@Test
	public void testSetName() {
		assertTrue(doctor.getName().equals("Jonathan Smith"));
	}
	
	// Tests that the doctor set id method is correct

	@Test
	public void testSetId() {
		assertTrue(doctor.getId().equals("1234"));
	}

}






