package jetty.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JettyController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ralf");
		System.out.println(req.getServletContext().getServletContextName());
		System.out.println(req.getContextPath());
		System.out.println(req.isSecure());
		System.out.println(req.getRequestURL());
		System.out.println(req.getRequestURI());
		System.out.println(req.getServletContext().getAttribute("context"));
		req.getRequestDispatcher("/test/test.html").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
