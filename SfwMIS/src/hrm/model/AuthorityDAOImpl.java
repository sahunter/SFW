package hrm.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import hrm.model.Authority;
public class AuthorityDAOImpl implements AuthorityDAO{
	private DataSource datasource;
	public AuthorityDAOImpl(DataSource datasource){
		this.datasource=datasource;
}
	
	@Override
	public Authority getAuthority(Authority authority) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Authority WHERE  authorityNO=?");
			stmt.setString(1,authority.getAuthorityNO());
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				authority=new Authority();
				
				authority.setAuthorityNO(rs.getString("authorityNO"));
				authority.setAuthorityName(rs.getString("authorityName"));
				
				authority.setAuthorityDescription(rs.getString("authorityDescription"));
				authority.setCreatetime(rs.getString("createtime"));
				
			
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
		return authority;
	}
	
	@Override
	public List<Authority> getAuthoritys(Authority authority) {
		Connection conn=null;
		PreparedStatement stmt=null;
		PreparedStatement stmt1=null;
		
		SQLException ex=null;
		List<Authority> authoritys=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
		//	stmt=conn.prepareStatement("SELECT * FROM Authority WHERE AuthorityNO=?");
			
			stmt1=conn.prepareStatement("SELECT * FROM Authority ");
			//stmt.setString(1, authority.getAuthorityNO());
			//stmt.setString(2, customer.getPassword());
			/*ResultSet rs=stmt.executeQuery();
			authoritys=new ArrayList<Authority>();
			while(rs.next()){
				authority=new Authority();
				authority.setAuthorityNO(rs.getString("authorityNO"));
				authority.setAuthorityName(rs.getString("authorityName"));
				
				authority.setAuthorityDescription(rs.getString("authorityDescription"));
				authority.setCreatetime(rs.getString("createtime"));
				
			authoritys.add(authority);
			
			}*/
			ResultSet rs1=stmt1.executeQuery();
			authoritys=new ArrayList<Authority>();
			while(rs1.next()){
				authority=new Authority();
				authority.setAuthorityNO(rs1.getString("authorityNO"));
				authority.setAuthorityName(rs1.getString("authorityName"));
				
				authority.setAuthorityDescription(rs1.getString("authorityDescription"));
				authority.setCreatetime(rs1.getString("createtime"));
				
			authoritys.add(authority);
			
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
		return authoritys;
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void addAuthority(Authority authority) {
		Connection conn=null;
		PreparedStatement stmt=null;
	//	PreparedStatement stmt1=null;
	//	PreparedStatement stmt2=null;
		
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO Authority(authorityNO,authorityName,authorityDescription,createtime) VALUES(?,?,?,?)");
	//		stmt1=conn.prepareStatement("INSERT INTO RoleAuthority(authorityNO) VALUES(?)");
	//		stmt2=conn.prepareStatement("INSERT INTO UserAuthority(authorityNO) VALUES(?)");
			stmt.setString(1, authority.getAuthorityNO());
			stmt.setString(2, authority.getAuthorityName());
		
			stmt.setString(3, authority.getAuthorityDescription());
			stmt.setString(4,  authority.getCreatetime());
	//		stmt1.setString(1, authority.getAuthorityNO());
	//		stmt2.setString(1, authority.getAuthorityNO());
			stmt.executeUpdate();
	//		stmt1.executeUpdate();
	//		stmt2.executeUpdate();
			
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
	public void updateAuthority(Authority authority){
		Connection conn=null;
		PreparedStatement stmt=null;
		
		
		
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update Authority set authorityName=?,authorityDescription=?,createtime=? where  authorityNO=? ");
			stmt.setString(1, authority.getAuthorityName());
			stmt.setString(2, authority.getAuthorityDescription());	
			stmt.setString(3,  authority.getCreatetime());
			stmt.setString(4, authority.getAuthorityNO());
			
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
	public void deleteAuthority(Authority authority) {
		Connection conn=null;
		PreparedStatement stmt=null;
	//	PreparedStatement stmt1=null;
	//	PreparedStatement stmt2=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM Authority WHERE authorityNO=? ");
		//	stmt1=conn.prepareStatement("DELETE FROM RoleAuthority WHERE authorityNO=? ");
		//	stmt2=conn.prepareStatement("DELETE FROM UserAuthority WHERE authorityNO=? ");
			stmt.setString(1,authority.getAuthorityNO());
		//	stmt1.setString(1,authority.getAuthorityNO());
		//	stmt2.setString(1,authority.getAuthorityNO());
			stmt.executeUpdate();
		//	stmt1.executeUpdate();
		//	stmt2.executeUpdate();
			
			
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
		
	}}
	
	
	
	
	
	
	
	
	
	
	