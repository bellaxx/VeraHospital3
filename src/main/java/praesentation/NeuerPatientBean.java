package praesentation;

import javax.faces.bean.ManagedBean;

import businesslogic.PatientenManager;
import data.UserPatient;

@ManagedBean(name="neuerPatientBean")
@SessionScoped
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
		PatientenManager.addPatient(patient);
		// zurück zur Übersicht
		return "meinePatienten.xhtml";
	}
}
