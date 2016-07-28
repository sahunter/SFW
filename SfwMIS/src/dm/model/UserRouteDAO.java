package dm.model;

import java.util.List;

import dm.model.UserRoute;


public interface UserRouteDAO {
	void addUserRoute(UserRoute userroute);
	UserRoute getUserRoute(UserRoute userroute);
	void updateUserRoute(UserRoute userroute);
	void deleteUserRoute(UserRoute userroute);
	List<UserRoute> getUserRoutes(UserRoute userroute);

}