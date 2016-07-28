package hrm.model;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import hrm.model.UserAuthority;
public class UserAuthorityDAOImpl implements UserAuthorityDAO{
	private DataSource datasource;
	public UserAuthorityDAOImpl(DataSource datasource){
		this.datasource=datasource;
}
	@Override
public UserAuthority getUserAuthority(UserAuthority userAuthority) {
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	
	try{                                         // and password=?
		conn=datasource.getConnection();
		stmt=conn.prepareStatement("SELECT * FROM UserAuthority WHERE Id=?");
		stmt.setInt(1,userAuthority.getId());
		//stmt.setString(2,userAuthority.getAuthorityNO());
		//stmt.setString(2, administrator.getPassword());
		ResultSet rs=stmt.executeQuery();
		while(rs.next()){
			userAuthority=new UserAuthority();
			userAuthority.setUserNO(rs.getString("userNO"));
			userAuthority.setAuthorityNO(rs.getString("authorityNO"));
			userAuthority.setKind(rs.getString("kind"));
	//		userAuthority.setState(rs.getString("state"));
			
			
			userAuthority.setCreatetime(rs.getString("createtime"));
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
	return userAuthority;
}
	@Override
public List<UserAuthority> getUserAuthoritys(UserAuthority userAuthority) {
	Connection conn=null;
	//PreparedStatement stmt=null;
	PreparedStatement stmt1=null;
	SQLException ex=null;
	List<UserAuthority> userAuthoritys=null;
	
	try{												 //and password=?
		conn=datasource.getConnection();
	//	stmt=conn.prepareStatement("SELECT * FROM UserAuthority WHERE userNO=? and authorityNO=?");
		stmt1=conn.prepareStatement("SELECT * FROM UserAuthority ");
		
	//	stmt.setString(1, userAuthority.getUserNO());
		//stmt.setString(2, userAuthority.getAuthorityNO());
		
		//stmt.setString(2, customer.getPassword());
	//	ResultSet rs=stmt.executeQuery();
	//	userAuthoritys=new ArrayList<UserAuthority>();
	//	while(rs.next()){
	//		userAuthority=new UserAuthority();
	//		userAuthority.setUserNO(rs.getString("userNO"));
	//		userAuthority.setAuthorityNO(rs.getString("authorityNO"));
			
	//		userAuthority.setState(rs.getString("state"));
			
//			userAuthority.setKind(rs.getString("kind"));
	//		userAuthority.setCreatetime(rs.getString("Createtime"));
			
	//		userAuthoritys.add(userAuthority);
		
	//	}
		
		ResultSet rs1=stmt1.executeQuery();
		userAuthoritys=new ArrayList<UserAuthority>();
		while(rs1.next()){
			userAuthority=new UserAuthority();
			userAuthority.setId(rs1.getInt("Id"));
			userAuthority.setUserNO(rs1.getString("userNO"));
			userAuthority.setAuthorityNO(rs1.getString("authorityNO"));
			userAuthority.setKind(rs1.getString("kind"));
	//		userAuthority.setState(rs1.getString("state"));
			userAuthority.setCreatetime(rs1.getString("createtime"));
			
			userAuthoritys.add(userAuthority);
		
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
	return userAuthoritys;
}
	
	@Override
public void addUserAuthority(UserAuthority userAuthority) {
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	
	try{
		conn=datasource.getConnection();
		stmt=conn.prepareStatement("INSERT INTO UserAuthority(userNO,authorityNO,kind,createtime) VALUES(?,?,?,?)");
		stmt.setString(1, userAuthority.getUserNO());
		stmt.setString(2, userAuthority.getAuthorityNO());
		stmt.setString(3, userAuthority.getKind());
	//	stmt.setString(4, userAuthority.getState());
		
		stmt.setString(4,  userAuthority.getCreatetime());
		
		
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
public void updateUserAuthority(UserAuthority userAuthority){
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	try{
		conn=datasource.getConnection();
		stmt = conn.prepareStatement("update UserAuthority set  userNO=? ,authorityNO=?,kind=?,createtime=?  where  Id=?");
		stmt.setString(1, userAuthority.getUserNO());
		stmt.setString(2, userAuthority.getAuthorityNO());
		
		
		stmt.setString(3, userAuthority.getKind());
		
	//	stmt.setString(4, userAuthority.getState());
		stmt.setString(4,  userAuthority.getCreatetime());
		
		stmt.setInt(5,  userAuthority.getId());
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
public void deleteUserAuthority(UserAuthority userAuthority) {
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	try{
		conn=datasource.getConnection();
		stmt=conn.prepareStatement("DELETE FROM UserAuthority WHERE Id=?");
		stmt.setInt(1,userAuthority.getId());
		
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
