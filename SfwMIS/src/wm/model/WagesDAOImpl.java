package wm.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;



public class WagesDAOImpl implements WagesDAO {
	private DataSource datasource;
	
	public WagesDAOImpl(DataSource datasource){
		this.datasource=datasource;
}
	@Override
	public Wages getWageForChange(Wages wage) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Wages WHERE userName=? and date=?");
			stmt.setString(1,wage.getUserName());
			stmt.setString(2, wage.getDate());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				wage=new Wages();
				wage.setId(rs.getInt("Id"));
				wage.setUserNO(rs.getInt("userNO"));
				wage.setUserName(rs.getString("userName"));
				wage.setIntegral(rs.getFloat("integral"));
				wage.setShift(rs.getInt("Shift"));
				wage.setDate(rs.getString("date"));
				wage.setLate(rs.getInt("late"));
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
		return wage;
	}
	
	@Override
	public void updateWageLate(Wages wage){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update Wages set integral=?,late=? where Id=? ");
			
			stmt.setDouble(1, wage.getIntegral());
			stmt.setInt(2, wage.getLate());
			stmt.setInt(3,wage.getId());
			
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
	public void updateWageIntegral(Wages wage) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update Wages set integral=?,late=? where Id=? ");
			
			stmt.setDouble(1, wage.getIntegral());
			stmt.setInt(2, wage.getLate());
			stmt.setInt(3,wage.getId());
			
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
	public void updateWageShfit(Wages wage){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update Wages set integral=?,late=? where Id=? ");
			
			stmt.setDouble(1, wage.getIntegral());
			stmt.setInt(2, wage.getLate());
			stmt.setInt(3,wage.getId());
			
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
	public String getTheLastWageDate() {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		String administrator="0";
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("select * from Wages where Id=(select max(Id) from Wages)");
			//stmt.setString(1, administrator.getUserName());
			//stmt.setString(1, administrator1.getDate());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				administrator=rs.getString("date");
				
				
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
	public Wages getWage(Wages wage) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Wages WHERE userName=?");
			stmt.setString(1,wage.getUserName());
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				wage=new Wages();
				
				wage.setUserNO(rs.getInt("userNO"));
				wage.setUserName(rs.getString("userName"));
				wage.setAppeal(rs.getString("appeal"));
				wage.setToConfirm(rs.getString("toConfirm"));
				wage.setIntegral(rs.getFloat("integral"));
				//wage.setMorningShift(rs.getInt("morningshift"));
				//wage.setNightShift(rs.getInt("nightShift"));
				wage.setShift(rs.getInt("Shift"));
				wage.setWages(rs.getFloat("wages"));
				wage.setDate(rs.getString("date"));
				wage.setNum(rs.getInt("num"));
				//wage.setCustomerService(rs.getFloat("customerService"));
				wage.setFixed(rs.getFloat("fixed"));
				wage.setLate(rs.getInt("late"));
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
		return wage;
	}
	@Override
	public List<Wages> getWages(Wages wage) {
		//个人获取自己以往的工资信息
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<Wages> wages=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Wages WHERE userName=?");
			stmt.setString(1, wage.getUserName());
			//stmt.setString(2, customer.getPassword());
			ResultSet rs=stmt.executeQuery();
			wages=new ArrayList<Wages>();
			while(rs.next()){
				wage=new Wages();
				wage.setUserNO(rs.getInt("userNO"));
				wage.setUserName(rs.getString("userName"));
				wage.setAppeal(rs.getString("appeal"));
				wage.setToConfirm(rs.getString("toConfirm"));
				wage.setIntegral(rs.getFloat("integral"));
				//wage.setMorningShift(rs.getInt("morningshift"));
				//wage.setNightShift(rs.getInt("nightShift"));
				wage.setShift(rs.getInt("shift"));
				wage.setWages(rs.getFloat("wages"));
				wage.setDate(rs.getString("date"));
				wage.setNum(rs.getInt("num"));
				//wage.setCustomerService(rs.getFloat("customerService"));
				wage.setFixed(rs.getFloat("fixed"));
				wage.setLate(rs.getInt("late"));
				
			wages.add(wage);
			
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
		return wages;
	}
	
	
	@Override
	public List<Wages> getUndoWages(Wages wage) {
		//获取没付薪的工资表
		
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<Wages> wages=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Wages WHERE toConfirm is  null");
			//stmt.setString(1, qq);
			//stmt.setString(2, customer.getPassword());
			ResultSet rs=stmt.executeQuery();
			wages=new ArrayList<Wages>();
			while(rs.next()){
				wage=new Wages();
				wage.setUserNO(rs.getInt("userNO"));
				wage.setUserName(rs.getString("userName"));
				wage.setAppeal(rs.getString("appeal"));
				wage.setToConfirm(rs.getString("toConfirm"));
				wage.setIntegral(rs.getFloat("integral"));
				//wage.setMorningShift(rs.getInt("morningshift"));
				//wage.setNightShift(rs.getInt("nightShift"));
				wage.setShift(rs.getInt("shift"));
				wage.setWages(rs.getFloat("wages"));
				wage.setDate(rs.getString("date"));
				wage.setNum(rs.getInt("num"));
				//wage.setCustomerService(rs.getFloat("customerService"));
				wage.setFixed(rs.getFloat("fixed"));
				wage.setLate(rs.getInt("late"));
				
			wages.add(wage);
			
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
		return wages;
	}
	
	@Override
	public void addWage(Wages wage) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO Wages(userName,appeal,toConfirm,integral,shift,"
					+ "wages,date,num,fixed,late) VALUES(?,?,?,?,?,?,?,?,?,?)");
			
			stmt.setString(1, wage.getUserName());
			stmt.setString(2, wage.getAppeal());
			stmt.setString(3, wage.getToConfirm());
			stmt.setDouble(4,wage.getIntegral());
			//stmt.setInt(6, wage.getMorningShift());
			//stmt.setInt(6, wage.getNightShift());
			stmt.setInt(5, wage.getShift());
			stmt.setFloat(6, wage.getWages());
			stmt.setString(7,wage.getDate());
			stmt.setInt(8, wage.getNum());
			//stmt.setFloat(9, wage.getCustomerService());
			stmt.setFloat(9, wage.getFixed());
			stmt.setInt(10,wage.getLate());
			
			
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
	public void updateWage(Wages wage){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update wages set appeal=?,toConfirm=?,integral=?"
					+ "shift=?,wages=?,date=?,fixed=?,num=? where userName=? ");
			
			
			
			stmt.setString(1, wage.getAppeal());
			stmt.setString(2, wage.getToConfirm());
			stmt.setDouble(3,wage.getIntegral());
			//stmt.setInt(5, wage.getMorningShift());
			//stmt.setInt(5, wage.getNightShift());
			stmt.setInt(4, wage.getShift());
			stmt.setFloat(5, wage.getWages());
			stmt.setString(6,wage.getDate());
			//stmt.setFloat(8, wage.getCustomerService());
			stmt.setFloat(7, wage.getFixed());
			stmt.setInt(8, wage.getNum());
			stmt.setInt(9, wage.getLate());
			stmt.setString(10, wage.getUserName());
			
			
			
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
	public void deleteWage(Wages wage) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM Wages WHERE userName=? ");
			stmt.setString(1,wage.getUserName());
			
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
