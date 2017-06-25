package data.h2;

import java.sql.Connection;
import java.util.List;

import data.ArztDAO;
import data.Patient;
import data.PatientenDAO;

public class H2PatientenDAO implements PatientenDAO {
	Connection connection;

	public H2PatientenDAO() {
		connection = H2DAOFactory.getConnection();
	}

	@Override
	public boolean getPatient(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean patientExists(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deletePatient(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Patient findPatient(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient findPatient(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient findPatient(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient findPatientByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> searchPatient(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePatient(Patient patienten) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Patient> findPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
