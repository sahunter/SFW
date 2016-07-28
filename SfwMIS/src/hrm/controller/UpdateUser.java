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
@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUser() {
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
		String[] a=request.getParameterValues("userNO");
		String[] b=request.getParameterValues("username");
		String[] c=request.getParameterValues("password");
		String[] d=request.getParameterValues("position");
		String[] e=request.getParameterValues("state");
		
		java.util.Date dt=new  	java.util.Date();
		java.text.SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		String  currentTime=sdf.format(dt);
		//CategoryDal category=new CategoryDal();
		WebService userService = (WebService) getServletContext()
                .getAttribute("userService");
		
        for(int i=0;i<a.length;i++){
        	 if(s[0].equals(a[i])){
		User manage=new User();
        manage.setUserNO(a[i]);
        manage.setUsername(b[i]);
        manage.setPassword(c[i]);
        manage.setPosition(d[i]);
        manage.setState(e[i]);
        userService.updateUser(manage);
        
        
        //request.getRequestDispatcher("admin/Apages/usermanagement.jsp").forward(request, response);
	}

	}
        response.sendRedirect("admin/pages/usermanagement.jsp");
        //request.getRequestDispatcher("admin/Apages/usermanagement.jsp").forward(request, response);
}}
