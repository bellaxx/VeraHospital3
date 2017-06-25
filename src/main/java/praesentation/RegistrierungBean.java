package praesentation;

import javax.faces.bean.ManagedBean;
<<<<<<< HEAD
import javax.faces.bean.SessionScoped;

import businesslogic.ArztManager;

=======

import businesslogic.PatientenManager;
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8

@ManagedBean(name="registrierungBean")
@SessionScoped
public class RegistrierungBean {
<<<<<<< HEAD
	ArztManager arztManager=new ArztManager();
=======
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
	String name;
	String fachgebiet;
	String buero;
	String email;
	String passwort;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setFachgebiet(String fachgebiet){
		this.fachgebiet = fachgebiet;
	}
	
	public String getFachgebiet(){
		return this.fachgebiet;
	}
	
	public void setBuero(String buero){
		this.buero = buero;
	}
	
	public String getBuero(){
		return buero;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setPasswort(String passwort){
		this.passwort= passwort;
	}
	
	public String getPasswort(){
		return this.passwort;
	}
	
	public String registrieren(){
<<<<<<< HEAD
		arztManager.addArzt(this.name, this.fachgebiet, this.buero, this.email, this.passwort);
=======
		PatientenManager.addArzt(this.name, this.fachgebiet, this.buero, this.email, this.passwort);
>>>>>>> 0cb88fbd773dca70dbd5a27b72eb77cb06ffbfc8
		return "meinePatienten.xhtml";
	}
	
	public String login(){
		return "login.xhtml";
	}
}
