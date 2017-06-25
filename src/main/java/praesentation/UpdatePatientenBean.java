package praesentation;

import java.io.Serializable;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
import java.sql.SQLException;

import data.Patient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
<<<<<<< HEAD
=======
=======
import data.UserPatient;
import javax.faces.bean.ManagedBean;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce

import businesslogic.PatientenManager;

@ManagedBean(name="updatePatientenBean")
@SessionScoped
public class UpdatePatientenBean implements Serializable{
<<<<<<< HEAD
	PatientenManager patientenManager=new PatientenManager();
	
	private String name;
=======
<<<<<<< HEAD
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
	private String neueDiagnose;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
=======
=======
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
	private String neueDiagnose;
	
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
	public String getDiagnose(){
		return neueDiagnose;
	}
	
	public void setDiagnose(String neueDiagnose){
		this.neueDiagnose = neueDiagnose;
	}
	
<<<<<<< HEAD

	public String updatePatient(){
		patientenManager.updatePatient(this.name, this.neueDiagnose);
		return "meinePatienten.xhtml";
=======
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
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
	}
}