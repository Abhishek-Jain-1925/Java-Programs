package HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet2")
public class SecondServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("Name");
		String email = (String) session.getAttribute("Email");
		String pass = (String) session.getAttribute("Password");
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>Name: -</h1>" +name+ "</h1>");
		pw.println("<h1>Email: -</h1>" +email+ "</h1>");
		pw.println("<h1>Pass: -</h1>" +pass+ "</h1>");
	}

	
}
