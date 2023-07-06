package HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet1")
public class FirstServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>Name: -</h1>" +name+ "</h1>");
		pw.println("<h1>Email: -</h1>" +email+ "</h1>");
		pw.println("<h1>Pass: -</h1>" +pass+ "</h1>");
		
		HttpSession session = req.getSession();
		session.setAttribute("Name", name);
		session.setAttribute("Email", email);
		session.setAttribute("password", pass);
		
		pw.println("<br><br>");
		
		pw.println("<a href='/Servlet2'>Servlet 2</a>");
		
	}
	
}
