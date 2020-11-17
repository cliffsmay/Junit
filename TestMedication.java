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

// This program tests the medication model class

public class TestMedication {
	private Medication medication;
	
	// Gets called before the test run

	@Before
	public void before() {
		this.medication = new Medication("Lisinopril", "01/01/2019", "12/31/2019", "10mg");
	}
	
	// Tests that the medication set name method is correct

	@Test
	public void testSetName() {
		assertTrue(medication.getName().equals("Lisinopril"));
	}
	
	// Tests that the medication set start date method is correct

	@Test
	public void testSetStartDate() {
		assertTrue(medication.getStartDate().equals("01/01/2019"));
	}

	// Tests that the medication set end date method is correct

	@Test
	public void testSetEndDate() {
		assertTrue(medication.getEndDate().equals("12/31/2019"));
	}
	
	// Tests that the medication set dose method is correct

	@Test
	public void testSetDose() {
		assertTrue(medication.getDose().equals("10mg"));
	}
}
