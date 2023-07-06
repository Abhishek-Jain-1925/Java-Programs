package Servlet_programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class third_program extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(" DO GET Method");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("Date Print Using DO GET Method");
		pw.println("Today Date Is ");
		pw.println(new Date().toString());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(" DO POST Method");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("Date Print Using DO POST Method");
		pw.println("Today Date Is");
		pw.println(new Date().toString());
		
	}

}
