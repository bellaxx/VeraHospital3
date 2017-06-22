package praesentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businesslogic.UserManager;
import data.UserPatient;

/**
 * Servlet implementation class NeuerPatientBean
 */
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
