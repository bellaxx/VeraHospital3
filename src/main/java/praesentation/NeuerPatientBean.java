package praesentation;

import javax.faces.bean.ManagedBean;

import businesslogic.PatientenManager;
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
		PatientenManager.addPatient(patient);
		// zur�ck zur �bersicht
		return "meinePatienten.xhtml";
	}
}
