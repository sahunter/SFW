package dm.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;



public class RouteDAOImpl implements  RouteDAO{
	private DataSource datasource;
	public RouteDAOImpl(DataSource datasource){
		this.datasource=datasource;
}
	
	@Override
	public Route getRoute(Route route) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Route WHERE routeNO=?");
			stmt.setString(1,route.getRouteNO());
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				route=new Route();
				
				route.setRouteNO(rs.getString("routeNO"));
				
				route.setDomitory(rs.getString("domitory"));
				route.setBoxSequence(rs.getString("area"));
				route.setRoute(rs.getString("route"));
				route.setCreatetime(rs.getString("createtime"));
				route.setLastestDelivery(rs.getString("lastestDelivery"));
				
				
			
			}
			}catch(SQLException e){
				ex=e;
			}finally{
				if(conn!=null){
					try{
						conn.close();
					}catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
				}
			if(ex!=null){
				throw new RuntimeException(ex);
			}
			}
		return route;
	}
	@Override
	public List<Route> getRoutes(Route route) {
		Connection conn=null;
		PreparedStatement stmt=null;

		SQLException ex=null;
		List<Route> routes=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Route ");
		
			//stmt.setString(1, route.getRouteNO());
			//stmt.setString(2, customer.getPassword());
			ResultSet rs=stmt.executeQuery();
			routes=new ArrayList<Route>();
			while(rs.next()){
				route=new Route();
				route.setId(Integer.valueOf(rs.getString("Id")));
				route.setRouteNO(rs.getString("routeNO"));
			
				route.setDomitory(rs.getString("domitory"));
				route.setBoxSequence(rs.getString("area"));
				route.setRoute(rs.getString("route"));
				route.setCreatetime(rs.getString("createtime"));
				route.setLastestDelivery(rs.getString("lastestDelivery"));
				
				routes.add(route);
			
			}
			}catch(SQLException e){
				ex=e;
			}finally{
				if(conn!=null){
					try{
						conn.close();
					}catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
				}
			if(ex!=null){
				throw new RuntimeException(ex);
			}
			}
		return routes;
	}
	
	@Override
	public void addRoute(Route  route) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO Route(routeNO,area,domitory,route,createtime,lastestDelivery) VALUES(?,?,?,?,?,?)");
			stmt.setString(1, route.getRouteNO());
			
			
			
			stmt.setString(2, route.getDomitory());
			stmt.setString(3, route.getArea());
			stmt.setString(4, route.getRoute());
			
			stmt.setString(5, route.getCreatetime());
			stmt.setString(6, route.getLastestDelivery());
		
			stmt.executeUpdate();
			}catch(SQLException e){
				ex=e;
			}finally{
				if(conn!=null){
					try{
						conn.close();
					}catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
				}
			if(ex!=null){
				throw new RuntimeException(ex);
			}
			}
	}
	
	@Override
	public void updateRoute(Route route){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update Route set   roleNO=?, createtime=?,domitory=?,route=?,lastestDelivery=? where Id=?  ");
            stmt.setString(1, route.getRouteNO());
		
			stmt.setString(2, route.getDomitory());
			stmt.setString(3, route.getArea());
			stmt.setString(4, route.getRoute());
			
			stmt.setString(5, route.getCreatetime());
			stmt.setString(6, route.getLastestDelivery());
			 stmt.setInt(7, route.getId());
			
			stmt.executeUpdate();
		}catch(SQLException e){
			ex=e;
		}finally{
			if(conn!=null){
				try{
					conn.close();
				}catch(SQLException e){
					if(ex==null){
						ex=e;
					}
				}
			}
		if(ex!=null){
			throw new RuntimeException(ex);
		}
		}
	}
	@Override
	public void deleteRoute(Route route) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM Route WHERE Id=? ");
			stmt.setInt(1,route.getId());
			
			stmt.executeUpdate();
			}catch(SQLException e){
				ex=e;
			}finally{
				if(conn!=null){
					try{
						conn.close();
					}catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
				}
			if(ex!=null){
				throw new RuntimeException(ex);
			}
			}
		
	}
	
	
	
}