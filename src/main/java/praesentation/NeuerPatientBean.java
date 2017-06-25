package praesentation;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import businesslogic.PatientenManager;
import data.Patient;

<<<<<<< HEAD
=======
=======
import javax.faces.bean.ManagedBean;

import businesslogic.PatientenManager;
import data.UserPatient;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce

@ManagedBean(name="neuerPatientBean")
@SessionScoped
public class NeuerPatientBean {
<<<<<<< HEAD
	private Patient patient = new Patient();
	PatientenManager patientenManager=new PatientenManager();
=======
<<<<<<< HEAD
	private Patient patient = new Patient();
	
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
	public void setPatient(Patient patient){
		this.patient = patient;
	}
	
	public Patient getPatient(){
<<<<<<< HEAD
=======
=======
	private UserPatient patient = new UserPatient();
	
	public void setPatient(UserPatient patient){
		this.patient = patient;
	}
	
	public UserPatient getPatient(){
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
		return this.patient;
	}
	
	public String save(){
		// neuen Patienten erstellen
<<<<<<< HEAD
		/*try {
			patientenManager.addPatient(patient);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
=======
<<<<<<< HEAD
		try {
			PatientenManager.addPatient(patient);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
=======
		PatientenManager.addPatient(patient);
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
		// zurück zur Übersicht
		return "meinePatienten.xhtml";
	}
}
