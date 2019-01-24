package jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class HelloWeb {

	public static void main(String[] args) throws Exception {
		
		Server server=new Server(7070);
		WebAppContext context=new WebAppContext();
		
		context.setContextPath("/hello-java-app");
		context.setDescriptor("src/main/resources/WEB-INF/web.xml");
		context.setResourceBase("src/main/resources/");
		
		server.setHandler(context);
		server.start();
		server.join();

	}

}
