package service;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private String XxxUsername = "Julien";
	private String XxxPassword = "1234";
	

	public void service(HttpServletRequest req, 
			HttpServletResponse res) {
		
		String username, password;
		
		try {
		username = req.getParameter("name");
		password = req.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		if (username.equals(XxxUsername) && password.equals(XxxPassword)) {
			
			res.sendRedirect(req.getContextPath() + "/welcome.html"); // Redirect to the HTML page in the same directory

		}else {
			//res.sendRedirect("/forgotpass"); // Redirect to the HTML page in the same directory;
			res.sendRedirect(req.getContextPath() + "/forgotpass.html");
		}
		
				
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
