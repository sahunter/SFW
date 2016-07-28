package dm.controller;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dm.model.UserRoute;


import dm.model.WebWebService1;
/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/UpdateUserRoute")
public class UpdateUserRoute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserRoute() {
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
		String[] s=request.getParameterValues("check");
		String[] a=request.getParameterValues("Id");
		
		String[] b=request.getParameterValues("userNO");
		
		String[] c=request.getParameterValues("routeNO");
	//    String createtime=request.getParameter("createtime");
	 //   String d=request.getParameter("checkbox");
	   
		//Date c = new Date( createtime);
		
		
		//CategoryDal category=new CategoryDal();
		WebWebService1 userService = (WebWebService1) getServletContext()
                .getAttribute("userService");
		for(int i=0;i<a.length;i++){
			 if(s[0].equals(a[i])){
		UserRoute manage=new UserRoute();
		manage.setUserNO(b[i]);
        manage.setRouteNO(c[i]);
      
   //     manage.setState(d);
        userService.updateUserRoute(manage);
       // List<UserRole> manages = userService.getUserRoles(manage);
       // request.setAttribute("blahs", manages);
       // request.getRequestDispatcher("usermanagement.jsp").forward(request, response);
        
			 }
	}response.sendRedirect("admin/Apages/routemanagement.jsp");

		}}
