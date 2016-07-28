package hrm.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import hrm.model.Role;
public class RoleDAOImpl implements RoleDAO{
	private DataSource datasource;
	public RoleDAOImpl(DataSource datasource){
		this.datasource=datasource;
	}

	@Override
	public Role getRole(Role role) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;

		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Role WHERE roleNO=?");
			stmt.setString(1,role.getRoleNO());
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();

			while(rs.next()){
				role=new Role();

				role.setRoleNO(rs.getString("roleNO"));
				role.setRoleName(rs.getString("roleName"));
				role.setCreatetime(rs.getString("createtime"));
				role.setRoleDescription(rs.getString("roleDescription"));

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
		return role;
	}
	@Override
	public List<Role> getRoles(Role role) {
		Connection conn=null;
	//	PreparedStatement stmt=null;
		PreparedStatement stmt1=null;
		SQLException ex=null;
		List<Role> roles=null;

		try{												 //and password=?
			conn=datasource.getConnection();
		//	stmt=conn.prepareStatement("SELECT * FROM Role WHERE RoleNO=?");
			stmt1=conn.prepareStatement("SELECT * FROM Role");
		//	stmt.setString(1, role.getRoleNO());
			//stmt.setString(2, customer.getPassword());
		//	ResultSet rs=stmt.executeQuery();
		//	roles=new ArrayList<Role>();
		//	while(rs.next()){
		/*		role=new Role();
				role.setRoleNO(rs.getString("roleNO"));
				role.setRoleName(rs.getString("roleName"));
				role.setCreatetime(rs.getString("createtime"));
				role.setRoleDescription(rs.getString("roleDescription"));
				roles.add(role);

			}*/

			ResultSet rs1=stmt1.executeQuery();
			roles=new ArrayList<Role>();
			while(rs1.next()){
				role=new Role();
				role.setRoleNO(rs1.getString("roleNO"));
				role.setRoleName(rs1.getString("roleName"));
				role.setCreatetime(rs1.getString("createtime"));
				role.setRoleDescription(rs1.getString("roleDescription"));
				roles.add(role);

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
		return roles;
	}
	@Override
	public void addRole(Role role) {
		Connection conn=null;
		PreparedStatement stmt=null;
		//PreparedStatement stmt1=null;
	//	PreparedStatement stmt2=null;
		SQLException ex=null;

		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO Role(roleNO,roleName,createtime,roleDescription) VALUES(?,?,?,?)");
		//	stmt1=conn.prepareStatement("INSERT INTO RoleAuthority(roleNO) VALUES(?)");
		//	stmt2=conn.prepareStatement("INSERT INTO UserRole(roleNO) VALUES(?)");
			stmt.setString(1, role.getRoleNO());
			stmt.setString(2, role.getRoleName());
			stmt.setString(3,  role.getCreatetime());
			stmt.setString(4, role.getRoleDescription());

		//	stmt1.setString(1, role.getRoleNO());
	//		stmt2.setString(1, role.getRoleNO());

		//	conn.setAutoCommit(false);
			stmt.executeUpdate();
		//	stmt1.executeUpdate();
		//	stmt2.executeUpdate();
			}catch(SQLException e){
				ex=e;
				/*if(conn!=null){
					try{
						conn.rollback();

					}catch(SQLException e1){
						ex.setNextException(e);{
							ex=e;
						}
					}


				}*/

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
	public void updateRole(Role role){
		Connection conn=null;
		PreparedStatement stmt=null;
	//	PreparedStatement stmt1=null;
	//	PreparedStatement stmt2=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update Role set roleName=?,createtime=?,roleDescription=? where roleNO=?  ");



			stmt.setString(1, role.getRoleName());
			stmt.setString(2, role.getCreatetime());

			stmt.setString(3, role.getRoleDescription());
			stmt.setString(4, role.getRoleNO());

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
	public void deleteRole(Role role) {
		Connection conn=null;
		PreparedStatement stmt=null;
		//PreparedStatement stmt1=null;
		//PreparedStatement stmt2=null;

		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM Role WHERE roleNO=? ");
		//	stmt1=conn.prepareStatement("DELETE FROM UserRole WHERE roleNO=? ");
		//	stmt2=conn.prepareStatement("DELETE FROM RoleAuthority WHERE roleNO=? ");


			stmt.setString(1,role.getRoleNO());
		//	stmt1.setString(1,role.getRoleNO());
		//	stmt2.setString(1,role.getRoleNO());


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

	}

}
