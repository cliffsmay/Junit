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

// This program tests the Treatment model class

public class TestTreatment {
	private Treatment treatment;

	// Gets called before the test run
	
	@Before
	public void before() {
		this.treatment = new Treatment("08/31/2019", "Influenza", "Fever");
		this.treatment.setTreatmentDate("08/31/2019");
		this.treatment.setDiagnose("Influenza");
		this.treatment.setDescription("Fever");
	}

	// Tests that the treatment set date method is correct

	@Test
	public void testSetTreatmentDate() {
		assertTrue(treatment.getTreatmentDate().equals("08/31/2019"));
	}

	// Tests that the treatment set diagnose method is correct

	@Test
	public void testSetDiagnose() {
		assertTrue(treatment.getDiagnose().equals("Influenza"));
	}
	
	// Tests that the treatment set description method is correct

	@Test
	public void testSetDescription() {
		assertTrue(treatment.getDescription().equals("Fever"));
	}
}
