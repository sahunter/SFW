package hrm.controller;
import java.text.SimpleDateFormat; 
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import hrm.model.User;
import hrm.model.Role;
import hrm.model.RoleAuthority;
import hrm.model.WebService;
/**
 * Servlet implementation class AddSeller
 */
@WebServlet("/AddRoleAuthority")
public class AddRoleAuthority extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRoleAuthority() {
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
        String[] aa=request.getParameterValues("add");
		String a=aa[0];
		String b=aa[1];
		String c=aa[2];
	
		java.util.Date dt=new  	java.util.Date();
		java.text.SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		String  currentTime=sdf.format(dt);
		
		
		//CategoryDal category=new CategoryDal();
		WebService userService = (WebService) getServletContext().getAttribute("userService");
		RoleAuthority  manage=new RoleAuthority();
        manage.setRoleNO(a);
        manage.setAuthorityNO(b);
      
        manage.setKind(c);
      //  if(aa.length==4){
    //    String d=aa[3];
  //      manage.setState(d);
  //      }
        manage.setCreatetime(currentTime);
        userService.addRoleAuthority(manage);
       // List<RoleAuthority> manages = userService.getRoleAuthoritys(manage);
       // request.setAttribute("blahs", manages);
        response.sendRedirect("admin/pages/authoritymanagement.jsp");
	}

}
