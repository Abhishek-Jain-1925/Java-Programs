package submit_form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class submit_form extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String mobile_no = req.getParameter("mobile_no");
		String course = req.getParameter("course");
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("Name : - " +name);
		pw.println("Age : - " +age);
		pw.println("Mobile No : - " +mobile_no);
		pw.println("Course : - " +course);
		
		
	}
	
}
