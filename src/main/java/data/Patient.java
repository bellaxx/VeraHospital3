package data;

import java.io.Serializable;

public class Patient implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int patientenId; 
	public String name;
	public String geburtsdatum;
	public String diagnose;
	public int behandelnderArzt;
	
	public Patient() {
		
	}
	public void setPatientenId(int patientenId){
        this.patientenId = patientenId;
    }
     
    public int getPatientenId(){
        return patientenId;
    }
    public void setName(String name){
        this.name = name;
    }
     
    public String getName(){
        return name;
    }
    public void setGeburtsdatum(String geburtsdatum){
        this.geburtsdatum = geburtsdatum;
    }
     
    public String getGeburtsdatum(){
        return geburtsdatum;
    }
    public void setDiagnose(String diagnose){
        this.diagnose = diagnose;
    }
     
    public String getDiagnose(){
        return diagnose;
    }
    public void setBehandelnderArzt(int behandelnderArzt){
        this.behandelnderArzt = behandelnderArzt;
    }
     
    public int getPersonalnummer(){
        return behandelnderArzt;
    }
}
