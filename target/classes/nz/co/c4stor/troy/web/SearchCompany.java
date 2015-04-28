package nz.co.c4stor.troy.web;

@WebServlet(urlPatterns="/busca")
public class SearchCompany extends HttpServlet {
    protected void doGet(HttpServletRequest request,
	    HttpServletResponse response)
		    throws ServletException, IOException {

	PrintWriter writer = response.getWriter();
	writer.println( "<html><body>");
	writer.println( "Result: <br/>");
	writer.println( "</body></html>");
    }
}

}