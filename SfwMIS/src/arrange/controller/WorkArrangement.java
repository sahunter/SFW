package arrange.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import arrange.model.WorkArrange;
import arrange.model.WorkService;

/**
 * Servlet implementation class WorkArrange
 */
@WebServlet("/WorkArrangement")
public class WorkArrangement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorkArrangement() {
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
		 //String page=null;
		 String mm[]=new String[13];
		 String tm[]=new String[13];
		 String wm[]=new String[13];
		 String thm[]=new String[13];
		 String fm[]=new String[13];
		 String sam[]=new String[13];
		 String sum[]=new String[13];
		 String ma[]=new String[13];
		 String ta[]=new String[13];
		 String wa[]=new String[13];
		 String tha[]=new String[13];
		 String fa[]=new String[13];
		 String saa[]=new String[13];
		 String sua[]=new String[13];
		 
		 
		   mm[1] = request.getParameter("MM1"); 
		   tm[1] = request.getParameter("TM1");
	         wm[1]=request.getParameter("WM1");
	         thm[1] = request.getParameter("THM1"); 
			   fm[1] = request.getParameter("FM1");
		         sam[1]=request.getParameter("SAM1");
		         sum[1] = request.getParameter("SUM1"); 
		         ma[1] = request.getParameter("MA1");
				  ta[1] = request.getParameter("TA1");
			         wa[1]=request.getParameter("WA1");
			         tha[1] = request.getParameter("THA1"); 
					   fa[1] = request.getParameter("FA1");
				         saa[1]=request.getParameter("SAA1");
				         sua[1] = request.getParameter("SUA1"); 
	 mm[2] = request.getParameter("MM2"); 
						  tm[2] = request.getParameter("TM2");
					         wm[2]=request.getParameter("WM2");
					         thm[2] = request.getParameter("THM2"); 
							   fm[2] = request.getParameter("FM2");
						         sam[2]=request.getParameter("SAM2");
						         sum[2] = request.getParameter("SUM2"); 
						         ma[2]= request.getParameter("MA2");
								  ta[2] = request.getParameter("TA2");
							        wa[2]=request.getParameter("WA2");
							         tha[2] = request.getParameter("THA2"); 
									  fa[2] = request.getParameter("FA2");
								         saa[2]=request.getParameter("SAA2");
								         sua[2] = request.getParameter("SUA2");
			 mm[3] = request.getParameter("MM3"); 
										  tm[3] = request.getParameter("TM3");
									         wm[3]=request.getParameter("WM3");
									         thm[3] = request.getParameter("THM3"); 
											   fm[3] = request.getParameter("FM3");
										         sam[3]=request.getParameter("SAM3");
										         sum[3] = request.getParameter("SUM3"); 
										         ma[3 ]= request.getParameter("MA3");
												  ta[3] = request.getParameter("TA3");
											        wa[3]=request.getParameter("WA3");
											         tha[3 ]= request.getParameter("THA3"); 
													   fa[3] = request.getParameter("FA3");
												         saa[3]=request.getParameter("SAA3");
												         sua[3 ]= request.getParameter("SUA3");
					 mm[4] = request.getParameter("MM4"); 
														  tm[4 ]= request.getParameter("TM4");
													         wm[4]=request.getParameter("WM4");
													         thm[4 ]= request.getParameter("THM4"); 
															   fm[4] = request.getParameter("FM4");
														         sam[4]=request.getParameter("SAM4");
														         sum[4] = request.getParameter("SUM4"); 
														         ma[4] = request.getParameter("MA4");
																   ta[4] = request.getParameter("TA4");
															         wa[4]=request.getParameter("WA4");
															         tha[4] = request.getParameter("THA4"); 
																	   fa[4] = request.getParameter("FA4");
																         saa[4]=request.getParameter("SAA4");
																        sua[4] = request.getParameter("SUA4");
										 mm[5] = request.getParameter("MM5"); 
																		   tm[5 ]= request.getParameter("TM5");
																	         wm[5]=request.getParameter("WM5");
																	         thm[5] = request.getParameter("THM5"); 
																			   fm[5] = request.getParameter("FM5");
																		         sam[5]=request.getParameter("SAM5");
																		         sum[5] = request.getParameter("SUM5"); 
																		        ma[5] = request.getParameter("MA5");
																				   ta[5] = request.getParameter("TA5");
																			        wa[5]=request.getParameter("WA5");
																			         tha[5] = request.getParameter("THA5"); 
																					  fa[5] = request.getParameter("FA5");
																				         saa[5]=request.getParameter("SAA5");
																				         sua[5] = request.getParameter("SUA5");
														 mm[6] = request.getParameter("MM6"); 
																						  tm[6] = request.getParameter("TM6");
																					         wm[6]=request.getParameter("WM6");
																					        thm[6] = request.getParameter("THM6"); 
																							   fm[6] = request.getParameter("FM6");
																						        sam[6]=request.getParameter("SAM6");
																						         sum[6] = request.getParameter("SUM6"); 
																						        ma[6] = request.getParameter("MA6");
																								   ta[6] = request.getParameter("TA6");
																							         wa[6]=request.getParameter("WA6");
																							         tha[6] = request.getParameter("THA6"); 
																									   fa[6 ]= request.getParameter("FA6");
																								         saa[6]=request.getParameter("SAA6");
																								         sua[6] = request.getParameter("SUA6");
																		 mm[7] = request.getParameter("MM7"); 
																										   tm[7] = request.getParameter("TM7");
																									         wm[7]=request.getParameter("WM7");
																									         thm[7] = request.getParameter("THM7"); 
																											   fm[7] = request.getParameter("FM7");
																										         sam[7]=request.getParameter("SAM7");
																										         sum[7] = request.getParameter("SUM7"); 
																										         ma[7] = request.getParameter("MA7");
																												   ta[7] = request.getParameter("TA7");
																											        wa[7]=request.getParameter("WA7");
																											         tha[7] = request.getParameter("THA7"); 
																													   fa[7 ]= request.getParameter("FA7");
																												         saa[7]=request.getParameter("SAA7");
																												         sua[7] = request.getParameter("SUA7");
																						 mm[8 ]= request.getParameter("MM8"); 
																														   tm[8] = request.getParameter("TM8");
																													         wm[8]=request.getParameter("WM8");
																													        thm[8] = request.getParameter("THM8"); 
																															  fm[8 ]= request.getParameter("FM8");
																														         sam[8]=request.getParameter("SAM8");
																														         sum[8] = request.getParameter("SUM8"); 
																														         ma[8] = request.getParameter("MA8");
																																   ta[8] = request.getParameter("TA8");
																															         wa[8]=request.getParameter("WA8");
																															         tha[8 ]= request.getParameter("THA8"); 
																																	   fa[8] = request.getParameter("FA8");
																																         saa[8]=request.getParameter("SAA8");
																																        sua[8] = request.getParameter("SUA8");
																									mm[9] = request.getParameter("MM9"); 
																																		   tm[9] = request.getParameter("TM9");
																																	         wm[9]=request.getParameter("WM9");
																																	         thm[9] = request.getParameter("THM9"); 
																																			  fm[9] = request.getParameter("FM9");
																																		         sam[9]=request.getParameter("SAM9");
																																		         sum[9] = request.getParameter("SUM9"); 
																																		         ma[9] = request.getParameter("MA9");
																																				   ta[9 ]= request.getParameter("TA9");
																																			         wa[9]=request.getParameter("WA9");
																																			         tha[9] = request.getParameter("THA9"); 
																																					  fa[9] = request.getParameter("FA9");
																																				         saa[9]=request.getParameter("SAA9");
																																				        sua[9] = request.getParameter("SUA9");
																													 mm[10] = request.getParameter("MM10"); 
																																						  tm[10] = request.getParameter("TM10");
																																					         wm[10]=request.getParameter("WM10");
																																					         thm[10] = request.getParameter("THM10"); 
																																							   fm[10 ]= request.getParameter("FM10");
																																						         sam[10]=request.getParameter("SAM10");
																																						         sum[10] = request.getParameter("SUM10"); 
																																						         ma[10] = request.getParameter("MA10");
																																								   ta[10] = request.getParameter("TA10");
																																							         wa[10]=request.getParameter("WA10");
																																							         tha[10] = request.getParameter("THA10"); 
																																									  fa[10] = request.getParameter("FA10");
																																								        saa[10]=request.getParameter("SAA10");
																																								        sua[10] = request.getParameter("SUA10");
																																		 mm[11] = request.getParameter("MM11"); 
																																										   tm[11] = request.getParameter("TM11");
																																									         wm[11]=request.getParameter("WM11");
																																									       thm[11 ]= request.getParameter("THM11"); 
																																											   fm[11] = request.getParameter("FM11");
																																										        sam[11]=request.getParameter("SAM11");
																																										         sum[11] = request.getParameter("SUM11"); 
																																										         ma[11 ]= request.getParameter("MA11");
																																												  ta[11 ]= request.getParameter("TA11");
																																											         wa[11]=request.getParameter("WA11");
																																											         tha[11 ]= request.getParameter("THA1"); 
																																													   fa[11] = request.getParameter("FA11");
																																												         saa[11]=request.getParameter("SAA11");
																																												         sua[11] = request.getParameter("SUA11");
																																						 mm[12] = request.getParameter("MM12"); 
																																														   tm[12] = request.getParameter("TM12");
																																													        wm[12]=request.getParameter("WM12");
																																													         thm[12 ]= request.getParameter("THM12"); 
																																															   fm[12] = request.getParameter("FM12");
																																														         sam[12]=request.getParameter("SAM12");
																																														         sum[12] = request.getParameter("SUM12"); 
																																														         ma[12] = request.getParameter("MA12");
																																																  ta[12] = request.getParameter("TA12");
																																															         wa[12]=request.getParameter("WA12");
																																															        tha[12] = request.getParameter("THA12"); 
																																																	   fa[12] = request.getParameter("FA12");
																																																         saa[12]=request.getParameter("SAA12");
																																																        sua[12] = request.getParameter("SUA12");
				 String emailwho="1";		
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");	        
	        Date all=new Date();
	      String aaaaa=sdf.format(all);
	        WorkArrange workarrange=null;
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(mm[i]);
	        	workarrange.setWorkTime("周一");
	        	workarrange.setShift("中班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(tm[i]);
	        	workarrange.setWorkTime("周二");
	        		workarrange.setShift("中班");
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(wm[i]);
	        	workarrange.setWorkTime("周三");
	        	workarrange.setShift("中班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(thm[i]);
	        	workarrange.setWorkTime("周四");
	        	workarrange.setShift("中班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(fm[i]);
	        	workarrange.setWorkTime("周五");
	        	workarrange.setShift("中班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(sam[i]);
	        	workarrange.setWorkTime("周六");
	        	workarrange.setShift("中班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(sum[i]);
	        	workarrange.setWorkTime("周日");
	        	workarrange.setShift("中班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        /////
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(ma[i]);
	        	workarrange.setWorkTime("周一");
	        	workarrange.setShift("晚班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(ta[i]);
	        	workarrange.setWorkTime("周二");
	        		workarrange.setShift("晚班");
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(wa[i]);
	        	workarrange.setWorkTime("周三");
	        	workarrange.setShift("晚班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(tha[i]);
	        	workarrange.setWorkTime("周四");
	        	workarrange.setShift("晚班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(fa[i]);
	        	workarrange.setWorkTime("周五");
	        	workarrange.setShift("晚班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(saa[i]);
	        	workarrange.setWorkTime("周六");
	        	workarrange.setShift("晚班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        for(int i=1;i<=12;i++){
	        	
	        	workarrange=new WorkArrange();
	        	workarrange.setDate(aaaaa);
	        	workarrange.setUserName(sua[i]);
	        	workarrange.setWorkTime("周日");
	        	workarrange.setShift("晚班");
	        	
	        	workService.addWorkArrange(workarrange);
	        }
	        
	        response.sendRedirect("EmailThe"+"?emailwho="+emailwho);
	       
	        /*goods.setGoodsName(goodsname);
	        goods.setSeller(seller);
	        Goods goods1=new Goods();
	        goods1=userService.getGoods(goods);
	       Shoppingcart  blah = new Shoppingcart();
	        blah.setName(username);          //String.IsNullOrEmpty(Context.request.Form["btnSave"]) == false
	        blah.setGoodsName(goods1.getGoodsname()); 
	        blah.setPicture(goods1.getPicture());
	    	  blah.setPrice(goods1.getPrice());
	    	  blah.setIntroduction(goods1.getIntroduction());
	    	  blah.setQuantity(quantity);
	    	  blah.setTprice();
	    	  blah.setSeller(goods1.getSeller());*/
	   
	    	 /*if(userService.addShoppingcart(blah)==1){
	    		 out.print(1);
	    	 }else{
	    		 out.print(0);
	    	 }*/

   					//???????????????
	    	  //request.getRequestDispatcher(page).forward(request, response);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
