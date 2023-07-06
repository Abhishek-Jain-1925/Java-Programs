package LoginForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		RequestDispatcher rd;
		
	    if ("aavejshaikh39@gmail.com".equals(email) && "@Aavej4264".equals(pass))
		{
			rd = req.getRequestDispatcher("/SecondServlet");
			rd.forward(req, resp);
		}
	    else
	    {
	    	pw.println("<h1>Invalid Email Id Or Password</h1>");
	    	rd = req.getRequestDispatcher("/index1.html");
	    	rd.include(req, resp);
		}
	}
	
}
