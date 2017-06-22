package praesentation;

import java.io.Serializable;
import businesslogic.UserManager;
import data.UserPatient;

public class UpdatePatientenBean implements Serializable{
	private String neueDiagnose;
	
	public String getDiagnose(){
		return neueDiagnose;
	}
	
	public void setDiagnose(String neueDiagnose){
		this.neueDiagnose = neueDiagnose;
	}
	
	public String getPatientenInfo(int id){
		UserPatient patient = UserManager.findUserById(id);
		return ("Name: " + patient.name + ", Geburtsdatum: " + patient.geburtsdatum + ", bisherige Diagnose: " + patient.diagnose);
	}
	
	public void updatePatient(int id){
		UserManager.updatePatient(id, neueDiagnose);
	}
}