package praesentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

import businesslogic.PatientenManager;
import data.UserArzt;

/**
 * Servlet implementation class AerzteBean
 */
@ManagedBean
public class AerzteBean {
	
	private List<UserArzt> arztListe = PatientenManager.getAerzte();
	
	public List<UserArzt> getAerzte(){
		return arztListe;
	}
}
