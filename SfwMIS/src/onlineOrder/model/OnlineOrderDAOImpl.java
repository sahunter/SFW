package onlineOrder.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;



public class OnlineOrderDAOImpl implements OnlineOrderDAO{
	private DataSource datasource;
	public OnlineOrderDAOImpl(DataSource datasource){
		this.datasource=datasource;
	}
	
	@Override
	public List<OnlineOrder> getOnlineOrders(OnlineOrder admin) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<OnlineOrder> administrators=null;
		OnlineOrder administrator=null;
		//int cccc=0;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM OnlineOrderSystem");
			//stmt.setString(1, administrator.getUserName());
			//stmt.setString(1, admin.getOrdertime());
			ResultSet rs=stmt.executeQuery();
			administrators=new ArrayList<OnlineOrder>();
			while(rs.next()){
				administrator=new OnlineOrder();
				administrator.setCustomername(rs.getString("customerName"));
				administrator.setOrdertime(rs.getString("ordertime"));
				administrator.setDomitory(rs.getString("domitory"));
				administrator.setRoomNO(rs.getString("RoomNO"));
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
	
/*	@Override
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
	}*/
	
	@Override
	public void addOnlineOrder(OnlineOrder administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO OnlineOrderSystem(customerName,ordertime,domitory,RoomNO) VALUES(?,?,?,?)");
			stmt.setString(1,administrator.getCustomername() );
			stmt.setString(2, administrator.getOrdertime());
			stmt.setString(3, administrator.getDomitory());
			stmt.setString(4, administrator.getRoomNO());

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
	public void deleteOnlineOrder(OnlineOrder administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM OnlineOrderSystem WHERE customername=? and ordertime=?");
			stmt.setString(1,administrator.getCustomername());
			stmt.setString(2, administrator.getOrdertime());
			//stmt.setString(3, administrator.getShift() );
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
