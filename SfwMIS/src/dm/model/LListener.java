package dm.model;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;

import onlineOrder.model.OnlineOrderDAOImpl;

/**
 * Application Lifecycle Listener implementation class ShopListener
 *
 */
@WebListener
public class LListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public LListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
		try{
			Context inticontext=new InitialContext();
			Context envContext=(Context)inticontext.lookup("java:/comp/env");
			DataSource dataSource=(DataSource)envContext.lookup("jdbc/sql1");
			ServletContext context=arg0.getServletContext();
			context.setAttribute("userService1",new WebWebService1(new RouteDAOImpl(dataSource), null,null));
			//int i=0;
		}catch(NamingException e){
			throw new RuntimeException(e);
		}
    		
    }
}
