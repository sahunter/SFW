package onlineOrder.model;

import java.io.Serializable;

public class OnlineOrder implements Serializable{
	private int Id;
	private String orderNO;
	private String customername;
	private String ordertime;
	private String domitary;
	private String RoomNO;
	
public OnlineOrder(){
		
	}


public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getOrderNO() {
	return orderNO;
}
public void setOrderNO(String orderNO) {
	this.orderNO = orderNO;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getOrdertime() {
	return ordertime;
}
public void setOrdertime(String ordertime) {
	this.ordertime = ordertime;
}
public String getDomitory() {
	return domitary;
}
public void setDomitory(String domitary) {
	this.domitary = domitary;
}
public String getRoomNO() {
	return RoomNO;
}
public void setRoomNO(String roomNO) {
	RoomNO = roomNO;
}


}

