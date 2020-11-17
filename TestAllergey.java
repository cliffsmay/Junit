/**
 * @author Cliff Smay
 * CS 320 Milestone One
 * January 30, 2020 
 */

package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.*;;

// This program tests the Allergey model class

public class TestAllergey {
	private Allergey allergey;

	// Gets called before the test run
	
	@Before
	public void before() {
		this.allergey = new Allergey("Penicillin");
		this.allergey.setName("Penicillin");
	}
	
	// Tests that the allergey set name method is correct

	@Test
	public void testSetName() {
		assertTrue(allergey.getName().equals("Penicillin"));
	}

}
