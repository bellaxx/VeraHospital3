package praesentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businesslogic.UserManager;
import data.UserArzt;

/**
 * Servlet implementation class AerzteBean
 */
public class AerzteBean {
	
	private List<UserArzt> arztListe = UserManager.getAerzte();
	
	public List<UserArzt> getAerzte(){
		return arztListe;
	}
}
