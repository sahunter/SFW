package arrange.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import arrange.model.TheDateOfWages;
import arrange.model.WorkChange;
import arrange.model.WorkService;
import wm.model.WageService;
import wm.model.Wages;

/**
 * Servlet implementation class UpdateWorkOverTime
 */
@WebServlet("/UpdateBeingLate")
public class UpdateBeingLate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBeingLate() {
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
		 String uname=request.getParameter("UPthename");
		 if(uname.equals("ÐÞ¸Ä")){
			 String uname11=request.getParameter("late");
			 String thedate11=request.getParameter("thedate");
			 String thetime11=request.getParameter("thetime");
			 String reason11=request.getParameter("reason");
			 blah.setUserName(uname11);
			 blah.setDate(thedate11);
			 blah.setTime(thetime11);
			 blah.setBeingLate(reason11);
			 workService.updateBeingLate(blah);     //
			 
			 WageService wageS = (WageService) getServletContext().getAttribute("wagekService");
			 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");	        
	        Date all=new Date();
	      String aaaaa=sdf.format(all);
			 Wages wage;
			 //TheDateOfWages.wagesDate=wageS.getTheLastWageDate();
			 if(TheDateOfWages.wagesDate.equals(aaaaa)){
				 wage=new Wages();
				 wage.setDate(aaaaa);
				 wage.setUserName(uname);
				 wage=wageS.getWageForChange(wage);
				 wage.setIntegral(1.3);
				 wage.setLate(1);
			 }else{
				 
				 TheDateOfWages.wagesDate=aaaaa;
			 }
			 
		 }else{
			 int Id=Integer.valueOf(request.getParameter("theId"));
			 
			 String thedate=request.getParameter("UPthedate");
			 String thetime=request.getParameter("UPthetime");
			 String reason=request.getParameter("UPreason");
			 blah.setId(Id);
			 blah.setUserName(uname);
			 blah.setDate(thedate);
			 blah.setTime(thetime);
			 blah.setBeingLate(reason);
			 workService.updateRealBeingLate(blah);
		 }
		 
		 response.sendRedirect("pages/UpdateBeingLate.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
