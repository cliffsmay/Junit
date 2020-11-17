/**
 * @author Cliff Smay
 * CS 320 Milestone One
 * January 30, 2020 
 */

package medicalApplication.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


import medical.com.medicalApplication.model.MedicalRecord;
import medical.com.medicalApplication.model.Patient;
import medical.com.medicalApplication.services.MedicalRescordService;

// This program tests the medical record service class

public class TestMedicalRescordService {
	private Patient patients;
	private MedicalRecord medicalRecords;
	private MedicalRescordService patient;
	
	// Gets called before the test run
	
	@Before
	public void setUp() throws Exception {
		MedicalRescordService.getReference().addPatient("Thomas Miller", "4321");
		this.patients = MedicalRescordService.getReference().getPatient("4321");
	}
	
	// Tests that the add patient method is correct
	
	@Test
	public void testAddPatient() {
		assertTrue(patients.getName().equals("Thomas Miller"));
	}
	
	// Tests that the get medical record method is correct
	
	@Test
	public void testGetMedicalRecord() {
		assertTrue(medicalRecords.getPatient().equals(null));
	}
	
	// Tests that the get all patients method is correct
	
    @Test
    public void testGetAllPatients() {
        assertEquals(0, patient.getAllPatients().size());
        assertEquals(new ArrayList<Patient>(), patient.getAllPatients());
	}

}
