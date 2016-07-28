package hrm.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hrm.model.UserRole;
import hrm.model.WebService;

/**
 * Servlet implementation class AddSeller
 */
@WebServlet("/AddUserRole")
public class AddUserRole extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserRole() {
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
        String[] aa=request.getParameterValues("add1");
		
		String a=aa[0];
		String b=aa[1];
		
		java.util.Date dt=new  	java.util.Date();
		java.text.SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		String  currentTime=sdf.format(dt);
		
		//CategoryDal category=new CategoryDal();
		WebService userService = (WebService) getServletContext()
                .getAttribute("userService");
        
		UserRole manage=new UserRole();
        manage.setUserNO(a);
       
        manage.setRoleNO(b);
    /*   if(aa.length==3){
    	   manage.setState(aa[2]);
    	     
       }*/
          manage.setCreatetime(currentTime);
        userService.addUserRole(manage);
        
        response.sendRedirect("admin/pages/usermanagement.jsp");
        //List<UserRole> manages = userService.getUserRoles(manage);
        //request.setAttribute("blahs", manages);
       // request.getRequestDispatcher("admin/Apages/usermanagement.jsp").forward(request, response);
	}

}
