package hrm.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import hrm.model.User;



public class UserDAOImpl implements UserDAO{
	private DataSource datasource;
	public UserDAOImpl(DataSource datasource){
		this.datasource=datasource;
	}

	@Override
	public User getUser(User user) {
		Connection conn=null;
		PreparedStatement stmt=null;
		PreparedStatement stmt1=null;
		SQLException ex=null;

		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM [User] WHERE username=?");
		//	stmt1=conn.prepareStatement("SELECT * FROM User");
			stmt.setString(1,user.getUsername());
	//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();

			while(rs.next()){
				user=new User();

				user.setUserNO(rs.getString("userNO"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setMail(rs.getString("mail"));

				user.setHobbies(rs.getString("hobbies"));
				user.setPosition(rs.getString("position"));
				user.setState(rs.getString("state"));
				user.setSparetime(rs.getString("sparetime"));
			}
		/*	ResultSet rs1=stmt1.executeQuery();
			while(rs1.next()){
				user=new User();

				user.setUserNO(rs1.getString("userNO"));
				user.setUsername(rs1.getString("username"));
				user.setPassword(rs1.getString("password"));
				user.setPhone(rs1.getString("phone"));
				user.setMail(rs1.getString("mail"));

				user.setHobbies(rs1.getString("hobbies"));
				user.setPosition(rs1.getString("position"));
				user.setState(rs1.getString("state"));
				user.setSparetime(rs1.getString("sparetime"));
			}*/



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
		return user;
	}

	@Override
	public List<User> getUsers() {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<User> users=null;
		User user;
		try{												 //and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM [User] WHERE username IS NOT��NULL");
		/*	stmt.setString(1, user.getUsername());*/
			//stmt.setString(2, customer.getPassword());
			ResultSet rs=stmt.executeQuery();
			users=new ArrayList<User>();
			while(rs.next()){
				user=new User();
				user.setUserNO(rs.getString("userNO"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setMail(rs.getString("mail"));

				user.setHobbies(rs.getString("hobbies"));
				user.setPosition(rs.getString("position"));
				user.setState(rs.getString("state"));

				user.setSparetime(rs.getString("sparetime"));
				users.add(user);

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
		return users;
	}

	@Override
	public List<User> getUsers(User user) {
		Connection conn=null;
		//PreparedStatement stmt=null;
		PreparedStatement stmt1=null;
		SQLException ex=null;
		List<User> users=null;
		try{												 //and password=?
			conn=datasource.getConnection();
			//stmt=conn.prepareStatement("SELECT * FROM User WHERE userNO=?");
			stmt1=conn.prepareStatement("SELECT * FROM [User]");

			//stmt.setString(1, user.getUserNO());
			//stmt.setString(2, customer.getPassword());
			//ResultSet rs=stmt.executeQuery();


			//users=new ArrayList<User>();
		/*while(rs.next()){
				user=new User();
				user.setUserNO(rs.getString("userNO"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setMail(rs.getString("mail"));
				user.setHobbies(rs.getString("hobbies"));
				user.setPosition(rs.getString("position"));
				user.setState(rs.getString("state"));

				user.setSparetime(rs.getString("sparetime"));

				users.add(user);

			}*/
			ResultSet rs1=stmt1.executeQuery();

			users=new ArrayList<User>();
			while(rs1.next()){
				user=new User();
				user.setUserNO(rs1.getString("userNO"));
				user.setUsername(rs1.getString("username"));
				user.setPassword(rs1.getString("password"));
				user.setPhone(rs1.getString("phone"));
				user.setMail(rs1.getString("mail"));

				user.setHobbies(rs1.getString("hobbies"));
				user.setPosition(rs1.getString("position"));
				user.setState(rs1.getString("state"));

				user.setSparetime(rs1.getString("sparetime"));
				users.add(user);

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
		return users;
	}

	@Override
	public void addUser(User user) {
		Connection conn=null;
		PreparedStatement stmt=null;

		//PreparedStatement stmt1=null;
	//	PreparedStatement stmt2=null;

		SQLException ex=null;

		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO [User](userNO,username,password,phone,mail,hobbies,position,state,sparetime) VALUES(?,?,?,?,?,?,?,?,?)");

		//	stmt2=conn.prepareStatement("INSERT INTO UserRole(userNO)  VALUES(?)");

			stmt.setString(1, user.getUserNO());
			stmt.setString(2,user.getUsername());
			stmt.setString(3, user.getPassword());
			stmt.setString(4, user.getPhone());
			stmt.setString(5, user.getMail());
			stmt.setString(6,user.getHobbies());
			stmt.setString(7, user.getPosition());
			stmt.setString(8, user.getState());
			stmt.setString(9, user.getSparetime());

		//	stmt2.setString(1, user.getUserNO());

			//conn.setAutoCommit(false);
			stmt.executeUpdate();

		//	stmt2.executeUpdate();
			}catch(SQLException e){
				ex=e;
			//	if(conn!=null){
				//	try{
				//		conn.rollback();
				//
					//}catch(SQLException e1){
					//	ex.setNextException(e);{
					//		ex=e;
					//	}
					//}


				//}
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
	public void updateUser(User user){
		Connection conn=null;
		PreparedStatement stmt=null;
		PreparedStatement stmt1=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update [User] set userNO=?,username=?,password=?,phone=?,mail=?,hobbies=?,position=?,state=?,sparetime=? where userNO=?");

			stmt.setString(1, user.getUserNO());
			stmt.setString(2,user.getUsername());
			stmt.setString(3, user.getPassword());
			stmt.setString(4, user.getPhone());
			stmt.setString(5, user.getMail());
			stmt.setString(6,user.getHobbies());
			stmt.setString(7, user.getPosition());
			stmt.setString(8, user.getState());
			stmt.setString(9, user.getSparetime());
			stmt.setString(10, user.getUserNO());

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
	public void deleteUser(User user) {
		Connection conn=null;
		PreparedStatement stmt=null;
	//	PreparedStatement stmt1=null;
	//	PreparedStatement stmt2=null;

		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM [User] WHERE userNO=? ");
	//		stmt1=conn.prepareStatement("DELETE FROM UserRole WHERE userNO=? ");
	//		stmt2=conn.prepareStatement("DELETE FROM UserAuthority WHERE userNO=? ");

			stmt.setString(1,user.getUserNO());
	//		stmt1.setString(1,user.getUserNO());
	//		stmt2.setString(1,user.getUserNO());

			stmt.executeUpdate();
		//	stmt1.executeUpdate();
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


}
