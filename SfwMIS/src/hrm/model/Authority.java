package hrm.model;

import java.io.Serializable;
import java.util.Date;


public class Authority implements Serializable{
	
	String authorityNO;
	String authorityName;

	String authorityDescription;
	String createtime;
public Authority() {
}
public String getAuthorityNO() {
    return authorityNO;
}


public String getAuthorityName() {
    return  authorityName;
}

  
public String getAuthorityDescription() {
    return authorityDescription;
}
public String getCreatetime() {
    return createtime;
}

public void setAuthorityNO(String authorityNO ) {
    this.authorityNO= authorityNO;
}




public void setAuthorityName(String  authorityName ) {
    this.authorityName= authorityName;
}



public void setAuthorityDescription(String authorityDescription) {
    this.authorityDescription = authorityDescription;
}

public void setCreatetime(String createtime) {
    this.createtime = createtime;
}

}
