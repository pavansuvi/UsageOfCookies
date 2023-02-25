package data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/f1")
public class Id extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<body bgcolor='red'>");
		out.println("<h1>"+req.getParameter("name")+"</h1>");
		out.println(req.getParameter("email"));
		out.println(req.getParameter("dob"));
		out.println(req.getParameter("ph"));
		
	}
	

}

//                            (OR)


//package data;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.catalina.connector.Response;
//@WebServlet("/f1")
//public class Id extends HttpServlet{
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Cookie cookie =new Cookie("name",req.getParameter("name"));
//		Cookie cookie1 =new Cookie("email",req.getParameter("email"));
//		Cookie cookie2 =new Cookie("dob",req.getParameter("dob"));
//		Cookie cookie3 =new Cookie("ph",req.getParameter("ph"));
//		resp.addCookie(cookie3);
//		resp.addCookie(cookie2);
//		resp.addCookie(cookie1);
//		resp.addCookie(cookie);
//		resp.sendRedirect("Response.jsp");
//		
//	}
//}

