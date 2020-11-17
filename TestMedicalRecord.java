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

import medical.com.medicalApplication.model.*;;

// This program tests the medical record model class

public class TestMedicalRecord {
	private Patient patient;
	private PatientHistory history;
	private ArrayList<Treatment> treatments;
	private ArrayList<Medication> medications;
	private ArrayList<Allergey> allergy;
	
	// Gets called before the test run

	@Before
	public void before() {
		this.patient = new Patient ("Robert Black", "0055");
		this.history = new PatientHistory();
		this.treatments = new ArrayList<Treatment>();
		this.medications = new ArrayList<Medication>();
		this.allergy = new ArrayList<Allergey>();
		treatments.add (new Treatment("02/21/2019", "bronchitis", "bronchial inflammation"));
		medications.add(new Medication("Tylenol", "03/01/2019", "08/31/2019", "100mg" ));
		allergy.add(new Allergey("naproxen"));
	}
	
	// Tests that the get patient method is correct

	@Test
	public void testGetPatient() {
		assertTrue(patient.getName().equals("Robert Black"));
	}
	
	// Tests that the history method is correct
	
	@Test
	public void testGetHistory(){
		history.addTreatment(new Treatment("02/21/2019", "bronchitis", "bronchial inflammation"));	
		assertTrue(history.getAllTreatments().stream().anyMatch(treatment -> treatment.getTreatmentDate().equals("02/21/2019") && 
		treatment.getDiagnose().equals("bronchitis") && treatment.getDescription().equals("bronchial inflammation")));
		
		history.addAllergy(new Allergey("naproxen"));
		assertTrue(history.getAlergies().stream().anyMatch(allergey -> allergey.getName().equals("naproxen")));
	
		history.addMedication(new Medication("Tylenol", "03/01/2019", "08/31/2019", "100mg"));	
		assertTrue(history.getAllMedications().stream().anyMatch(medication -> medication.getName().equals("Tylenol") && 
		medication.getStartDate().equals("03/01/2019") && medication.getEndDate().equals("08/31/2019") &&
		medication.getDose().equals("100mg")));
	}
}
	
	





















