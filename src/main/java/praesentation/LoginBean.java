package praesentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businesslogic.PatientenManager;

public class LoginBean {
	String email;
	String passwort;
	
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
	
	public String login(){
		// gibt es den User?
		if(PatientenManager.userExists(email))
			return "meinePatienten.xhtml";
		else
			return "login.xhtml";
	}
	
	public String registrieren(){
		return "registrierung.xhtml";
	}
	
}
