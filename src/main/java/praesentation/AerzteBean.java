package praesentation;

<<<<<<< HEAD
import java.util.List;

import javax.faces.bean.*;


import businesslogic.ArztManager;

import data.Arzt;
=======
import javax.faces.bean.ManagedBean;

import businesslogic.PatientenManager;
import data.UserArzt;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8

@ManagedBean(name="aerzteBean")
@SessionScoped
public class AerzteBean {
<<<<<<< HEAD
	ArztManager arztManager=new ArztManager();
	private List<Arzt> arztListe;
	
	public List<Arzt> getArztListe(){
		arztListe = arztManager.getAerzte();
		return arztListe;
	}
	
	public void setArztListe(List<Arzt> arztListe){
		this.arztListe = arztListe;
=======
	
	private List<UserArzt> arztListe = PatientenManager.getAerzte();
	
	public List<UserArzt> getAerzte(){
		return arztListe;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
	}
}
