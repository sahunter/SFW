package hrm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import  hrm.model.Authority;
import hrm.model.RoleAuthority;
import hrm.model.UserAuthority;

import hrm.model.WebService;

/**
 * Servlet implementation class DeleteSeller
 */
@WebServlet("/DeleteAuthority")
public class DeleteAuthority extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAuthority() {
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
		//String[] a=request.getParameterValues("authorityNO");
        
		//CategoryDal category=new CategoryDal();
        WebService userService = (WebService) getServletContext()
                .getAttribute("userService");
      //  for(int i=0;i<a.length;i++){
			// if(s[i].equals(a[i])){
	 			Authority   manage=new Authority();
	 			//UserAuthority  manage1=new UserAuthority();
	 		//	RoleAuthority  manage2=new RoleAuthority();
	 			
	 			manage.setAuthorityNO(s[0]);
	 	   //    manage1.setAuthorityNO(a[i]);
	 	   //   manage2.setAuthorityNO(a[i]);
	 	        userService.deleteAuthority(manage);
	 	//       userService.deleteUserAuthority(manage1);
	 	 //     userService.deleteRoleAuthority(manage2);
	 	   //  response.sendRedirect("admin/Apages/authoritymanagement.jsp");
	 	       response.sendRedirect("admin/pages/authoritymanagement.jsp");
	
	}
       // response.sendRedirect("admin/Apages/authoritymanagement.jsp");
	 		}
	 		
        
	


