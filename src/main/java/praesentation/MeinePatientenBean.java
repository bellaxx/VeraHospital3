package praesentation;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

import data.UserPatient;
import businesslogic.PatientenManager;

@ManagedBean(name="meinePatientenBean")
@SessionScoped
public class MeinePatientenBean implements Serializable{
	
	// in der business Logic werden alle User in einer Liste zur�ckgegeben
	private List<UserPatient> patientenListe = PatientenManager.getPatientenListe();
	
	public List<UserPatient> getPatienten(){
		// �ber diese Liste kann auf das Transferobjekt UserPatient zugegriffen werden
		return patientenListe;
	}
	
	public void setPatienten(List<UserPatient> patientenListe){
		this.patientenListe = patientenListe;
	}
	
	public String bearbeiten(int id){
		// TODO id des zu bearbeitenden Patienten im Request speichern
		// ?????????????????????
		
		// Weiterleiten auf die richtige Seite
		return "updatePatient.xhtml";
	}
	
	public String loeschen(int id){
		// in der Businesslogic l�schen
		PatientenManager.deletePatient(id);
		// Weiterleiten auf die richtige Seite
		return "meinePatienten.xhtml";
	}
}