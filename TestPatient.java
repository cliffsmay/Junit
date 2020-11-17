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

// This program tests the Patient model class

public class TestPatient {
	private Patient patient;
	
	// Gets called before the test run

	@Before
	public void before() {
		this.patient = new Patient("William Johnson", "0012");
		this.patient.setId("0012");
	}
	
	// Tests that the patient set name method is correct

	@Test
	public void testSetName() {
		assertTrue(patient.getName().equals("William Johnson"));
	}
	
	// Tests that the patient set id method is correct

	@Test
	public void testSetId() {
		assertTrue(patient.getId().equals("0012"));
	}

}
