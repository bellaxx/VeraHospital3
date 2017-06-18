package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class Test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 private static int getResult(int a, int b){
			return a+b;
		}
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Uebungen</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<p>Expression Übung: Aktuelle Uhrzeit:\r\n");
      out.write("\t\t");
      out.print(new java.text.SimpleDateFormat().format(new java.util.Date()) );
      out.write("</p>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<p>");
      out.write("\r\n");
      out.write("\t\t");
 int x = 3*4; 
      out.write("\r\n");
      out.write("\t\t");
      out.print("Ergebnis der Rechnung 3*4: " + x);
      out.write("</p>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<p>Declaration:\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t1 + 3 ist ");
      out.print( getResult(1,3) );
      out.write("</p>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!--  Passwort Generator -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<form>\r\n");
      out.write("\t\t\t<label>Codewort</label>\r\n");
      out.write("\t\t\t<input name=\"Codewort\" type=\"text\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label>Verschiebung</label>\r\n");
      out.write("\t\t\t<input name=\"Verschiebung\" type=\"text\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<button name=\"Generieren\" type=\"Submit\">Generieren</button>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
// Eingegebene Daten aus dem Request Parameter holen
			
			String newWord;
			// wenn der Button geklickt wird
			if(request.getParameter("Generieren") != null){
				String codewort = request.getParameter("Codewort");
				int verschiebung = Integer.parseInt(request.getParameter("Verschiebung"));
				// Eingaben validieren
				if(codewort!=null && !codewort.equals("") && verschiebung!=0){
					
					// das Wort in ein array aufteilen
					char oldWord[] = codewort.toCharArray();
					for(int i=0; i<oldWord.length; i++)
						oldWord[i] += verschiebung;
					newWord = new String(oldWord);
					
      out.write("<label>Generiertes Codewort: ");
      out.print(newWord );
      out.write("</label>");

				} else
					response.sendError(HttpServletResponse.SC_BAD_REQUEST, " Angaben sind unvollständig");
			}
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- aktuelle HTTP-Methode ausgeben -->\r\n");
      out.write("\t\t\t");
// über den aktuellen Request die Methode heruasfinden
			// request wurde schon im Vorhinein vom JSP-Compiler instanziiert (implizites Objekt)
			String method = request.getMethod();
      out.write("\r\n");
      out.write("\t\t\t<p>Dies ist die aktuelle Methode: ");
      out.print(method);
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- dem Deployment-Descriptor (Servlet Context) Parameter hinzufügen & ausgeben (nur mit impliziten Objekten) -->\r\n");
      out.write("\t\t\t");
application.setAttribute("Inhalt", "Codewort generieren"); 
      out.write("\r\n");
      out.write("\t\t\t<p>Dies ist der Inhalt dieser Seite (Parameter): ");
      out.print(application.getAttribute("Inhalt") );
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\r\n");
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
