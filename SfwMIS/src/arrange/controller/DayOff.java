package arrange.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet("/DayOff")
public class DayOff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DayOff() {
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
		String username="–Ï’Ò";
		String emailwho="2";
		//PrintWriter out=response.getWriter();
		//String username = (String) request.getSession().getAttribute("login");
		//WebService userService = (WebService) getServletContext().getAttribute("userService");
		 WorkService workService = (WorkService) getServletContext().getAttribute("workService");
		 WorkChange blah = new WorkChange();
		 //String uname=request.getParameter("late");
		 String thedate=request.getParameter("thedate");
		 String thetime=request.getParameter("thetime");
		 String reason=request.getParameter("reason");
		 blah.setUserName(username);
		 blah.setDate(thedate);
		 blah.setTime(thetime);
		 blah.setDayOff(reason);
		 workService.addWorkChange(blah);
		 
		 if(workService.isDayOffApplyOK(blah)){
			 /*request.setAttribute("emailwho", emailwho);
			 request.setAttribute("username", username);
			 request.setAttribute("thedate", thedate);
			 request.setAttribute("thetime", thetime);
			 request.setAttribute("reason", reason);
		        request.getRequestDispatcher("EmailThe").forward(request, response);*/
			 username= java.net.URLEncoder.encode(username,"UTF-8"); 
			 reason= java.net.URLEncoder.encode(reason,"UTF-8"); 
			 	response.sendRedirect("EmailThe"+"?emailwho="+emailwho+ "&username=" +username+ "&thedate=" +thedate+ "&thetime=" +thetime+ "&reason=" +reason);
			}
			
			
		 //response.sendRedirect("pages/index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
