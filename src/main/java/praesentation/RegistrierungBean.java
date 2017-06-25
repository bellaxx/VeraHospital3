package praesentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import businesslogic.ArztManager;


@ManagedBean(name="registrierungBean")
@SessionScoped
public class RegistrierungBean {
	ArztManager arztManager=new ArztManager();
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
		arztManager.addArzt(this.name, this.fachgebiet, this.buero, this.email, this.passwort);
		return "login.xhtml";
	}
	
	public String login(){
		return "login.xhtml";
	}
}
