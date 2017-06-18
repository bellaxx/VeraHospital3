package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import webeng.businesslogic.UserManager;
import webeng.data.User;
import webeng.data.User;

public final class Detailansicht_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Navigation.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
String sessionId = (String) session.getAttribute("SessionId");
      out.write("\r\n");
      out.write("<nav>\r\n");
      out.write("\r\n");
      out.write("\t<a href=\"FrontController?action=Authentifizierung\">Login</a></br>\r\n");
      out.write("\t<a href=\"FrontController?action=test\">Test</a></br>\r\n");
      out.write("\t");
 if(sessionId != null){ 
      out.write("\r\n");
      out.write("\t\t<a href=\"FrontController?action=UserList\">Benutzerverwaltung (UserList)</a></br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
 }
      out.write("\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Detailansicht</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<a href = \"FrontController?action=UserList\" >Zurück zur Benutzerverwaltung</a><br>\r\n");
      out.write("\t");
 
	
      out.write("\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t<th>Email</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

		User user = (User)request.getAttribute("User");
		session.setAttribute("User",user);
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print( user.getId() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print( user.getName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print( user.getEmail() );
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t");
 
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"Detailansicht\" method=\"POST\">\r\n");
      out.write("\t\t<label>ID</label>\r\n");
      out.write("\t\t<input name=\"Id\" type=\"text\" required>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<label>Name</label>\r\n");
      out.write("\t\t<input name=\"Name\" type=\"text\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<label>Email</label>\r\n");
      out.write("\t\t<input name=\"Email\" type=\"text\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<label>Passwort</label>\r\n");
      out.write("\t\t<input name=\"Passwort\" type=\"text\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<button type=\"submit\" name=\"Bearbeiten\" value=\"Submit\">Bearbeiten</button>\r\n");
      out.write("\t\t<button type=\"submit\" name=\"Loeschen\" value=\"Submit\">Löschen</button>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t");
 if(request.getParameter("Bearbeiten") != null){
		session.setAttribute("ID", request.getParameter("id"));
		session.setAttribute("Name", request.getParameter("Name"));
		session.setAttribute("Email", request.getParameter("Email"));
		session.setAttribute("Passwort", request.getParameter("Passwort"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/FrontController?action=bearbeiten");
		dispatcher.forward(request, response);
	} else if(request.getParameter("Loeschen") != null){
		session.setAttribute("Id", request.getParameter("id"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/FrontController?action=loeschen");
		dispatcher.forward(request, response);
	}
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
