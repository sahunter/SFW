package hrm.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hrm.model.Authority;
import  hrm.model.Role;
import hrm.model.RoleAuthority;
import hrm.model.WebService;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/UpdateAuthority")
public class UpdateAuthority extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAuthority() {
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
		String[] a=request.getParameterValues("authorityNO");
		String[] b=request.getParameterValues("authorityName");
		String[] c=request.getParameterValues("authorityDescription");
		java.util.Date dt=new  	java.util.Date();
		java.text.SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		String  currentTime=sdf.format(dt);
		//CategoryDal category=new CategoryDal();
		WebService userService = (WebService) getServletContext()
                .getAttribute("userService");
        for(int i=0;i<a.length;i++){
        	
    			 if(s[0].equals(a[i])){
		Authority manage=new Authority();
        manage.setAuthorityName(b[i]);
        manage.setAuthorityDescription(c[i]);
        manage.setCreatetime(currentTime);
        manage.setAuthorityNO(a[i]);
        
        
        userService.updateAuthority(manage); 
        //response.sendRedirect("admin/Apages/authoritymanagement.jsp");
        }
        //List<Authority> manages = userService.getAuthoritys(manage);
       // request.setAttribute("blahs", manages);
       
	}   response.sendRedirect("admin/pages/authoritymanagement.jsp");
	}
}
