package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import webeng.data.User;

public final class Authentifizierung_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    ");
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
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
String newURL = ""; 
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
	// wenn der User bereits angemeldet ist
	if(!(boolean) session.getAttribute("isAuthorized")){
		if(request.getParameter("Login") != null)
			{
			
					
			session = request.getSession(); 
					String ssid = session.getId();
					
					String name = request.getParameter("name");
					String passwort = request.getParameter("passwort");
					session.setAttribute("SessionId", ssid);
					session.setAttribute("Name", name);
					session.setAttribute("Passwort", passwort);
					session.setAttribute("isAuthorized", true);
					newURL = response.encodeRedirectURL("FrontController?action=login");
					response.sendRedirect(newURL);
					
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t");
 }
	else {
      out.write("\r\n");
      out.write("\t<h3>Benutzer Login</h3>\r\n");
      out.write("\t\t\t\t<form action=\"\" method=\"POST\" >\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label for = \"name\">Name: </label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type = \"text\" name = \"name\" placeholder=\"Mustermann\" required=\"required\"><span class=\"required\"> *</span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label for = \"passwort\">Passwort: </label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type = \"text\" name = \"passwort\" placeholder=\"123\" required=\"required\"><span class=\"required\"> *</span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td colspan = \"2\\\" ><input name=\"Login\" type=\"submit\" value=\"Login\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t");
} }else{
      out.write("\r\n");
      out.write("\t\t<h3>Sie haben sich eingeloggt!</h3>\t\t\t\r\n");
      out.write("\t\t\t\t\t<form action=\"FrontController?action=logout\" method=\"POST\" >\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Logout\" name = \"logout\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\t\r\n");
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
