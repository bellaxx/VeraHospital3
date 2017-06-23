package praesentation;

import java.io.Serializable;
import java.sql.SQLException;

import data.Patient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import businesslogic.PatientenManager;

@ManagedBean(name="updatePatientenBean")
@SessionScoped
public class UpdatePatientenBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String neueDiagnose;
	
	public String getDiagnose(){
		return neueDiagnose;
	}
	
	public void setDiagnose(String neueDiagnose){
		this.neueDiagnose = neueDiagnose;
	}
	
	public String getPatientenInfo(int id) throws SQLException{
		Patient patient = PatientenManager.find(id);
		return ("Name: " + patient.name + ", Geburtsdatum: " + patient.geburtsdatum + ", bisherige Diagnose: " + patient.diagnose);
	}
	
	public void updatePatient(int id){
		PatientenManager.updatePatient(id, neueDiagnose);
	}
}