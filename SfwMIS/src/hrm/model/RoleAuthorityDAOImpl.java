package hrm.model;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import hrm.model.RoleAuthority;
public class RoleAuthorityDAOImpl implements 	RoleAuthorityDAO{
	private DataSource datasource;
	public RoleAuthorityDAOImpl(DataSource datasource){
		this.datasource=datasource;
}
	@SuppressWarnings("rawtypes")

	@Override
	public RoleAuthority getRoleAuthority(RoleAuthority roleAuthority) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM RoleAuthority WHERE Id=?");
			stmt.setInt(1,roleAuthority.getId());

			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();

			while(rs.next()){
				roleAuthority=new RoleAuthority();

				roleAuthority.setRoleNO(rs.getString("roleNO"));
				roleAuthority.setAuthorityNO(rs.getString("authorityNO"));
				roleAuthority.setKind(rs.getString("kind"));
			//	roleAuthority.setState(rs.getString("state"));
				roleAuthority.setCreatetime(rs.getString("createtime"));
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
		return roleAuthority;
	}





	@Override
	public  getRoleAuthoritys(RoleAuthority roleAuthority) {
		Connection conn=null;
		//PreparedStatement stmt=null;
		PreparedStatement stmt1=null;
		SQLException ex=null;
		List<RoleAuthority> roleAuthoritys=null;

		try{												 //and password=?
			conn=datasource.getConnection();
			//stmt=conn.prepareStatement("SELECT * FROM RoleAuthority WHERE Id=?");
			stmt1=conn.prepareStatement("SELECT * FROM RoleAuthority");
		//	stmt.setString(1, roleAuthority.getId());


			//stmt.setString(2, customer.getPassword());
			//ResultSet rs=stmt.executeQuery();
		//	roleAuthoritys=new ArrayList<RoleAuthority>();
		//	while(rs.next()){
			//	roleAuthority=new RoleAuthority();
			//	roleAuthority.setRoleNO(rs.getString("roleNO"));
			//	roleAuthority.setAuthorityNO(rs.getString("authorityNO"));
			//	roleAuthority.setKind(rs.getString("kind"));
			//	roleAuthority.setState(rs.getString("state"));
			//	roleAuthority.setCreatetime(rs.getString("createtime"));
		    //	roleAuthoritys.add(roleAuthority);

		//	}

			ResultSet rs1=stmt1.executeQuery();
			roleAuthoritys=new ArrayList<RoleAuthority>();
			while(rs1.next()){
				roleAuthority=new RoleAuthority();
				roleAuthority.setId(rs1.getInt("Id"));
				roleAuthority.setRoleNO(rs1.getString("roleNO"));
				roleAuthority.setAuthorityNO(rs1.getString("authorityNO"));
				roleAuthority.setKind(rs1.getString("kind"));

			//	roleAuthority.setState(rs1.getString("state"));
				roleAuthority.setCreatetime(rs1.getString("createtime"));

				roleAuthoritys.add(roleAuthority);

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
		return roleAuthoritys;
	}
	@Override
public void addRoleAuthority(RoleAuthority roleAuthority) {
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;

	try{
		conn=datasource.getConnection();
		stmt=conn.prepareStatement("INSERT INTO RoleAuthority(roleNO,authorityNO,kind,createtime) VALUES(?,?,?,?)");
		stmt.setString(1, roleAuthority.getRoleNO());
		stmt.setString(2, roleAuthority.getAuthorityNO());
		stmt.setString(3, roleAuthority.getKind());
	//	stmt.setString(4, roleAuthority.getState());
		stmt.setString(4,  roleAuthority.getCreatetime());

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
public void updateRoleAuthority(RoleAuthority roleAuthority){
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	try{
		conn=datasource.getConnection();
		stmt = conn.prepareStatement("update RoleAuthority set roleNO=?,authorityNO=?,kind=?,createtime=?  WHERE  Id=?");
		stmt.setString(1,roleAuthority.getRoleNO());
		stmt.setString(2, roleAuthority.getAuthorityNO());
		stmt.setString(3, roleAuthority.getKind());
	//	stmt.setString(4, roleAuthority.getState());
		stmt.setString(4, roleAuthority.getCreatetime());
		stmt.setInt(5, roleAuthority.getId());

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
public void deleteRoleAuthority(RoleAuthority roleAuthority) {
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	try{
		conn=datasource.getConnection();
		stmt=conn.prepareStatement("DELETE FROM RoleAuthority WHERE Id=?");
		stmt.setInt(1,roleAuthority.getId());

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
}}
