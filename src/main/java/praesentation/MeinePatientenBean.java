package praesentation;

import java.util.List;
import java.io.Serializable;
<<<<<<< HEAD
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import data.Patient;

=======
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

import data.UserPatient;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
import businesslogic.PatientenManager;

@ManagedBean(name="meinePatientenBean")
@SessionScoped
public class MeinePatientenBean implements Serializable{
	
<<<<<<< HEAD
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// in der business Logic werden alle User in einer Liste zurückgegeben
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
		
		// Weiterleiten auf die richtige Seite
		return "updatePatient.xhtml";
	}
	
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
}