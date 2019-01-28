package jetty.web;

import org.eclipse.jetty.annotations.AnnotationConfiguration;
import org.eclipse.jetty.plus.webapp.EnvConfiguration;
import org.eclipse.jetty.plus.webapp.PlusConfiguration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.Configuration;
import org.eclipse.jetty.webapp.FragmentConfiguration;
import org.eclipse.jetty.webapp.MetaInfConfiguration;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.webapp.WebInfConfiguration;
import org.eclipse.jetty.webapp.WebXmlConfiguration;

public class AnnotatedJetty {

	public static void main(String[] args) throws Exception {
		
		Server server=new Server(7070);
		WebAppContext ctx=new WebAppContext();
		ctx.setResourceBase("src/main/resources/jetty");
//		ctx.setDescriptor("src/main/resources/jetty/WEB-INF/web.xml");
		ctx.setContextPath("/ann");
		ctx.setConfigurations(new Configuration[] {
				new AnnotationConfiguration(),
				new WebXmlConfiguration(),
	            new WebInfConfiguration(),
	            new PlusConfiguration(), 
	            new MetaInfConfiguration(),
	            new FragmentConfiguration(), 
	            new EnvConfiguration()
		});
//		ctx.setParentLoaderPriority(true);
		
		server.setHandler(ctx);
		server.start();
		server.join();

	}

}
