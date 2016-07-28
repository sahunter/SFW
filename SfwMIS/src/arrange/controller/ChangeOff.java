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
@WebServlet("/ChangeOff")
public class ChangeOff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeOff() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		 
		 //response.sendRedirect("pages/index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String username="Àî½ø";
		String emailwho="3";
		
		//String username = (String) request.getSession().getAttribute("login");
		//WebService userService = (WebService) getServletContext().getAttribute("userService");
		 WorkService workService = (WorkService) getServletContext().getAttribute("workService");
		 WorkChange blah = new WorkChange();
		 //String uname=request.getParameter("late");
		 String thedate=request.getParameter("olddate");
		 String thetime=request.getParameter("oldtime");
		 String reason=request.getParameter("newsection");
		 blah.setUserName(username);
		 blah.setDate(thedate);
		 blah.setTime(thetime);
		 blah.setChangeOff(reason);
		 workService.addWorkChange(blah);
		 
		 if(workService.isChangeOffApplyOK(blah)){
			 username= java.net.URLEncoder.encode(username,"UTF-8"); 
			 reason= java.net.URLEncoder.encode(reason,"UTF-8"); 
			 	response.sendRedirect("EmailThe"+"?emailwho="+emailwho+ "&username=" +username+ "&thedate=" +thedate+ "&thetime=" +thetime+ "&reason=" +reason);
		 }
	}

}
