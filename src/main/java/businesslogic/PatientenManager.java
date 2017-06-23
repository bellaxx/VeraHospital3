package businesslogic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import data.Patient;

import data.PatientenDAO;

public class PatientenManager {
static PatientenDAO patientenDAO;
	
	public PatientenManager() {
		super();
		//PatientenDAO = DAOFactory.getDAOFactory(Backend.H2).getPatientenDAO();
		
	}

	// Ueberprufen, obe der Patienten bei Registrierung schon existiert.
	public static void addPatient(Patient patient) throws SQLException{
		//int id = PatientenDAO.getId();
		//Patienten.setId(id);
			patientenDAO.addPatient(patient);
			
	}
	
	public static void deletePatient(int id) throws SQLException{
		// Prüfe, ob es den Patienten gibt, wenn ja lösche ihn
		if(patientenDAO.patientExists(id)){
			patientenDAO.deletePatient(id);
		} else
			System.out.println("Diesen Benutzer gibt es nicht");
	}
	
	
	
	public static Patient find(String email) throws SQLException{
		Patient p = new Patient();
        p = patientenDAO.findPatient(email);
        return p;       
    }
     
    public static Patient find(int id) throws SQLException{
    	Patient p = new Patient();
        p = patientenDAO.findPatient(id);
        return p;       
    }
     
     
    public static Patient find(String name, String password) throws SQLException{
    	Patient p = new Patient();
        p = patientenDAO.findPatient(name, password);
        return p;       
    }
    
    
    
    public Patient findPatienten(String name) throws SQLException{
    	Patient p = new Patient();
    	p = patientenDAO.findPatientByName(name);
        return p;       
    }
 
     
    public static List<Patient> search(String name) throws SQLException{
    	List<Patient> pl = new ArrayList<Patient>();      
        pl =  patientenDAO.searchPatient(name);
        return pl;
    }
     
    public static List<Patient> getPatientenListe() {
    	List<Patient> pl = new ArrayList<Patient>();      
        pl =  patientenDAO.findPatients();
        return pl;
    	
	}
   
     
    public static Patient update(Patient Patienten) throws SQLException{
    	patientenDAO.updatePatient(Patienten);
        return Patienten;
    }

	public static void updatePatient(int id, String neueDiagnose) {
		// TODO Auto-generated method stub
		
	}



	

	
    
    
    
    
}

