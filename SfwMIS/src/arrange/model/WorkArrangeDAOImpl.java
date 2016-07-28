package arrange.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class WorkArrangeDAOImpl  implements WorkArrangeDAO{
	private DataSource datasource;
	public WorkArrangeDAOImpl(DataSource datasource){
		this.datasource=datasource;
	}
	
	@Override
	public List<WorkArrange> getWorkArranges(WorkArrange admin) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<WorkArrange> administrators=null;
		WorkArrange administrator=null;
		//int cccc=0;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT distinct userName,workTime,shift FROM WorkArrange WHERE date=?");
			//stmt.setString(1, administrator.getUserName());
			stmt.setString(1, admin.getDate());
			ResultSet rs=stmt.executeQuery();
			administrators=new ArrayList<WorkArrange>();
			while(rs.next()){
				administrator=new WorkArrange();
				administrator.setUserName(rs.getString("userName"));
				administrator.setDate(admin.getDate());
				administrator.setWorkTime(rs.getString("workTime"));
				administrator.setShift(rs.getString("shift"));
				administrators.add(administrator);
				
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
		return administrators;
	}
	
	@Override
	public WorkArrange getTheLastOne() {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		WorkArrange administrator=new WorkArrange();
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("select * from WorkArrange where Id=(select max(Id) from WorkArrange)");
			//stmt.setString(1, administrator.getUserName());
			//stmt.setString(1, administrator1.getDate());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				administrator.setId(rs.getInt("Id"));
				administrator.setUserName(rs.getString("userName"));
				administrator.setDate(rs.getString("date"));
				administrator.setWorkTime(rs.getString("workTime"));
				administrator.setShift(rs.getString("shift"));
				
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
		return administrator;
	}
	
	@Override
	public void addWorkArrange(WorkArrange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO WorkArrange(userName,workTime,date,shift) VALUES(?,?,?,?)");
			stmt.setString(1,administrator.getUserName() );
			stmt.setString(2, administrator.getWorkTime());
			stmt.setString(3, administrator.getDate());
			stmt.setString(4, administrator.getShift());

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
	
	/*@Override
	public void updateWorkArrange(WorkArrange administrator){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn
					.prepareStatement("update WorkArrange set date=?,shift=? where name=? and password=?");
			stmt.setString(1, administrator.getNewPassword());
			stmt.setString(2, administrator.getName());
			stmt.setString(3, administrator.getPassword());
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
	}*/
	
	@Override
	public void deleteWorkArrange(WorkArrange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM WorkArrange WHERE userName=? and date=? and shift=?");
			stmt.setString(1,administrator.getUserName());
			stmt.setString(2, administrator.getDate());
			stmt.setString(3, administrator.getShift() );
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
