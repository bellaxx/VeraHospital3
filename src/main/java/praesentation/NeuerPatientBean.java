package praesentation;

<<<<<<< HEAD
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import businesslogic.PatientenManager;
import data.Patient;

=======
import javax.faces.bean.ManagedBean;

import businesslogic.PatientenManager;
import data.UserPatient;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8

@ManagedBean(name="neuerPatientBean")
@SessionScoped
public class NeuerPatientBean {
<<<<<<< HEAD
	private Patient patient = new Patient();
	
	public void setPatient(Patient patient){
		this.patient = patient;
	}
	
	public Patient getPatient(){
=======
	private UserPatient patient = new UserPatient();
	
	public void setPatient(UserPatient patient){
		this.patient = patient;
	}
	
	public UserPatient getPatient(){
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
		return this.patient;
	}
	
	public String save(){
		// neuen Patienten erstellen
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
		// zurück zur Übersicht
		return "meinePatienten.xhtml";
	}
}
