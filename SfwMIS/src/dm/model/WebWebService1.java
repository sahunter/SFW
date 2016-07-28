package dm.model;
import java.util.*;

import onlineOrder.model.OnlineOrder;
import onlineOrder.model.OnlineOrderDAO;

public class WebWebService1 {
	private RouteDAO routeDAO;
	
	private UserRouteDAO userRouteDAO;
	private OnlineOrderDAO onlineOrderDAO;
	
	public WebWebService1(String USER,RouteDAO routeDAO,UserRouteDAO  userRouteDAO,OnlineOrderDAO onlineOrderDAO){
		 this(routeDAO, userRouteDAO,onlineOrderDAO);
		 }
	
	public WebWebService1(RouteDAO routeDAO,UserRouteDAO  userRouteDAO,OnlineOrderDAO onlineOrderDAO){
		this.routeDAO=routeDAO;
		this.userRouteDAO=userRouteDAO;
		this.onlineOrderDAO=onlineOrderDAO;
	}
	
	

	public Route getRoute(Route route) {
			
			return routeDAO.getRoute(route);
		}
	 public List<Route> getRoutes(Route route){
			return routeDAO.getRoutes(route);
		}
	 
	 
	 public void addRoute(Route  route){
		 routeDAO.addRoute(route);
		}
		
		public void updateRoute(Route route) {
			routeDAO.updateRoute(route);
		}
		public void deleteRoute(Route route){
			routeDAO.deleteRoute(route);
		}
	 
public UserRoute getUserRoute(UserRoute userroute) {
			
			return userRouteDAO.getUserRoute(userroute);
		}
	 public List<UserRoute> getUserRoutes(UserRoute userroute){
			return userRouteDAO.getUserRoutes(userroute);
		}
	 
	 
	 public void addUserRoute(UserRoute  userroute){
		 userRouteDAO.addUserRoute(userroute);
		}
		
		public void updateUserRoute(UserRoute userroute) {
			userRouteDAO.updateUserRoute(userroute);
		}
		public void deleteUserRoute(UserRoute userroute){
			userRouteDAO.deleteUserRoute(userroute);
		}
	
//public OnlineOrder getOnlineOrder(OnlineOrder onlineOrder) {
			
			//return onlineOrderDAO.getOnlineOrder(onlineOrder);
	//	}
	/* public List<OnlineOrder> getOnlineOrders(OnlineOrder onlineOrder){
			return onlineOrderDAO.getOnlineOrders(onlineOrder);
		}
	 
	 
	 public void addOnlineOrder(OnlineOrder  onlineOrder){
		 onlineOrderDAO.addOnlineOrder(onlineOrder);
		}
		
	//	public void updateOnlineOrder(OnlineOrder onlineOrder) {
	//		onlineOrderDAO.updateOnlineOrder(onlineOrder);
	//	}
		public void deleteOnlineOrder(OnlineOrder onlineOrder){
			onlineOrderDAO.deleteOnlineOrder(onlineOrder);
		}
	*/
	
}
