package arrange.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import arrange.model.WorkChange;
import arrange.model.WorkService;

/**
 * Servlet implementation class ChangeOff
 */
@WebServlet("/JoinPopularization")
public class JoinPopularization extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinPopularization() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//String username="9999";
		
		//PrintWriter out=response.getWriter();
		String username = (String) request.getSession().getAttribute("login");
		//WebService userService = (WebService) getServletContext().getAttribute("userService");
		 WorkService workService = (WorkService) getServletContext().getAttribute("workService");
		 WorkChange blah = new WorkChange();
		 //String uname=request.getParameter("late");
		 String theact=request.getParameter("activity");
		 String thedate=request.getParameter("thedate");
		 String thetime=request.getParameter("thetime");
		 int id=Integer.valueOf(request.getParameter("theId"));
		 blah.setUserName(username);
		 blah.setJoinPopularization(theact);
		 blah.setDate(thedate);
		 blah.setTime(thetime);
		 blah.setChangeNO(id);
		 workService.addWorkChange(blah);
		 response.sendRedirect("pages/index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
