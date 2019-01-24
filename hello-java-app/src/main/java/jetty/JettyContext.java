package jetty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.handler.ContextHandler;

public class JettyContext extends AbstractHandler{

	public static void main(String[] args) throws Exception {
		
		Server server=new Server(7070);
		ContextHandler handler=new ContextHandler();
		handler.setContextPath("/contextJetty");
		handler.setHandler(new JettyContext());
		server.setHandler(handler);
		server.start();
		server.join();

	}

	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		baseRequest.setHandled(true);
		System.out.println("kimi");
		response.getWriter().print("Notice the context path!");
//		request.getRequestDispatcher("/jetty/jetty.html").forward(request, response);
		
	}

}
