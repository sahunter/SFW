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
 * Servlet implementation class UpdateWorkOverTime
 */
@WebServlet("/UpdateWorkOverTime")
public class UpdateWorkOverTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateWorkOverTime() {
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
		//String username = (String) request.getSession().getAttribute("login");
		//WebService userService = (WebService) getServletContext().getAttribute("userService");
		 WorkService workService = (WorkService) getServletContext().getAttribute("workService");
		 WorkChange blah = new WorkChange();
		 String uname=request.getParameter("worktime");
		 String thedate=request.getParameter("thedate");
		 String thetime=request.getParameter("thetime");
		 String thesection=request.getParameter("thesection");
		 blah.setUserName(uname);
		 blah.setDate(thedate);
		 blah.setTime(thetime);
		 blah.setWorkOverTime(thesection);
		 workService.updateWorkOverTime(blah);
		 response.sendRedirect("pages/UpdateWorkOverTime.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
