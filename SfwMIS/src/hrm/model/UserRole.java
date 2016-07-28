package hrm.model;

import java.io.Serializable;
import java.util.Date;


public class UserRole  implements Serializable{
	private int Id;
 String userNO;
	 String roleNO;
//	 String  state;
	 
	String Createtime;
	
	
	public UserRole() {
	}
	public   int getId() {
	    return Id;
	}
	public String getUserNO() {
	    return userNO;
	}
	public  String getRoleNO() {
	    return roleNO;
	}
	public String getCreatetime() {
	    return Createtime;
	}
	/*public String getState() {
	    return state;
	}*/
	public void setId(int  Id ) {
	    this.Id= Id;
	}
	
	public void setUserNO(String  userNO ) {
	    this.userNO= userNO;
	}
	
	public void setRoleNO(String roleNO ) {
	    this.roleNO= roleNO;
	}
	public void setCreatetime(String Createtime) {
	    this.Createtime = Createtime;
	}
	/*public void setState(String state) {
	    this.state = state;
	}*/
}
