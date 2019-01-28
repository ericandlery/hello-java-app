package jetty.jsp;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.servlet.JspServlet;
import org.apache.tomcat.InstanceManager;
import org.apache.tomcat.SimpleInstanceManager;
import org.eclipse.jetty.annotations.ServletContainerInitializersStarter;
import org.eclipse.jetty.apache.jsp.JettyJasperInitializer;
import org.eclipse.jetty.plus.annotation.ContainerInitializer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;

public class TestJspJetty {

	public void startServer() throws Exception {
		
//		System.out.println(System.getProperty("java.io.tmpdir"));
		
		File tmpdir=new File(System.getProperty("java.io.tmpdir"));
		File scdir=new File(tmpdir.toString(),"embedded-jetty-jsp");
		
		if(!scdir.exists()) {
			if(!scdir.mkdirs()) {
				throw new IOException("Directory Failed.");
			}
		}
		
		Server server=new Server(7070);
		
		WebAppContext ctx=new WebAppContext();
		ctx.setParentLoaderPriority(true);
		ctx.setContextPath("/");
		ctx.setAttribute("javax.servlet.ctx.tempdir",scdir);
		ctx.setAttribute(InstanceManager.class.getName(), 
	            new SimpleInstanceManager());
		server.setHandler(ctx);
		
		JettyJasperInitializer sci=new JettyJasperInitializer();
		ServletContainerInitializersStarter sciStarter=new ServletContainerInitializersStarter(ctx);
		ContainerInitializer initializer=new ContainerInitializer(sci,null);
		List<ContainerInitializer> initializers = new ArrayList<>();
        initializers.add(initializer);
        
        ctx.setAttribute("org.eclipse.jetty.containerInitializers", initializers);
        ctx.addBean(sciStarter, true);
        
        ClassLoader jspClassLoader = new URLClassLoader(new URL[0],
                this.getClass().getClassLoader());
        ctx.setClassLoader(jspClassLoader);
        
        ServletHolder holderJsp = new ServletHolder("jsp", JspServlet.class);
        holderJsp.setInitOrder(0);
        holderJsp.setInitParameter("fork","false");
        holderJsp.setInitParameter("keepgenerated", "true");
        ctx.addServlet(holderJsp, "*.jsp");
        
        ServletHolder holderDefault = new ServletHolder("default", 
                DefaultServlet.class);
            holderDefault.setInitParameter("dirAllowed", "true");
            ctx.addServlet(holderDefault, "/");      
            
        ctx.setWar("src/main/resources/jetty" + "/webapps/jspexample.war");
        server.setHandler(ctx);

        server.start();
        server.join();        

	}
	
	public static void main(String[] args) throws Exception {
		new TestJspJetty().startServer();
	}

}
