package praesentation;

import java.util.List;
import java.io.Serializable;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

<<<<<<< HEAD
import data.Arzt;
import data.Patient;

=======
import data.Patient;

=======
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

import data.UserPatient;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
import businesslogic.PatientenManager;

@ManagedBean(name="meinePatientenBean")
@SessionScoped
<<<<<<< HEAD

public class MeinePatientenBean implements Serializable{
	PatientenManager patientenManager=new PatientenManager();
=======
public class MeinePatientenBean implements Serializable{
	
<<<<<<< HEAD
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// in der business Logic werden alle User in einer Liste zurückgegeben
<<<<<<< HEAD
	private List<Patient> patientenListe;

	public List<Patient> getPatientenListe(){
		patientenListe = patientenManager.getPatientenListe(LoginBean.getId());
		return patientenListe;
	}
	
	public void setPatientenListe(List<Patient> patientenListe){
		this.patientenListe = patientenListe;
	}
	
	
	public String bearbeiten(){
=======
	private List<Patient> patientenListe = PatientenManager.getPatientenListe();
	
	public List<Patient> getPatienten(){
=======
	// in der business Logic werden alle User in einer Liste zurückgegeben
	private List<UserPatient> patientenListe = PatientenManager.getPatientenListe();
	
	public List<UserPatient> getPatienten(){
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
		// über diese Liste kann auf das Transferobjekt UserPatient zugegriffen werden
		return patientenListe;
	}
	
<<<<<<< HEAD
	public void setPatienten(List<Patient> patientenListe){
=======
	public void setPatienten(List<UserPatient> patientenListe){
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
		this.patientenListe = patientenListe;
	}
	
	public String bearbeiten(int id){
		// TODO id des zu bearbeitenden Patienten im Request speichern
		// ?????????????????????
		
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
		// Weiterleiten auf die richtige Seite
		return "updatePatient.xhtml";
	}
	
<<<<<<< HEAD
	
=======
<<<<<<< HEAD
	public String loeschen(int id) throws SQLException{
=======
	public String loeschen(int id){
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
		// in der Businesslogic löschen
		PatientenManager.deletePatient(id);
		// Weiterleiten auf die richtige Seite
		return "meinePatienten.xhtml";
	}
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
}