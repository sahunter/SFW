package hrm.controller;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import  hrm.model.User;
import hrm.model.UserAuthority;

import hrm.model.WebService;
/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/UpdateUserAuthority")
public class UpdateUserAuthority extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserAuthority() {
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
		String[] a=request.getParameterValues("Id");
		String[] b=request.getParameterValues("userNO");
		String[] c=request.getParameterValues("authorityNO");
		String[] d=request.getParameterValues("kind");
	//	String[] e=request.getParameterValues("checkbox");

		java.util.Date dt=new  	java.util.Date();
		java.text.SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		String  currentTime=sdf.format(dt);
		//CategoryDal category=new CategoryDal();
		WebService userService = (WebService) getServletContext()
                .getAttribute("userService");
		 for(int i=0;i<a.length;i++){
			 if(s[0].equals(a[i])){
		UserAuthority manage=new UserAuthority();
		manage.setUserNO(b[i]);
        manage.setAuthorityNO(c[i]);
        manage.setKind(d[i]);
//        manage.setState(e[i]);
        manage.setCreatetime(currentTime);
        manage.setId(Integer.valueOf(s[0]));  
        
        userService.updateUserAuthority(manage);
       // List<UserAuthority> manages = userService.getUserAuthoritys(manage);
        //request.setAttribute("blahs", manages);
       // request.getRequestDispatcher("admin/Apages/authoritymanagement.jsp").forward(request, response);
	}

}   response.sendRedirect("admin/pages/authoritymanagement.jsp");
		 
		 // request.getRequestDispatcher("admin/Apages/authoritymanagement.jsp").forward(request, response);
		 }}
