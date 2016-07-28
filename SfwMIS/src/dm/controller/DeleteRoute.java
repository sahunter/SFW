package dm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dm.model.Route;
import dm.model.UserRoute;

import dm.model.WebWebService1;

/**
 * Servlet implementation class DeleteSeller
 */
@WebServlet("/DeleteRoute")
public class DeleteRoute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRoute() {
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
		//String[] a=request.getParameterValues("Id");
		//CategoryDal category=new CategoryDal();
        WebWebService1 userService1 = (WebWebService1) getServletContext()
                .getAttribute("userService1");
      //  for (int i = 0; i < a.length; i++) { 
     //   	 if(s[i].equals(a[i])){
	 			Route   manage=new Route();
	 	        manage.setId(Integer.valueOf(s[0]));
	 	        userService1.deleteRoute(manage);	
	 	     // request.getRequestDispatcher("admin/Apages/usermanagement.jsp").forward(request, response);
	 	        
	 		
        //request.getRequestDispatcher("").forward(request, response);
        response.sendRedirect("admin/pages/routemanagement.jsp");
      //  request.getRequestDispatcher("admin/Apages/usermanagement.jsp").forward(request, response);
	}

}
