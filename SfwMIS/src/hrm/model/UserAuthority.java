package hrm.model;

import java.io.Serializable;
import java.util.Date;


public final class UserAuthority implements Serializable{
	
	private int Id;
	String userNO;
	String authorityNO;
	
	
//	String  state;
	String kind;
	String createtime;

public UserAuthority() {
}

public  int getId() {
    return Id;
}

public String getUserNO() {
    return userNO;
}

public String getAuthorityNO() {
    return authorityNO;
}
/*public String getState() {
    return state;
}*/

public String getKind() {
    return kind;
}
public String getCreatetime() {
    return createtime;
}

public void setId(int Id ) {
    this.Id= Id;
}
public void setUserNO(String  userNO ) {
    this.userNO= userNO;
}
public void setAuthorityNO(String  authorityNO ) {
    this.authorityNO= authorityNO;
}
public void setKind(String  kind ) {
    this.kind= kind;
}

/*public void setState(String state) {
    this.state = state;
}*/

public void setCreatetime(String createtime) {
    this.createtime = createtime;
}


}