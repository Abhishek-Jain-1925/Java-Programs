package Servlet_programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class second_program extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Generic servlet");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("This Is Generic Servlet Example");
		pw.println("Today is " + new Date().toString());
		
	}

}
