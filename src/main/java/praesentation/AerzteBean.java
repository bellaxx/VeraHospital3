package praesentation;

import javax.faces.bean.ManagedBean;

import businesslogic.PatientenManager;
import data.UserArzt;

@ManagedBean(name="aerzteBean")
@SessionScoped
public class AerzteBean {
	
	private List<UserArzt> arztListe = PatientenManager.getAerzte();
	
	public List<UserArzt> getAerzte(){
		return arztListe;
	}
}
