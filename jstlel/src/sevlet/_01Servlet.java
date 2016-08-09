package sevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( "/01" )
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iVal = 10;
		float fVal = 3.14f;
		String sVal = "Hello World!";
		boolean bVal = true;
		
		request.setAttribute("iVal", iVal);
		request.setAttribute("fVal", fVal);
		request.setAttribute("sVal", sVal);
		request.setAttribute("bVal", bVal);
		
		request.getRequestDispatcher( "/view/01.jsp" ).forward( request, response );
	}
}
