package onlineOrder.model;

import java.util.List;



public interface OnlineOrderDAO {
	void addOnlineOrder(OnlineOrder workArrange);
	//Administrator getWorkArrange(WorkArrange workArrange);
	//void updateWorkArrange(WorkArrange workArrange);
	void deleteOnlineOrder(OnlineOrder workArrange);
	List<OnlineOrder> getOnlineOrders(OnlineOrder workArrange);
	//OnlineOrder getTheLastOne();
}
