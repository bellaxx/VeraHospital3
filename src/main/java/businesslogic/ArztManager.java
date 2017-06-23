package businesslogic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import data.DAOFactory;
import data.Arzt;
import data.ArztDAO;
import data.DAOFactory.Backend;

public class ArztManager {
 ArztDAO arztDAO;
Arzt arzt=new Arzt();
	public ArztManager() {
		super();
		//arztDAO = DAOFactory.getDAOFactory(Backend.H2).getArztDAO();
		
		arzt.setPersonalnummer(1);
		arzt.setName("Meier");
		arzt.setBuero("1B");
		arzt.setEmail("meier@verahospital.de");
		arzt.setFachgebiet("Chirurg");
		arzt.setPasswort("123");
	}

	// Ueberprufen, obe der Arzt bei Registrierung schon existiert.
	public  boolean add(Arzt arzt, String email) throws SQLException{
		//int id = arztDAO.getId();
		//Arzt.setId(id);

		boolean isAdd = false;
		
		if(!arztDAO.getArzt(email)){
			arztDAO.addArzt(arzt);
			isAdd = true;
		} else
			isAdd = false;
		return isAdd;
	}
	
	public  void deleteArzt(int id) throws SQLException{
		// Prüfe, ob es den Arzt gibt, wenn ja lösche ihn
		if(arztDAO.ArztExists(id)){
			arztDAO.deleteArzt(id);
		} else
			System.out.println("Diesen Benutzer gibt es nicht");
	}
	
	
	
	public  Arzt find(String email) throws SQLException{
		 return arztDAO.findArzt(email);
              
    }
     
    public  Arzt find(int id) throws SQLException{
    	return arztDAO.findArzt(id);
            
    }
     
     
    public  Arzt find(String name, String password) throws SQLException{
    	return arztDAO.findArzt(name, password);
             
    }
    
    
    
    public Arzt findArzt(String name) throws SQLException{
    	return arztDAO.findArztByName(name);
             
    }
 
     
    public  List<Arzt> search(String name) throws SQLException{
    	List<Arzt> arztList = new ArrayList<Arzt>();      
    	arztList =  arztDAO.searchArzt(name);
        return arztList;
    }
     
    public  List<Arzt> getAerzte() {
    	List<Arzt> arztList = new ArrayList<Arzt>();		
    	//arztList =  arztDAO.findArzts();
    	arztList.add(arzt);
		return arztList;
	}
   
     
    public  Arzt update(Arzt Arzt) throws SQLException{
    	arztDAO.updateArzt(Arzt);
        return Arzt;
    }
    
    
    public  boolean isAuthorized(String name, String password) throws SQLException{
		boolean isLogin = false;
		if(arztDAO.getArzt(name, password)){
			isLogin = true;
		}else{
			isLogin = false;
		}
		return isLogin;
	}
    

	public boolean arztExists(String email) {
		boolean arztExists = false;
		 
       // if(arztDAO.findArzt(email) == null ){
		
		if(arzt.getEmail()==email){
        	arztExists = false;
		}else{
			arztExists = true;
		}
         
        return arztExists;
    }

	public  void addArzt(String name, String fachgebiet, String buero, String email, String passwort) {
		if(arztDAO.arztExists(email)){
			arztDAO.addArzt(name,fachgebiet,buero,email,passwort);
		} else
			System.out.println("Diesen Benutzer gibt es nicht");
	}
	
     

    
}
