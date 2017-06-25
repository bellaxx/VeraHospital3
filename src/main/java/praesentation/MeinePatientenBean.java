package praesentation;

import java.util.List;
import java.io.Serializable;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import data.Arzt;
import data.Patient;

import businesslogic.PatientenManager;

@ManagedBean(name="meinePatientenBean")
@SessionScoped

public class MeinePatientenBean implements Serializable{
	PatientenManager patientenManager=new PatientenManager();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// in der business Logic werden alle User in einer Liste zurückgegeben
	private List<Patient> patientenListe;

	public List<Patient> getPatientenListe(){
		patientenListe = patientenManager.getPatientenListe(LoginBean.getId());
		return patientenListe;
	}
	
	public void setPatientenListe(List<Patient> patientenListe){
		this.patientenListe = patientenListe;
	}
	
	
	public String bearbeiten(){
		// Weiterleiten auf die richtige Seite
		return "updatePatient.xhtml";
	}
	
	
}