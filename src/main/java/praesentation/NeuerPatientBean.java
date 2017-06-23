package praesentation;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import businesslogic.PatientenManager;
import data.Patient;


@ManagedBean(name="neuerPatientBean")
@SessionScoped
public class NeuerPatientBean {
	private Patient patient = new Patient();
	
	public void setPatient(Patient patient){
		this.patient = patient;
	}
	
	public Patient getPatient(){
		return this.patient;
	}
	
	public String save(){
		// neuen Patienten erstellen
		try {
			PatientenManager.addPatient(patient);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// zurück zur Übersicht
		return "meinePatienten.xhtml";
	}
}
