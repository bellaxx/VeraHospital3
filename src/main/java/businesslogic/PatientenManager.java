package businesslogic;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import data.Patient;

import data.PatientenDAO;

public class PatientenManager {
<<<<<<< HEAD
 PatientenDAO patientenDAO;
	Patient patient1=new Patient();
	Patient patient2=new Patient();
	public PatientenManager() {
		super();
		//PatientenDAO = DAOFactory.getDAOFactory(Backend.H2).getPatientenDAO();
		patient1.setPatientenId(1);
		patient1.setName("Schneider");
		patient1.setGeburtsdatum("30.02.1969");
		patient1.setDiagnose("Halsschmerzen");
		patient1.setBehandelnderArzt(1);
		
		patient2.setPatientenId(2);
		patient2.setName("Müller");
		patient2.setGeburtsdatum("23.03.1975");
		patient2.setDiagnose("Kopfschmerzen");
		patient2.setBehandelnderArzt(1);
	}

	// Ueberprufen, obe der Patienten bei Registrierung schon existiert.
	public  void addPatient(Patient patient) throws SQLException{
=======
static PatientenDAO patientenDAO;
	
	public PatientenManager() {
		super();
		//PatientenDAO = DAOFactory.getDAOFactory(Backend.H2).getPatientenDAO();
		
	}

	// Ueberprufen, obe der Patienten bei Registrierung schon existiert.
	public static void addPatient(Patient patient) throws SQLException{
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
		//int id = PatientenDAO.getId();
		//Patienten.setId(id);
			patientenDAO.addPatient(patient);
			
	}
	
<<<<<<< HEAD
	public  void deletePatient(int id) throws SQLException{
=======
	public static void deletePatient(int id) throws SQLException{
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
		// Prüfe, ob es den Patienten gibt, wenn ja lösche ihn
		if(patientenDAO.patientExists(id)){
			patientenDAO.deletePatient(id);
		} else
			System.out.println("Diesen Benutzer gibt es nicht");
	}
	
	
	
<<<<<<< HEAD

     
    public  Patient find(int id) {
    	if(id==patient1.getPatientenId())
    		return patient1;
    	if(id==patient2.getPatientenId())
    		return patient2;
    	return null;
    		
      //  return patientenDAO.findPatient(id);
               
    }
     
     
    public  Patient find(String name, String password) throws SQLException{
=======
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
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
    	Patient p = new Patient();
        p = patientenDAO.findPatient(name, password);
        return p;       
    }
    
    
    
<<<<<<< HEAD
    public Patient findPatienten(String name){
    	// return patientenDAO.findPatientByName(name);
        if(patient1.name==name){
        	return patient1;
        } else if(patient2.name==name){
        	return patient2;
        } return null;
    }
 
     
    public  List<Patient> search(String name) throws SQLException{
=======
    public Patient findPatienten(String name) throws SQLException{
    	Patient p = new Patient();
    	p = patientenDAO.findPatientByName(name);
        return p;       
    }
 
     
    public static List<Patient> search(String name) throws SQLException{
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
    	List<Patient> pl = new ArrayList<Patient>();      
        pl =  patientenDAO.searchPatient(name);
        return pl;
    }
     
<<<<<<< HEAD
    public  List<Patient> getPatientenListe(int arztId) {
    	List<Patient> pl = new ArrayList<Patient>();      
        //pl =  patientenDAO.findPatients();
    	if(patient1.getBehandelnderArzt()==arztId)
    		pl.add(patient1);
    	if(patient2.getBehandelnderArzt()==arztId)
    		pl.add(patient2);
=======
    public static List<Patient> getPatientenListe() {
    	List<Patient> pl = new ArrayList<Patient>();      
        pl =  patientenDAO.findPatients();
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
        return pl;
    	
	}
   
     
<<<<<<< HEAD
    public  Patient update(Patient Patienten) throws SQLException{
=======
    public static Patient update(Patient Patienten) throws SQLException{
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
    	patientenDAO.updatePatient(Patienten);
        return Patienten;
    }

<<<<<<< HEAD
	public  void updatePatient(String name, String neueDiagnose) {
		if(name==patient1.getName())
			patient1.setDiagnose(neueDiagnose);
		if(name==patient2.getName())
			patient2.setDiagnose(neueDiagnose);
=======
	public static void updatePatient(int id, String neueDiagnose) {
		// TODO Auto-generated method stub
		
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
	}



	

	
    
    
    
    
}

<<<<<<< HEAD
=======
=======
public class PatientenManager {

}
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
