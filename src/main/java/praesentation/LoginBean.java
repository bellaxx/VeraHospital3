package praesentation;



import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import businesslogic.ArztManager;
import data.Arzt;


@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {
	String email;
	String passwort;
	Arzt arzt = new Arzt();
	ArztManager arztManager=new ArztManager();
	
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
	
	public String login() throws SQLException{
		// dem arzt die Variablen hinzufügen
		arzt.setEmail(this.email);
		arzt.setPasswort(this.passwort);
		// gibt es den User?
		if(arztManager.arztExists(email))
			return "meinePatienten.xhtml";
		else
			return "login.xhtml";
	}
	
	public String registrieren(){
		return "registrierung.xhtml";
	}
	
}
