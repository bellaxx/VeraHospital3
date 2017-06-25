package data;


public class UserArzt {
	private int personalnummer;
    private String name;
    private String fachgebiet;
    private String buero;
    private String email;
    private String passwort;
    
   
    public UserArzt(){
         
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
