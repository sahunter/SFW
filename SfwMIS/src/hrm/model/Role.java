package hrm.model;

import java.io.Serializable;
import java.util.Date;


public class Role implements Serializable{
	
	String roleNO;
	String roleName;
	String createtime;
	String roleDescription;
public Role() {
}
public String getRoleNO() {
    return roleNO;
}


public String getRoleName() {
    return roleName;
}
public String getCreatetime() {
    return createtime;
}
public String getRoleDescription() {
    return roleDescription;
}

public void setRoleNO(String roleNO ) {
    this.roleNO= roleNO;
}




public void setRoleName(String  roleName ) {
    this.roleName= roleName;
}

public void setCreatetime(String createtime) {
    this.createtime = createtime;
}

public void setRoleDescription(String roleDescription) {
    this.roleDescription = roleDescription;
}



}
