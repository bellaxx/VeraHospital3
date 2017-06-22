package praesentation;

import javax.faces.bean.ManagedBean;

import businesslogic.UserManager;
import data.UserPatient;

/**
 * Servlet implementation class NeuerPatientBean
 */
@ManagedBean
public class NeuerPatientBean {
	private UserPatient patient = new UserPatient();
	
	public void setPatient(UserPatient patient){
		this.patient = patient;
	}
	
	public UserPatient getPatient(){
		return this.patient;
	}
	
	public String save(){
		// neuen Patienten erstellen
		UserManager.addPatient(patient);
		// zurück zur Übersicht
		return "meinePatienten.xhtml";
	}
}
