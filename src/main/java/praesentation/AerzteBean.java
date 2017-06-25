package praesentation;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
import java.util.List;

import javax.faces.bean.*;


import businesslogic.ArztManager;

import data.Arzt;
<<<<<<< HEAD
=======
=======
import javax.faces.bean.ManagedBean;

import businesslogic.PatientenManager;
import data.UserArzt;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce

@ManagedBean(name="aerzteBean")
@SessionScoped
public class AerzteBean {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
	ArztManager arztManager=new ArztManager();
	private List<Arzt> arztListe;
	
	public List<Arzt> getArztListe(){
		arztListe = arztManager.getAerzte();
		return arztListe;
	}
	
	public void setArztListe(List<Arzt> arztListe){
		this.arztListe = arztListe;
<<<<<<< HEAD
=======
=======
	
	private List<UserArzt> arztListe = PatientenManager.getAerzte();
	
	public List<UserArzt> getAerzte(){
		return arztListe;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
	}
}
