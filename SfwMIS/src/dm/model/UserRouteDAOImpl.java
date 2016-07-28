package dm.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


public class UserRouteDAOImpl implements  UserRouteDAO{
	private DataSource datasource;
	public UserRouteDAOImpl(DataSource datasource){
		this.datasource=datasource;
}
	
	@Override
	public UserRoute getUserRoute(UserRoute userroute) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM UserRoute WHERE routeNO=?");
			
			stmt.setString(1, userroute.getRouteNO());			
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				userroute=new UserRoute();
				userroute.setUserNO(rs.getString("userNO"));
				userroute.setRouteNO(rs.getString("routeNO"));
		//		userroute.setState(rs.getString("state"));
				
				userroute.setStarttime(rs.getString("Starttime"));
				userroute.setFinishtime(rs.getString("finishtime"));
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
		return userroute;
	}
	@Override
	public List<UserRoute> getUserRoutes(UserRoute userroute) {
		Connection conn=null;
	//	PreparedStatement stmt=null;
		PreparedStatement stmt1=null;
		SQLException ex=null;
		List<UserRoute> userroutes=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
	//		stmt=conn.prepareStatement("SELECT * FROM Route WHERE routeNO=?");
			stmt1=conn.prepareStatement("SELECT * FROM UserRoute ");
			
	//		stmt.setString(1, userroute.getRouteNO());
			
			//stmt.setString(2, customer.getPassword());
	//		ResultSet rs=stmt.executeQuery();
	/*		userroutes=new ArrayList<UserRoute>();
			while(rs.next()){
				userroute=new UserRoute();
				userroute.setUserNO(rs.getString("userNO"));
				
				userroute.setRouteNO(rs.getString("routeNO"));
		//		userroute.setState(rs.getString("state"));
				userroute.setStarttime(rs.getTime("starttime"));
				userroute.setFinishtime(rs.getTime("finishtime"));
				
				userroutes.add(userroute);
			
			}*/
			ResultSet rs1=stmt1.executeQuery();
			userroutes=new ArrayList<UserRoute>();
			while(rs1.next()){
				userroute=new UserRoute();
				userroute.setUserNO(rs1.getString("userNO"));
				
				userroute.setRouteNO(rs1.getString("routeNO"));
	//			userroute.setState(rs1.getString("state"));
				userroute.setStarttime(rs1.getString("starttime"));
				userroute.setFinishtime(rs1.getString("finishtime"));
				
				userroutes.add(userroute);
			
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
		return userroutes;
	}
	
	@Override
	public void addUserRoute(UserRoute  userroute) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO Route(userNO,routeNO,starttime,finishtime) VALUES(?,?,?,?)");
			stmt.setString(1, userroute.getUserNO());
			stmt.setString(2, userroute.getRouteNO());
	//		stmt.setString(3, userroute.getState());
			stmt.setString(3,  userroute.getStarttime());
			stmt.setString(4,  userroute.getFinishtime());
			
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
	public void updateUserRoute(UserRoute userroute){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update Route set userNO=?,roleNO=?,starttime=?,finishtime=?  where  Id=?");
			
			stmt.setString(1, userroute.getUserNO());
			stmt.setString(2, userroute.getRouteNO());
		//	stmt.setString(3, userroute.getState());
			stmt.setString(3,  userroute.getStarttime());
			stmt.setString(4,  userroute.getFinishtime());
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
	public void deleteUserRoute(UserRoute userroute) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM UserRoute WHERE Id=? ");
			
			
			stmt.setInt(1,userroute.getId());
			
			
			
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