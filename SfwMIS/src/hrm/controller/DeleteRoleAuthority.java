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
@WebServlet("/DeleteRoleAuthority")
public class DeleteRoleAuthority extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRoleAuthority() {
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
		//String[] a=request.getParameterValues("Id1");
		
		//CategoryDal category=new CategoryDal();
        WebService userService = (WebService) getServletContext()
                .getAttribute("userService");
       
	RoleAuthority manage=new RoleAuthority(); 	
	 			
	 	        manage.setId(Integer.valueOf(s[0]));
	 	       userService.deleteRoleAuthority(manage);
	 	      //request.getRequestDispatcher("Admin/Apages/authoritymanagement.jsp").forward(request, response);
	 		 response.sendRedirect("admin/pages/authoritymanagement.jsp");
	 		 }
	 		
        
       
       // request.getRequestDispatcher("admin/Apages/authoritymanagement.jsp").forward(request, response);
	

}
