package arrange.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
public class WorkChangeDAOImpl  implements WorkChangeDAO{
	private DataSource datasource;
	public WorkChangeDAOImpl(DataSource datasource){
		this.datasource=datasource;
	}

	@Override
	public WorkChange getChangeOff(WorkChange workChange) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		WorkChange administrator = null;
		try{                                                    // WHERE userName=? and date=?		 and dayOff=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM WorkChange WHERE date=? and time=? and changeOff=? and userName=?");
			
			stmt.setString(1, workChange.getDate());
			stmt.setString(2, workChange.getTime());
			stmt.setString(3, workChange.getChangeOff());
			//stmt.setString(4, workChange.getDayOff());
			stmt.setString(4, workChange.getUserName());
			ResultSet rs=stmt.executeQuery();
			administrator=new WorkChange();
			while(rs.next()){
				
				administrator.setId(rs.getInt("Id"));
				administrator.setUserName(rs.getString("userName"));
				administrator.setDate(rs.getString("date"));
				administrator.setTime(rs.getString("time"));
				administrator.setBeingLate(rs.getString("beingLate"));
				administrator.setChangeOff(rs.getString("changeOff"));
				administrator.setDayOff(rs.getString("dayOff"));
				administrator.setJoinPopularization(rs.getString("joinPopularization"));
				administrator.setWorkOverTime(rs.getString("workOverTime"));
				
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
	public WorkChange getDayOff(WorkChange workChange) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		WorkChange administrator = null;
		try{                                                    // WHERE userName=? and date=?		 and changeOff=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM WorkChange WHERE date=? and time=? and dayOff=? and userName=?");
			
			stmt.setString(1, workChange.getDate());
			stmt.setString(2, workChange.getTime());
			//stmt.setString(3, workChange.getChangeOff());
			stmt.setString(3, workChange.getDayOff());
			stmt.setString(4, workChange.getUserName());
			ResultSet rs=stmt.executeQuery();
			administrator=new WorkChange();
			while(rs.next()){
				
				administrator.setId(rs.getInt("Id"));
				administrator.setUserName(rs.getString("userName"));
				administrator.setDate(rs.getString("date"));
				administrator.setTime(rs.getString("time"));
				administrator.setBeingLate(rs.getString("beingLate"));
				administrator.setChangeOff(rs.getString("changeOff"));
				administrator.setDayOff(rs.getString("dayOff"));
				administrator.setJoinPopularization(rs.getString("joinPopularization"));
				administrator.setWorkOverTime(rs.getString("workOverTime"));
				
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
	public List<WorkChange> getWorkChangeBLs() {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<WorkChange> administrators=null;
		WorkChange administrator;
		try{                                                    // WHERE userName=? and date=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM WorkChange WHERE beinglate IS NOT NULL");
			//stmt.setString(1, administrator.getUserName());
			//stmt.setString(2, administrator.getDate());
			ResultSet rs=stmt.executeQuery();
			administrators=new ArrayList<WorkChange>();
			while(rs.next()){
				administrator=new WorkChange();
				administrator.setId(rs.getInt("Id"));
				administrator.setUserName(rs.getString("userName"));
				administrator.setDate(rs.getString("date"));
				administrator.setTime(rs.getString("time"));
				administrator.setBeingLate(rs.getString("beingLate"));
				administrator.setChangeOff(rs.getString("changeOff"));
				administrator.setDayOff(rs.getString("dayOff"));
				administrator.setJoinPopularization(rs.getString("joinPopularization"));
				administrator.setWorkOverTime(rs.getString("workOverTime"));
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
	public List<WorkChange> getWorkChangeWOTs() {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<WorkChange> administrators=null;
		WorkChange administrator;
		try{                                                    // WHERE userName=? and date=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM WorkChange WHERE workOverTime IS NOT NULL");
			//stmt.setString(1, administrator.getUserName());
			//stmt.setString(2, administrator.getDate());
			ResultSet rs=stmt.executeQuery();
			administrators=new ArrayList<WorkChange>();
			while(rs.next()){
				administrator=new WorkChange();
				administrator.setId(rs.getInt("Id"));
				administrator.setUserName(rs.getString("userName"));
				administrator.setDate(rs.getString("date"));
				administrator.setTime(rs.getString("time"));
				administrator.setBeingLate(rs.getString("beingLate"));
				administrator.setChangeOff(rs.getString("changeOff"));
				administrator.setDayOff(rs.getString("dayOff"));
				administrator.setJoinPopularization(rs.getString("joinPopularization"));
				administrator.setWorkOverTime(rs.getString("workOverTime"));
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
	public List<WorkChange> getBeingLates(WorkChange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<WorkChange> administrators=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM WorkChange WHERE userName=? and beinglate IS NOT NULL");
			stmt.setString(1, administrator.getUserName());
			//stmt.setDate(2, administrator.getDate());
			ResultSet rs=stmt.executeQuery();
			administrators=new ArrayList<WorkChange>();
			while(rs.next()){
				administrator=new WorkChange();
				administrator.setId(rs.getInt("Id"));
				administrator.setUserName(rs.getString("userName"));
				administrator.setDate(rs.getString("date"));
				administrator.setTime(rs.getString("time"));
				administrator.setBeingLate(rs.getString("beingLate"));
				administrator.setChangeOff(rs.getString("changeOff"));
				administrator.setDayOff(rs.getString("dayOff"));
				administrator.setJoinPopularization(rs.getString("joinPopularization"));
				administrator.setWorkOverTime(rs.getString("workOverTime"));
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
	public List<WorkChange> getPopularizations(WorkChange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<WorkChange> administrators=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM WorkChange WHERE joinPopularization IS NOT NULL AND userName IS NULL");
			//stmt.setString(1, administrator.getUserName());
			//stmt.setDate(2, administrator.getDate());
			ResultSet rs=stmt.executeQuery();
			administrators=new ArrayList<WorkChange>();
			while(rs.next()){
				administrator=new WorkChange();
				administrator.setId(rs.getInt("Id"));
				administrator.setChangeNO(rs.getFloat("changeNO"));
				administrator.setUserName(rs.getString("userName"));
				administrator.setDate(rs.getString("date"));
				administrator.setTime(rs.getString("time"));
				administrator.setBeingLate(rs.getString("beingLate"));
				administrator.setChangeOff(rs.getString("changeOff"));
				administrator.setDayOff(rs.getString("dayOff"));
				administrator.setJoinPopularization(rs.getString("joinPopularization"));
				administrator.setWorkOverTime(rs.getString("workOverTime"));
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
	public List<WorkChange> getWorkOverTimes(WorkChange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<WorkChange> administrators=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM WorkChange WHERE userName=? and workOverTime IS NOT NULL");
			stmt.setString(1, administrator.getUserName());
			//stmt.setDate(2, administrator.getDate());
			ResultSet rs=stmt.executeQuery();
			administrators=new ArrayList<WorkChange>();
			while(rs.next()){
				administrator=new WorkChange();
				administrator.setId(rs.getInt("Id"));
				administrator.setUserName(rs.getString("userName"));
				administrator.setDate(rs.getString("date"));
				administrator.setTime(rs.getString("time"));
				administrator.setBeingLate(rs.getString("beingLate"));
				administrator.setChangeOff(rs.getString("changeOff"));
				administrator.setDayOff(rs.getString("dayOff"));
				administrator.setJoinPopularization(rs.getString("joinPopularization"));
				administrator.setWorkOverTime(rs.getString("workOverTime"));
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
	public void addWorkChange(WorkChange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO WorkChange(userName,date,time,dayOff,changeOff,workOverTime,joinPopularization,beingLate,changeNO) VALUES(?,?,?,?,?,?,?,?,?)");
			stmt.setString(1,administrator.getUserName() );
			stmt.setString(2, administrator.getDate());
			stmt.setString(3,administrator.getTime());
			stmt.setString(4, administrator.getDayOff());
			stmt.setString(5, administrator.getChangeOff());
			stmt.setString(6,administrator.getWorkOverTime());
			stmt.setString(7, administrator.getJoinPopularization());
			stmt.setString(8, administrator.getBeingLate());
			stmt.setFloat(9, administrator.getChangeNO());
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
	public void updateWorkOverTime(WorkChange administrator){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn
					.prepareStatement("INSERT INTO WorkChange(userName,date,time,workOverTime) VALUES(?,?,?,?)");
			stmt.setString(1,administrator.getUserName() );
			stmt.setString(2, administrator.getDate());
			stmt.setString(3,administrator.getTime());
			stmt.setString(4,administrator.getWorkOverTime());
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
	public void updateBeingLate(WorkChange administrator){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn
					.prepareStatement("INSERT INTO WorkChange(userName,date,time,beingLate) VALUES(?,?,?,?)");
			stmt.setString(1,administrator.getUserName() );
			stmt.setString(2, administrator.getDate());
			stmt.setString(3,administrator.getTime());
			stmt.setString(4,administrator.getBeingLate());
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
	public void updateRealBeingLate(WorkChange administrator){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn
					.prepareStatement("update WorkChange set userName=?,date=?,time=?,beingLate=? where Id=?");
			stmt.setString(1,administrator.getUserName() );
			stmt.setString(2, administrator.getDate());
			stmt.setString(3,administrator.getTime());
			stmt.setString(4,administrator.getBeingLate());
			stmt.setInt(5,administrator.getId() );
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
	public void deleteWorkChange(WorkChange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM WorkChange WHERE userName=? and date=? and time=?");
			stmt.setString(1,administrator.getUserName());
			stmt.setString(2, administrator.getDate());
			stmt.setString(3, administrator.getTime() );
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
