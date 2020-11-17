/**
 * @author Cliff Smay
 * CS 320 Milestone One
 * January 30, 2020 
 */

package medicalApplication.model;

import medical.com.medicalApplication.model.Doctor;
import medical.com.medicalApplication.services.DoctorService;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

//This program tests the doctor service class

public class TestDoctorService {
	private DoctorService doctor;
	private Doctor doctors; 
	
	// Gets called before the test run
	
	@Before
	public void setUp() throws Exception {
		DoctorService.getReference().addDoctor("Michael Green", "1234");
		this.doctor = DoctorService.getReference();
	}

	// Tests that the get all doctors method is correct
	
    @Test
    public void testGetAllDoctors() {
        assertEquals(0,doctor.getAllDoctors().size());
        assertEquals(new ArrayList<Doctor>(), doctor.getAllDoctors());
    }

	// Tests that the add doctor method is correct 
    
    @Test
    public void testAddDoctor() {
        assertTrue(doctors.getName().equals("Michael Green"));
    }
}