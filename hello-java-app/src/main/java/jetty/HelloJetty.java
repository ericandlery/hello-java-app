package jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

import jetty.servlet.JettyServlet;

public class HelloJetty {

	public static void main(String[] args) throws Exception {
		
		Server server=new Server(7070);
		ServletContextHandler handler=new ServletContextHandler(server,"/embedded");
		handler.addServlet(JettyServlet.class,"/");
		server.start();

	}

}
