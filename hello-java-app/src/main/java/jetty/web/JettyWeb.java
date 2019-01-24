package jetty.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyWeb {

	public static void main(String[] args) throws Exception {
		
		Server server=new Server(7070);
		WebAppContext context=new WebAppContext();
		
		context.setAttribute("context","/web1");
		context.setContextPath("/web1");
		context.setDescriptor("src/main/resources/jetty/WEB-INF/web.xml");
		context.setResourceBase("src/main/resources/jetty");
		
		server.setHandler(context);
		server.start();
		server.join();

	}

}
