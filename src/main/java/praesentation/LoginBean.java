package praesentation;



<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
<<<<<<< HEAD
import javax.faces.context.FacesContext;
=======
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce

import businesslogic.ArztManager;
import data.Arzt;

<<<<<<< HEAD
=======
=======
import businesslogic.PatientenManager;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce

@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {
	String email;
	String passwort;
<<<<<<< HEAD
	Arzt arzt = new Arzt();
	ArztManager arztManager=new ArztManager();
	private static int id;
	
	public static int getId(){
		return id;
	}
=======
<<<<<<< HEAD
	Arzt arzt = new Arzt();
	ArztManager arztManager=new ArztManager();
=======
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
	
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setPasswort(String passwort){
		this.passwort = passwort;
	}
	
	public String getPasswort(){
		return this.passwort;
	}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
	public String login() throws SQLException{
		// dem arzt die Variablen hinzufügen
		arzt.setEmail(this.email);
		arzt.setPasswort(this.passwort);
		// gibt es den User?
<<<<<<< HEAD
		if(arztManager.arztExists(email)){
		//	Integer.valueOf(FacesContext.getCurrentInstance().getExternalContext().setRequestParameterMap().set("id"));
			id=arztManager.find(email).getPersonalnummer();
			return "meinePatienten.xhtml";}
=======
		if(arztManager.arztExists(email))
=======
	public String login(){
		// gibt es den User?
		if(PatientenManager.userExists(email))
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
			return "meinePatienten.xhtml";
>>>>>>> 94ddea41911b574e1bb2b64627eddcf6651e47ce
		else
			return "login.xhtml";
	}
	
	public String registrieren(){
		return "registrierung.xhtml";
	}
	
}
