package praesentation;

import java.io.Serializable;
<<<<<<< HEAD
import java.sql.SQLException;

import data.Patient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
=======
import data.UserPatient;
import javax.faces.bean.ManagedBean;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8

import businesslogic.PatientenManager;

@ManagedBean(name="updatePatientenBean")
@SessionScoped
public class UpdatePatientenBean implements Serializable{
<<<<<<< HEAD
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
=======
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
	private String neueDiagnose;
	
	public String getDiagnose(){
		return neueDiagnose;
	}
	
	public void setDiagnose(String neueDiagnose){
		this.neueDiagnose = neueDiagnose;
	}
	
<<<<<<< HEAD
	public String getPatientenInfo(int id) throws SQLException{
		Patient patient = PatientenManager.find(id);
=======
	public String getPatientenInfo(int id){
		UserPatient patient = PatientenManager.findUserById(id);
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
		return ("Name: " + patient.name + ", Geburtsdatum: " + patient.geburtsdatum + ", bisherige Diagnose: " + patient.diagnose);
	}
	
	public void updatePatient(int id){
		PatientenManager.updatePatient(id, neueDiagnose);
	}
}