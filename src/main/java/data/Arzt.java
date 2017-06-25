package data;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class Arzt implements Serializable{
	
	
	@ManagedProperty(value="1")
	private int personalnummer;
	@ManagedProperty(value="Meier")
    private String name;
	@ManagedProperty(value="Chirurg")
    private String fachgebiet;
	@ManagedProperty(value="1B")
    private String buero;
	@ManagedProperty(value="meier@verahospital.de")
    private String email;
	@ManagedProperty(value="123")
    private String passwort;
    
   
    public Arzt(){
         
    }
     
    public void setPersonalnummer(int personalnummer){
        this.personalnummer = personalnummer;
    }
     
    public int getPersonalnummer(){
        return personalnummer;
    }
      
    public void setName(String name){
        this.name = name;
    }
     
    public String getName(){
        return name;        
    }
     
    public void setEmail(String email){
        this.email = email;
    }
     
    public String getEmail(){
        return email;
    }
    public void setFachgebiet(String fachgebiet){
        this.fachgebiet = fachgebiet;
    }
     
    public String getFachgebiet(){
        return fachgebiet;
    }
    public void setBuero(String buero){
        this.buero = buero;
    }
     
    public String getBuero(){
        return buero;
    }
    public void setPasswort(String passwort){
        this.passwort = passwort;
    }
     
    public String getPassword(){
        return passwort;
    }
     
    
   
	
   
     
   
}
