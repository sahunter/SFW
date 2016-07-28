package dm.model;

import java.io.Serializable;
import java.util.Date;
import java.sql.Time;

public class UserRoute  implements Serializable{
	
	int  Id;
	String userNO;
	String routeNO;
	//String  state;
	
	
	String starttime;
	String finishtime;

public UserRoute(){
		
	}

public int getId() {
	return Id;
	
	
}
public String getRouteNO() {
    return routeNO;
}

public String getStarttime() {
    return starttime;
}
public String getUserNO() {
    return userNO;
}
/*public String  getState() {
    return state;
}*/
public String getFinishtime() {
    return finishtime;
}



public void setId(int  Id) {
    this.Id= Id;
}

public void setRouteNO(String  routeNO ) {
    this.routeNO= routeNO;
}


public void setUserNO(String   userNO) {
    this.userNO= userNO;
}
/*public void setState(String   state) {
    this.state= state;
}*/


public void setStarttime(String starttime) {
    this.starttime = starttime;
}
public void setFinishtime(String finishtime) {
    this.finishtime = finishtime;
}


}



