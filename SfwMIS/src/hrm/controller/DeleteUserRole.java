package hrm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hrm.model.RoleAuthority;
import  hrm.model.User;
import hrm.model.UserRole;
import hrm.model.WebService;

/**
 * Servlet implementation class DeleteSeller
 */
@WebServlet("/DeleteUserRole")
public class DeleteUserRole extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUserRole() {
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
        WebService userService = (WebService) getServletContext()
                .getAttribute("userService");
      //  for (int i = 0; i < a.length; i++) { 
     //   	 if(s[i].equals(a[i])){
	 			UserRole   manage=new UserRole();
	 	        manage.setId(Integer.valueOf(s[0]));
	            userService.deleteUserRole(manage);	
	 	     // request.getRequestDispatcher("admin/Apages/usermanagement.jsp").forward(request, response);
	 	        
	 		
        //request.getRequestDispatcher("").forward(request, response);
        response.sendRedirect("admin/pages/usermanagement.jsp");
      //  request.getRequestDispatcher("admin/Apages/usermanagement.jsp").forward(request, response);
	}

}
