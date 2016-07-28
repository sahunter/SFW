package onlineOrder.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import arrange.model.WorkService;
import onlineOrder.model.OnlineOrder;

/**
 * Servlet implementation class AddOnlineOrder
 */
@WebServlet("/AddOnlineOrder")
public class AddOnlineOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOnlineOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*Random ra =new Random();
		for (int i=0;i<30;i++)
			{
			System.out.println(ra.nextInt(10)+1);
			}*/
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		WorkService workService = (WorkService) getServletContext().getAttribute("workService");
		PrintWriter out=response.getWriter();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");	        
        
		OnlineOrder kkkk=new OnlineOrder();
		
		for(int i = 0; i < 20; i++){
			
			String customername="";
			String domitary="";
			String RoomNO="";
			
			Date all=new Date();
			String ordertime=sdf.format(all);
		
			Random cname =new Random();
			Random qu =new Random();
			Random floor =new Random();
			Random oneorzero =new Random();
			Random third =new Random();
			Random fourth =new Random();
			
			int w1=cname.nextInt(4)+1;
			int w2=qu.nextInt(2)+1;
			int w3=floor.nextInt(7)+1;
			int w4=oneorzero.nextInt(1);
			int w5=third.nextInt(9)+1;
			int w6=fourth.nextInt(2)+1;
			
			switch(w1){
 			case 1:
 				customername=customername+"张";
 				break;
 			case 2:
 				customername=customername+"李";
 				break;
 			case 3:
 				customername=customername+"杨";
 				break;
 			case 4:
 				customername=customername+"洪";
 				break;
			}
			
			switch(w3){
 			case 1:
 				customername=customername+"稳";
 				domitary="竹一";
 				break;
 			case 2:
 				customername=customername+"袁";
 				domitary="竹一";
 				break;
 			case 3:
 				customername=customername+"真";
 				domitary="竹一";
 				break;
 			case 4:
 				customername=customername+"青";
 				domitary="竹二";
 				break;
 			case 5:
 				customername=customername+"鑫";
 				domitary="竹二";
 				break;
 			case 6:
 				customername=customername+"单";
 				domitary="竹二";
 				break;
 			case 7:
 				customername=customername+"伟";
 				domitary="竹二";
 				break;
			}
			
			switch(w5){
 			case 1:
 				customername=customername+"元";
 				domitary="竹三";
 				break;
 			case 2:
 				customername=customername+"远";
 				domitary="竹三";
 				break;
 			case 3:
 				customername=customername+"琼";
 				domitary="竹三";
 				break;
 			case 4:
 				customername=customername+"琬";
 				domitary="竹三";
 				break;
 			case 5:
 				customername=customername+"信";
 				domitary="竹四";
 				break;
 			case 6:
 				customername=customername+"荣";
 				domitary="竹四";
 				break;
 			case 7:
 				customername=customername+"檀";
 				domitary="竹四";
 				break;
 			
			}
			
			if(w2==1){
				RoomNO=RoomNO+"A";
			}

			if(w2==2){
				RoomNO=RoomNO+"B";
			}

			RoomNO=RoomNO+w3+w4+w5+w6;
			
			
			 kkkk.setCustomername(customername);
			 kkkk.setDomitory(domitary);
			 kkkk.setOrdertime(ordertime);
			 kkkk.setRoomNO(RoomNO);
			 workService.addOnlineOrder(kkkk);
			 
			 try {
			 Thread.sleep(5000);//睡眠1秒。循环300次就是300秒也就是五分钟
			System.out.println(i);
			 } catch (InterruptedException e) {
			 e.printStackTrace();
			 }
			 }
		out.print(1);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
