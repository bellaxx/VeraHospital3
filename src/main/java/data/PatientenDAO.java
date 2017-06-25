package data;

import java.util.List;

public interface PatientenDAO {

	boolean getPatient(String email);

	void addPatient(Patient patient);

	boolean patientExists(int id);

	void deletePatient(int id);

	Patient findPatient(String email);

	Patient findPatient(int id);

	Patient findPatient(String name, String password);

	Patient findPatientByName(String name);

	List<Patient> searchPatient(String name);

	Object findPatient();

	void updatePatient(Patient patienten);

	List<Patient> findPatients();





	  

	
}
