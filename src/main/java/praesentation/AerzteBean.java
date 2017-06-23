package praesentation;

import java.util.List;

import javax.faces.bean.*;


import businesslogic.ArztManager;

import data.Arzt;

@ManagedBean(name="aerzteBean")
@SessionScoped
public class AerzteBean {
	ArztManager arztManager=new ArztManager();
	private List<Arzt> arztListe;
	
	public List<Arzt> getArztListe(){
		arztListe = arztManager.getAerzte();
		return arztListe;
	}
	
	public void setArztListe(List<Arzt> arztListe){
		this.arztListe = arztListe;
	}
}
