package hrm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import  hrm.model.User;

import hrm.model.WebService;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/ModifyInformation")
public class ModifyInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyInformation() {
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
		
		String g=request.getParameter("userNO");
		String a=request.getParameter("username");
		String b=request.getParameter("password");
		String c=request.getParameter("phone");
		
		String d=request.getParameter("mail");
		String e=request.getParameter("hobbies");
		String f=request.getParameter("sparetime");
		
		//CategoryDal category=new CategoryDal();
		WebService userService = (WebService) getServletContext()
                .getAttribute("userService");
        
		User manage=new User();
        manage.setUsername(a);
        manage.setPassword(b);
        manage.setPhone(c);
        manage.setMail(d);
        
        manage.setHobbies(e);
       
        manage.setSparetime(f);
        manage.setUserNO(g);
        userService.updateUser(manage);
       // List<User> manages = userService.getUsers(manage);
        //request.setAttribute("blahs", manages);
        //request.getRequestDispatcher("admin/pages/userinformation.jsp").forward(request, response);
        response.sendRedirect("admin/pages/userinformation.jsp");
	}

}
