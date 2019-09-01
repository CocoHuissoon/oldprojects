package servletpackage;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Webcontext implements ServletContextListener {
	
	private ServletContext context = null;

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		context=sce.getServletContext();
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		context=sce.getServletContext();
	}

}
