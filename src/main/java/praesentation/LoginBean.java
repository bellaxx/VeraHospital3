package praesentation;



import businesslogic.PatientenManager;

@ManagedBean(name="loginBean")
@SessionScoped
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
