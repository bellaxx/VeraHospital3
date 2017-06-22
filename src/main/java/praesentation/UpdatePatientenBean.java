package praesentation;

import java.io.Serializable;
import data.UserPatient;
import javax.faces.bean.ManagedBean;

import businesslogic.PatientenManager;

@ManagedBean(name="updatePatientenBean")
@SessionScoped
public class UpdatePatientenBean implements Serializable{
	private String neueDiagnose;
	
	public String getDiagnose(){
		return neueDiagnose;
	}
	
	public void setDiagnose(String neueDiagnose){
		this.neueDiagnose = neueDiagnose;
	}
	
	public String getPatientenInfo(int id){
		UserPatient patient = PatientenManager.findUserById(id);
		return ("Name: " + patient.name + ", Geburtsdatum: " + patient.geburtsdatum + ", bisherige Diagnose: " + patient.diagnose);
	}
	
	public void updatePatient(int id){
		PatientenManager.updatePatient(id, neueDiagnose);
	}
}