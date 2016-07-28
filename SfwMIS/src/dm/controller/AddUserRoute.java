package dm.controller;

import java.io.IOException;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.dv.xs.TimeDV;

import dm.model.UserRoute;
import dm.model.WebWebService1;

/**
 * Servlet implementation class AddSeller
 */
@WebServlet("/AddUserRoute")
public class AddUserRoute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserRoute() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String a=request.getParameter("userNO");
		String b=request.getParameter("routeNO");
	//	String c=request.getParameter("state");	
		//String Createtime=request.getParameter("");
		//CategoryDal category=new CategoryDal();
		WebWebService1 userService = (WebWebService1) getServletContext()
                .getAttribute("userService");
		UserRoute manage=new UserRoute();
        manage.setUserNO(a); 
        manage.setRouteNO(b);
     //   manage.setRouteNO(c); 
   //     manage.setStarttime(d);
        userService.addUserRoute(manage);
     //   List<UserRoute> manages = userService.getUserRoutes(manage);
      //  request.setAttribute("blahs", manages);
     //   request.getRequestDispatcher("admin/usermanagement.jsp").forward(request, response);
        response.sendRedirect("admin/Apages/routemanagement.jsp");
        
	}

	

}
