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

import medical.com.medicalApplication.model.*;


//This program tests the Patient History model class

public class TestPatientHistory {
	private PatientHistory patientHistory;
	private ArrayList<Treatment> treatments;
	private ArrayList<Medication> medications;
	private ArrayList<Allergey> allergy;

	// Gets called before the test run
	
	@Before
	public void before(){
		this.patientHistory = new PatientHistory();
		this.treatments = new ArrayList<Treatment>();
		this.medications = new ArrayList<Medication>();
		this.allergy = new ArrayList<Allergey>();
		treatments.add (new Treatment("02/21/2019", "bronchitis", "bronchial inflammation"));
		medications.add(new Medication("Tylenol", "03/01/2019", "08/31/2019", "100mg" ));
		allergy.add(new Allergey("naproxen"));
	}
	
	// Tests that the get all treatments method is correct
	
	@Test
	public void testGetAllTreatments(){
		patientHistory.addTreatment(new Treatment("02/21/2019", "bronchitis", "bronchial inflammation"));	
		assertTrue(patientHistory.getAllTreatments().stream().anyMatch(treatment -> treatment.getTreatmentDate().equals("02/21/2019") && 
		treatment.getDiagnose().equals("bronchitis") && treatment.getDescription().equals("bronchial inflammation")));
	}

	// Tests that the get allergies method is correct

	@Test
	public void testgetAlergies() {
		patientHistory.addAllergy(new Allergey("naproxen"));
		assertTrue(patientHistory.getAlergies().stream().anyMatch(allergey -> allergey.getName().equals("naproxen")));
	
	}
	
	// Tests that the get all medications method is correct
	
	@Test
	public void testGetAllMedications(){
		patientHistory.addMedication(new Medication("Tylenol", "03/01/2019", "08/31/2019", "100mg"));	
		assertTrue(patientHistory.getAllMedications().stream().anyMatch(medication -> medication.getName().equals("Tylenol") && 
		medication.getStartDate().equals("03/01/2019") && medication.getEndDate().equals("08/31/2019") &&
		medication.getDose().equals("100mg")));
	}
}













