package useOfCookies;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cc1")
public class Cookies1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie =new Cookie (" name",req.getParameter("name"));
		Cookie cookie1 =new Cookie (" email",req.getParameter("email"));
		resp.addCookie(cookie);
		resp.addCookie(cookie1);
		resp.sendRedirect("cc2");
	}

}



