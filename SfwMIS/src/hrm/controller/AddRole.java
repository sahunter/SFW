package hrm.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hrm.model.Role;
import hrm.model.WebService;

/**
 * Servlet implementation class AddSeller
 */
@WebServlet("/AddRole")
public class AddRole extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRole() {
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
		WebService userService = (WebService) getServletContext()
                .getAttribute("userService");
        
		Role manage=new Role();
        manage.setRoleNO(a); 
        manage.setRoleName(b);
        manage.setCreatetime(currentTime);
        manage.setRoleDescription(c);
        userService.addRole(manage);
        //List<Role> manages = userService.getRoles(manage);
        //request.setAttribute("blahs", manages);
        response.sendRedirect("admin/pages/rolemanagement.jsp");
       // request.getRequestDispatcher("admin/Apages/rolemanagement.jsp").forward(request, response);
	}

}
