package jetty.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Doesn't work for some reasons.*/
@WebServlet(urlPatterns="/anno/anno.do")
public class AnnotatedServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("kimi annotation");
//		resp.setContentType("text/plain;charset=UTF-8");
//		resp.setStatus(HttpServletResponse.SC_OK);
//        resp.getWriter().println("註釋");
//        resp.getWriter().flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
