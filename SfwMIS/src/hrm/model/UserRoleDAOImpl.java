package hrm.model;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import hrm.model.UserRole;
public class UserRoleDAOImpl implements UserRoleDAO{

	private DataSource datasource;
	public UserRoleDAOImpl(DataSource datasource){
		this.datasource=datasource;
}
	
	@Override
	public UserRole getUserRole(UserRole userRole) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;

		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM UserRole Where  Id=?");
			
			
			stmt.setInt(1,userRole.getId());
			
	
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				userRole=new UserRole();
				
				userRole.setUserNO(rs.getString("userNO"));
				userRole.setRoleNO(rs.getString("roleNO"));
				
				userRole.setCreatetime(rs.getString("createtime"));
	//			userRole.setState(rs.getString("state"));
				
				stmt.executeUpdate();
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
		return userRole;
	}
	@Override
	public List<UserRole> getUserRoles(UserRole userRole) {
		Connection conn=null;
	//	PreparedStatement stmt=null;
		PreparedStatement stmt1=null;
		
		
		SQLException ex=null;
		List<UserRole> userRoles=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
		//stmt=conn.prepareStatement("SELECT * FROM UserRole WHERE Id=?");
			
			 stmt1 = conn.prepareStatement("SELECT * FROM UserRole");
	//		stmt.setString(1,userRole.getRoleNO());
			
			//stmt.setString(2, customer.getPassword());
		/*	ResultSet rs=stmt.executeQuery();
			userRoles=new ArrayList<UserRole>();
			while(rs.next()){
				userRole=new UserRole();
				userRole.setUserNO(rs.getString("userNO"));
				userRole.setRoleNO(rs.getString("roleNO"));
				
				userRole.setCreatetime(rs.getString("Createtime"));
				userRole.setState(rs.getString("state"));
				
				
				
				userRoles.add(userRole);
			
			}*/
			
			ResultSet rs1=stmt1.executeQuery();
			
			
			userRoles=new ArrayList<UserRole>();
			while(rs1.next()){
				userRole=new UserRole();
				userRole.setId(rs1.getInt("Id"));
				userRole.setUserNO(rs1.getString("userNO"));
				userRole.setRoleNO(rs1.getString("roleNO"));
				
				userRole.setCreatetime(rs1.getString("createtime"));
	//			userRole.setState(rs1.getString("state"));
				
				
				userRoles.add(userRole);
			
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
		return userRoles;
	}
	@Override
	public void addUserRole(UserRole userRole) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO UserRole(userNO,roleNO,createtime) VALUES(?,?,?)");
			stmt.setString(1, userRole.getUserNO());
			stmt.setString(2, userRole.getRoleNO());
			stmt.setString(3, userRole.getCreatetime());
	//		stmt.setString(4, userRole.getState());
			
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
	public void updateUserRole(UserRole userRole){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update UserRole set userNO=?,roleNO=?,createtime=?  where Id=?");
		
			stmt.setString(1, userRole.getUserNO());
			stmt.setString(2, userRole.getRoleNO());
			stmt.setString(3,  userRole.getCreatetime());
		//	stmt.setString(4, userRole.getState());
			stmt.setInt(4, userRole.getId());
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
	public void deleteUserRole(UserRole userRole) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM UserRole WHERE Id=? ");
			stmt.setInt(1,userRole.getId());
			
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
