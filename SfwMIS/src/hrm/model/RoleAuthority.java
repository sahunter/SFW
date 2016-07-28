package hrm.model;

import java.io.Serializable;
import java.util.Date;
import java.sql.ResultSet;


public class RoleAuthority implements Serializable {
	 
	
	private int Id;
	 String roleNO;
	  String authorityNO;
	// String state;
	 String kind;
	 String createtime;
	public RoleAuthority() {
	}
	public   int getId() {
	    return Id;
	}
	
	
	public   String getRoleNO() {
	    return roleNO;
	}
	
	public   String getAuthorityNO() {
	    return authorityNO;
	}
	//public String getState() {
	//    return state;
//	}
	
	
	public String getKind() {
	    return kind;
	}
	public    String getCreatetime() {
	    return  createtime;
	}
	
	public void setId(int Id ) {
	    this.Id= Id;
	}
	public void setRoleNO(String roleNO ) {
	    this.roleNO= roleNO;
	}

	
	public void setAuthorityNO(String  authorityNO ) {
	    this.authorityNO= authorityNO;
	}
//	public void setState(String state) {
//	    this.state = state;
//	}
	
	public void setKind(String  kind ) {
	    this.kind= kind;
	}
	
	public void setCreatetime(String createtime) {
		// TODO Auto-generated method stub
		this.createtime= createtime;
	}
}
