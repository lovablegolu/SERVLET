package in.kss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw= null;
		
		String name=null, gender=null;
		int age=1;
		//get printwriter
		pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//read form data
		name=req.getParameter("pname");
		age= Integer.parseInt(req.getParameter("page"));
		gender=req.getParameter("gender");
		//write b logic or request processing logic
		if(gender.equalsIgnoreCase("M")){
			if(age>=21) {
				pw.println("<h1 style='color:black;text-align:center'>Mr "+name+" you are eligible for Marriage</h1>");
			}//if
			else {
				pw.println("<h1 style='color:red;text-align:center'>Mr "+name+" you are not eligible for Marriage</h1>");
				
			}//else
			
		}//if
		
		if(gender.equalsIgnoreCase("F")){
			if(age>=18) {
				pw.println("<h1 style='color:black;text-align:center'>Ms  "+name+" you are eligible for Marriage</h1>");
			}//if
			else {
				pw.println("<h1 style='color:red;text-align:center'>Ms  "+name+" you are not eligible for Marriage</h1>");
				
			}//else
			
		}//if
		pw.println("<br><b>date and time"+new Date()+"</b></br>");
	
		//ad hiberlink
		pw.println("<a href='input.html'><img src='images/home.jpg' width='50' height'50'/></a>");
		
		//close stream
		pw.close();
		
				}//method

}//class
