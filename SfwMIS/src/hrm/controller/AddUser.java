package hrm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hrm.model.User;
import hrm.model.UserRole;
import hrm.model.WebService;

/**
 * Servlet implementation class AddSeller
 */
@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
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
		String d=aa[3];
		String e=aa[4];
		
		
		
		//CategoryDal category=new CategoryDal();
		WebService userService = (WebService) getServletContext()
                .getAttribute("userService");
        
		User manage=new User();
		//UserRole manage1=new  UserRole();
	        
		
        manage.setUserNO(a);
        manage.setUsername(b);
        manage.setPassword(c);
        manage.setPosition(d);
        manage.setState(e);
     //   manage1.setUserNO(a);
        
        userService.addUser(manage);
        
     //   userService.addUserRole(manage1);
        
        response.sendRedirect("admin/pages/usermanagement.jsp");
        //request.getRequestDispatcher("admin/Apages/usermanagement.jsp").forward(request, response);
	}

}
