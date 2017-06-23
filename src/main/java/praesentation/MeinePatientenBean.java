package praesentation;

import java.util.List;
import java.io.Serializable;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import data.Patient;

import businesslogic.PatientenManager;

@ManagedBean(name="meinePatientenBean")
@SessionScoped
public class MeinePatientenBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// in der business Logic werden alle User in einer Liste zur�ckgegeben
	private List<Patient> patientenListe = PatientenManager.getPatientenListe();
	
	public List<Patient> getPatienten(){
		// �ber diese Liste kann auf das Transferobjekt UserPatient zugegriffen werden
		return patientenListe;
	}
	
	public void setPatienten(List<Patient> patientenListe){
		this.patientenListe = patientenListe;
	}
	
	public String bearbeiten(int id){
		// TODO id des zu bearbeitenden Patienten im Request speichern
		// ?????????????????????
		
		// Weiterleiten auf die richtige Seite
		return "updatePatient.xhtml";
	}
	
	public String loeschen(int id) throws SQLException{
		// in der Businesslogic l�schen
		PatientenManager.deletePatient(id);
		// Weiterleiten auf die richtige Seite
		return "meinePatienten.xhtml";
	}
}