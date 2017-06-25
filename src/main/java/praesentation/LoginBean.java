package praesentation;



<<<<<<< HEAD
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import businesslogic.ArztManager;
import data.Arzt;

=======
import businesslogic.PatientenManager;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8

@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {
	String email;
	String passwort;
<<<<<<< HEAD
	Arzt arzt = new Arzt();
	ArztManager arztManager=new ArztManager();
=======
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
	
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
	public String login() throws SQLException{
		// dem arzt die Variablen hinzufügen
		arzt.setEmail(this.email);
		arzt.setPasswort(this.passwort);
		// gibt es den User?
		if(arztManager.arztExists(email))
=======
	public String login(){
		// gibt es den User?
		if(PatientenManager.userExists(email))
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
			return "meinePatienten.xhtml";
		else
			return "login.xhtml";
	}
	
	public String registrieren(){
		return "registrierung.xhtml";
	}
	
}
