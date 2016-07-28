package hrm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import hrm.model.User;

import hrm.model.WebService;

/**
 * Servlet implementation class SellerLogin
 */
@WebServlet( urlPatterns={"/login.do"},
initParams={
        @WebInitParam(name = "SUCCESS_VIEW", value = "admin/pages/index.jsp"),
        @WebInitParam(name = "ERROR_VIEW", value = "admin/pages/login.jsp")			//�ĸĸĸĸĸĸĸ�
    })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String SUCCESS_VIEW;
    private String ERROR_VIEW;     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
	    String username = request.getParameter("j_username");
	    String password = request.getParameter("j_password");
	    //int i=OnlineCounter.getCounter();
	    String page = null;
	    User user = new User();
	    user.setUsername(username);
	    user.setPassword(password);
        WebService userService = (WebService) getServletContext().getAttribute("userService");
	 
	     
	  
	     
	     
	      if(userService.checkLogin(user)){		//��������
	       String login1 = request.getParameter("login1");
	        if("auto".equals(login1)){
	        	
	        	Cookie namecookie=new Cookie("name",username);	
	        	
	        	//���ɴ���
	        	namecookie.setMaxAge(7*24*60*60);
	        	response.addCookie(namecookie);
	        	
	        	Cookie pswcookie=new Cookie("psw",password);			//���ɴ���
	        	pswcookie.setMaxAge(7*24*60*60);
	        	response.addCookie(pswcookie);
	        }
	        //request.setAttribute("counter", i);
	        
	        User blah  =  userService.getUser(user);
	        request.setAttribute("name", username); 
	        request.setAttribute("username", blah.getUsername());
	        request.setAttribute("userNO", blah.getUserNO());
	        request.setAttribute("password", blah.getPassword());
	        request.setAttribute("phone", blah.getPhone());
	        request.setAttribute("mail", blah.getMail()); 
	        request.setAttribute("hobbies", blah.getHobbies());
	        
	        request.setAttribute("position", blah.getPosition());
	        request.setAttribute("state", blah.getState()); 
	        request.setAttribute("sparetime", blah.getSparetime());
	        
	        //���ɴ�
	        request.getSession().setAttribute("login", username);
            request.getSession().setAttribute("userNO", blah.getUserNO());
            request.getSession().setAttribute("username", blah.getUsername());
	        request.getSession().setAttribute("password", blah.getPassword());
	        request.getSession().setAttribute("phone", blah.getPhone());
	        request.getSession().setAttribute("mail", blah.getMail());
	        request.getSession().setAttribute("hobbies", blah.getHobbies());
	        request.getSession().setAttribute("position", blah.getPosition());
	        request.getSession().setAttribute("state", blah.getState());
	        request.getSession().setAttribute("sparetime", blah.getSparetime());
	        page ="admin/pages/index.jsp";
	        }else{
	       	page = "admin/pages/login.jsp";
	        request.setAttribute("name", username);} 
	        response.sendRedirect(page);
	        //response.sendRedirect(page + "?login=" + username + "&name=" + username);
	    //request.getRequestDispatcher(page).forward(request, response);
	}

}
