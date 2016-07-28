package dm.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

public class Route  implements Serializable{
	int Id;
	String routeNO;
	String createtime;
	String area;
	String  domitory;
	String  route;
	String lastestDelivery;
	String boxSequence;
public Route(){
		
	}
public int getId() {
    return Id;
}

public String getRouteNO() {
    return routeNO;
}
public String getCreatetime() {
    return createtime;
}
public String getArea() {
    return area;
}


public String getDomitory() {
    return domitory;
}
public String  getRoute() {
    return route;
}
public String  getLastestDelivery() {
    return lastestDelivery;
}

public String  getBoxSequence() {
    return boxSequence;
}
public void setId(int  Id ) {
    this.Id= Id;
}


public void setRouteNO(String  routeNO ) {
    this.routeNO= routeNO;
}

public void setCreatetime(String createtime) {
    this.createtime = createtime;
}

public void setArea(String area) {
    this.area =area;
}

public void setDomitory(String   domitory) {
    this.domitory= domitory;
}
public void setRoute(String   route) {
    this.route= route;
}
public void setLastestDelivery(String   lastestDelivery) {
    this.lastestDelivery= lastestDelivery;
}
public void setBoxSequence(String   boxSequence) {
    this.boxSequence= boxSequence;
}


}
