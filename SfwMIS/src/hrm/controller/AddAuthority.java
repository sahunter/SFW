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
import hrm.model.WebService;

/**
 * Servlet implementation class AddSeller
 */
@WebServlet("/AddAuthority")
public class AddAuthority extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAuthority() {
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
		WebService userService = (WebService) getServletContext().getAttribute("userService");
		Authority manage=new Authority();
        manage.setAuthorityNO(a);
        manage.setAuthorityName(b);
        manage.setAuthorityDescription(c);
        
        manage.setCreatetime(currentTime);
        userService.addAuthority(manage);
        
        //List<Authority> manages = userService.getAuthoritys(manage);
        //request.setAttribute("blahs", manages);
        response.sendRedirect("admin/pages/authoritymanagement.jsp");
        //request.getRequestDispatcher("admin/Apages/authoritymanagement.jsp").forward(request, response);
	}

}
