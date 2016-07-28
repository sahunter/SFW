package dm.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import arrange.model.WorkService;
import dm.model.ArraySplit;
import dm.model.Redtype;
import dm.model.Route;
import dm.model.WebWebService1;
import onlineOrder.model.OnlineOrder;
import dm.controller.IIIId;
/**
 * Servlet implementation class AddSeller
 */
@WebServlet("/AddRoute")
public class AddRoute extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRoute() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @param out 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
	     //IIIId.aaas=0;
	     /*List<String> aa = new ArrayList<String>();
	     List<String> bb = new ArrayList<String>();
	     List<String> cc = new ArrayList<String>(); 
	     List<String> dd = new ArrayList<String>();
	     List<String> ee = new ArrayList<String>();*/
	     List<OnlineOrder> aaaA = new ArrayList<OnlineOrder>();
	     List<OnlineOrder> aaaB = new ArrayList<OnlineOrder>();
	     List<OnlineOrder> bbbA = new ArrayList<OnlineOrder>();
	     List<OnlineOrder> bbbB = new ArrayList<OnlineOrder>();
	     List<OnlineOrder> cccA = new ArrayList<OnlineOrder>(); 
	     List<OnlineOrder> cccB = new ArrayList<OnlineOrder>(); 
	     List<OnlineOrder> dddA = new ArrayList<OnlineOrder>();
	     List<OnlineOrder> dddB = new ArrayList<OnlineOrder>();
	    //String c=request.getParameter("state");
		//String Createtime=request.getParameter("");
		//CategoryDal category=new CategoryDal();
		WebWebService1 userService = (WebWebService1) getServletContext().getAttribute("userService1");	
		WorkService userService1 = (WorkService) getServletContext().getAttribute("workService");
		    Route blah=new Route();
			List<Route> blahs = userService.getRoutes(blah);
			List<OnlineOrder> neworder = new ArrayList<OnlineOrder>();
			for(int i=0;i<blahs.size();i++){
				Route blahhh = blahs.get(i);
			if(blahhh.getRouteNO().equals("1")){
				OnlineOrder blahh=new OnlineOrder();	
				blahh.setOrderNO(blahhh.getDomitory());
				blahh.setCustomername(blahhh.getArea());
				blahh.setOrdertime(blahhh.getRoute());
				blahh.setDomitory(blahhh.getCreatetime());
				blahh.setRoomNO(blahhh.getLastestDelivery());
				neworder.add(blahh);
				
				blah.setId(blahhh.getId());
				userService.deleteRoute(blah);
				
				
			}
			}
         OnlineOrder manage=new OnlineOrder();
	     manage.setId(IIIId.aaas);
	     
	     int kkkk1a=0;
	     int kkkk1b=0;
	     int kkkk2a=0;
	     int kkkk2b=0;
	     int kkkk3a=0;
	     int kkkk3b=0;
	     int kkkk4a=0;
	     int kkkk4b=0;
	     
		 List<OnlineOrder> manages = userService1.getOnlineOrders(manage);
		 IIIId.aaas=manages.get(manages.size()-1).getId();
		 
		 manages.addAll(neworder);
		for(int j=0;j<manages.size(); j++){
					OnlineOrder order = manages.get(j);
					String room=order.getRoomNO().substring(0, 1);
				 if(order.getDomitory().equals("竹一")){
					 if(room != null&&room.equals("A")){
					 aaaA.add(order); 
					  kkkk1a=1;
					 }
					 
					 if(room != null&&room.equals("B")){
							 aaaB.add(order); 
							  kkkk1b=1;
						 }
				 }
				 if(order.getDomitory().equals("竹二")){
					 if(room != null&&room.equals("A")){
						 bbbA.add(order); 
						 
						  kkkk2a=1;
					 }
					 
					 if(room != null&&room.equals("B")){
					
							 bbbB.add(order); 
							 
							  kkkk2b=1;
						 }
				 }
				 if(order.getDomitory().equals("竹三")){
					 if(room != null&&room.equals("A")){
						
						 cccA.add(order); 
						  kkkk3a=1;
					 }
					 
					 if(room != null&&room.equals("B")){
							 cccB.add(order); 
							  kkkk3b=1;
						 }
				 }
				  
				 if(order.getDomitory().equals("竹四")){
					 if(room != null&&room.equals("A")){
						 dddA.add(order); 
						  kkkk4a=1;
					 } 
					 if(room != null&&room.equals("B")){
					 dddB.add(order); 
					  kkkk4b=1;
					}
				 }
	     }
		
		Redtype dfdf=new Redtype();
		
		 ArraySplit  yy=new ArraySplit();
		    int splitSize = 8;
		
		if(kkkk1a==1){
			OnlineOrder[] aaaa=new OnlineOrder[aaaA.size()];
				aaaA.toArray(aaaa);
				OnlineOrder[]	intaaa=dfdf.kspx(aaaa,0,aaaa.length-1);
			 for(int i=0;i<intaaa.length;i++){
					 Object[] subAry = yy.splitAry(intaaa, splitSize);//分割后的子块数组
				for(Object obj: subAry){//打印输出结果  
					OnlineOrder[] aryItem =(OnlineOrder[])obj; 
					 String[] room =new String[aryItem.length];
					 String[] ordertimes = new String[aryItem.length];
					 String	c = null;
					 	
					for(int j=0;j<aryItem.length; j++){
						OnlineOrder order = aryItem[j];
					 room[j]=order.getRoomNO();
					 ordertimes[j]=order.getOrdertime();
					}
					for(int k=0;k<ordertimes.length-1;k++){
					String   a = ordertimes[k];
					String   b = ordertimes[k+1];					
					int result=a.compareTo(b);
					if (result==0){
						a=b;
						ordertimes[k+1]=b;
						  c= ordertimes[k+1];  }
					else if (result < 0 ){
						ordertimes[k+1]=a;}
						else if (result > 0 ){ ordertimes[k+1]=b;
						 c= ordertimes[k+1];
						}					
					}
					
					String sstr =	Arrays.toString(room).replaceAll("^\\[| |\\]$", "");
					java.util.Date dt=new  	java.util.Date();
			      		SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
			      		String  currentTime=sdf.format(dt);	
			      	//	long total_minute1 = 0;
					//	SimpleDateFormat ddf = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss"); 
						  
						  
						  Date currentTime1 = null;
						try {
							currentTime1 = sdf.parse(currentTime);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						  if(aryItem.length==8){              
			      		Route manage1=new Route();
			            manage1.setRouteNO("2");
			            manage1.setDomitory("竹一");
			            manage1.setArea("A区");
			            manage1.setRoute(sstr);
			            manage1.setCreatetime(currentTime);
			            manage1.setLastestDelivery(c);  
			            userService.addRoute(manage1); 
			              }
					 					  
					  else if(aryItem.length!=8){
						  List<String> room1 = new ArrayList<String>(); 
						  List<Object> onlineorders = new ArrayList<Object>(); 
						  
						  
						 // List<String> ID = new ArrayList<String>();
						  int sstr2 = 0;
						  
						  int sstr3=0;
						//  List<String> ID3 = new ArrayList<String>();
						  for(int k=0;k<aryItem.length;k++){
							  OnlineOrder order = aryItem[k];								  
							  String m =order.getRoomNO(); 
							  
							 
							//  int n =order.getId(); 
							//  String n1=Integer.toString(n);
							ordertimes[k]=order.getOrdertime();  
							String d  =ordertimes[k];
						  						
						   Date dd = null;
						try {
							dd = sdf.parse(d);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					long	 total_minute1 = (currentTime1.getTime() - dd.getTime())/(1000*60); 
						  
						if(total_minute1>30){
							sstr3=2;
					     room1.add(m);
					//	ID.add(n1);	
						}
						else if(total_minute1<=30){
						//	ID3.add(n1);	
							sstr2=1;
							onlineorders.add(aryItem[k]);
					}					
						}	
						  String[] Room1=new String[room1.size()];
						  room1.toArray(Room1);  
						  String Sstr1 =Arrays.toString(Room1).replaceAll("^\\[| |\\]$", ""); 
						// String[] ID2=new String[ID.size()];
					//		  bbbA.toArray(ID2);  
								Route manage1=new Route();			 
					            manage1.setRouteNO(String.valueOf(sstr3));  
					           
					            manage1.setDomitory("竹一");
					            manage1.setArea("A区");					            
					            manage1.setRoute(Sstr1);
					            manage1.setCreatetime(currentTime);
					            manage1.setLastestDelivery(c);  
					            userService.addRoute(manage1); 
					            
					            
					        
					            	for(Object  obj1: onlineorders){
					            		OnlineOrder[] aryItem1 =(OnlineOrder[])obj1; 	
					            		for(int l=0;l<aryItem1.length; l++){
											OnlineOrder order = aryItem[l];
										
				                manage1.setRouteNO(String.valueOf(sstr2));  
					            manage1.setDomitory(order.getOrderNO());
					            manage1.setArea(order.getCustomername());					            
					            manage1.setRoute(order.getOrdertime());
					            manage1.setCreatetime(order.getDomitory());
					            manage1.setLastestDelivery(order.getRoomNO());  
					            userService.addRoute(manage1);    
					            		}
					            
					            } 
					            
					            
					            }
					  }
					  
					  
					  
					  
					  }		             
				
				
		}
		
		if(kkkk1b==1){
				OnlineOrder[] aaab=new OnlineOrder[aaaB.size()];
				aaaB.toArray(aaab);	
				
				OnlineOrder[]	intaab=dfdf.kspx(aaab,0,aaab.length-1);
				   for(int i=0;i<intaab.length;i++){
						 Object[] subAry = yy.splitAry(intaab, splitSize);//分割后的子块数组
					for(Object obj: subAry){//打印输出结果  
						OnlineOrder[] aryItem = (OnlineOrder[]) obj; 
						 String[] room =new String[aryItem.length];
						 String[] ordertimes = new String[aryItem.length];
						 String	c = null;
						 	
						for(int j=0;j<aryItem.length; j++){
							OnlineOrder order = aryItem[j];
						 room[j]=order.getRoomNO();
						 ordertimes[j]=order.getOrdertime();
						}
						for(int k=0;k<ordertimes.length-1;k++){
						String   a = ordertimes[k];
						String   b = ordertimes[k+1];					
						int result=a.compareTo(b);
						if (result==0){
							a=b;
							ordertimes[k+1]=b;
							  c= ordertimes[k+1];  }
						else if (result < 0 ){
							ordertimes[k+1]=a;}
							else if (result > 0 ){ ordertimes[k+1]=b;
							 c= ordertimes[k+1];
							}					
						}
					
						String sstr =	Arrays.toString(room).replaceAll("^\\[| |\\]$", "");
						java.util.Date dt=new  	java.util.Date();
				      		SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
				      		String  currentTime=sdf.format(dt);	
				      	//	long total_minute = 0;
				      	//	long total_minute1 = 0;
						//	SimpleDateFormat ddf = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss"); 
							 
							  
							  Date currentTime1 = null;
							try {
								currentTime1 = sdf.parse(currentTime);
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						//	  total_minute = (currentTime1.getTime() - earlist_date.getTime())/(1000*60);
						  if(aryItem.length==8){              
				      		Route manage1=new Route();
				            manage1.setRouteNO("2");
				            manage1.setDomitory("竹一");
				            manage1.setArea("B区");
				            manage1.setRoute(sstr);
				            manage1.setCreatetime(currentTime);
				            manage1.setLastestDelivery(c);  
				            userService.addRoute(manage1); 
				              }
						 					  
						  else if(aryItem.length!=8){
							  List<String> room1 = new ArrayList<String>(); 
							  List<Object> onlineorders = new ArrayList<Object>(); 
							  
							  
							 // List<String> ID = new ArrayList<String>();
							  int sstr2 = 0;
							  
							  int sstr3=0;
							//  List<String> ID3 = new ArrayList<String>();
							  for(int k=0;k<aryItem.length;k++){
								  OnlineOrder order = aryItem[k];								  
								  String m =order.getRoomNO(); 
								  
								 
								//  int n =order.getId(); 
								//  String n1=Integer.toString(n);
								ordertimes[k]=order.getOrdertime();  
								String d  =ordertimes[k];
							  						
							   Date dd = null;
							try {
								dd = sdf.parse(d);
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						long 	 total_minute1 = (currentTime1.getTime() - dd.getTime())/(1000*60); 
							  
							if(total_minute1>30){
								sstr3=2;
						     room1.add(m);
						//	ID.add(n1);	
							}
							else if(total_minute1<=30){
							//	ID3.add(n1);	
								sstr2=1;
								onlineorders.add(aryItem[k]);
						}					
							}	
							  String[] Room1=new String[room1.size()];
							  room1.toArray(Room1);  
							  String Sstr1 =Arrays.toString(Room1).replaceAll("^\\[| |\\]$", ""); 
							// String[] ID2=new String[ID.size()];
						//		  bbbA.toArray(ID2);  
									Route manage1=new Route();			 
						            manage1.setRouteNO(String.valueOf(sstr3));  
						            manage1.setDomitory("竹一");
						            manage1.setArea("B区");					            
						            manage1.setRoute(Sstr1);
						            manage1.setCreatetime(currentTime);
						            manage1.setLastestDelivery(c);  
						            userService.addRoute(manage1); 
						            
						            
						        
						            	for(Object  obj1: onlineorders){
						            		OnlineOrder[] aryItem1 =(OnlineOrder[])obj1; 	
						            		for(int l=0;l<aryItem1.length; l++){
												OnlineOrder order = aryItem[l];
											
					                manage1.setRouteNO(String.valueOf(sstr2));  
						            manage1.setDomitory(order.getOrderNO());
						            manage1.setArea(order.getCustomername());					            
						            manage1.setRoute(order.getOrdertime());
						            manage1.setCreatetime(order.getDomitory());
						            manage1.setLastestDelivery(order.getRoomNO());  
						            userService.addRoute(manage1);    
						            		}
						            
						            } 
						            
						            
						            }
			                  
			          }  
				    }	
			
				
		}	
				
		if(kkkk2a==1){
			OnlineOrder[] bbba=new OnlineOrder[bbbA.size()];
			bbbA.toArray(bbba);
			OnlineOrder[]	intbba=dfdf.kspx(bbba,0,bbba.length-1);	
	//	for(int i=0;i<intbba.length;i++){
				 Object[] subAry = yy.splitAry(intbba, splitSize);//分割后的子块数组
			for(Object obj: subAry){//打印输出结果  
				OnlineOrder[] aryItem = (OnlineOrder[]) obj; 
				 String[] room =new String[aryItem.length];
				 
				 String[] ordertimes = new String[aryItem.length];
				 
				 
				
				 String	c = null;
				 	
				for(int j=0;j<aryItem.length; j++){
					OnlineOrder order = aryItem[j];
				 room[j]=order.getRoomNO();
				 ordertimes[j]=order.getOrdertime();
				}
				for(int k=0;k<ordertimes.length-1;k++){
				String   a = ordertimes[k];
				String   b = ordertimes[k+1];					
				int result=a.compareTo(b);
				if (result==0){
					a=b;
					ordertimes[k+1]=b;
					  c= ordertimes[k+1];  }
				else if (result < 0 ){
					ordertimes[k+1]=a;}
					else if (result > 0 ){ ordertimes[k+1]=b;
					 c= ordertimes[k+1];
					}					
				}
				
				String sstr =	Arrays.toString(room).replaceAll("^\\[| |\\]$", "");
				java.util.Date dt=new  	java.util.Date();
		      		SimpleDateFormat  sdf=new  SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		      		String  currentTime=sdf.format(dt);	
		    //  		long total_minute = 0;
		      		//long total_minute1 = 0;
					//SimpleDateFormat ddf = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss"); 
					
					  
					  Date currentTime1 = null;
					try {
						currentTime1 = sdf.parse(currentTime);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				//	  total_minute = (currentTime1.getTime() - earlist_date.getTime())/(1000*60);
				  if(aryItem.length==8){              
		      		Route manage1=new Route();
		            manage1.setRouteNO("2");
		            manage1.setDomitory("竹二");
		            manage1.setArea("A区");
		            manage1.setRoute(sstr);
		            manage1.setCreatetime(currentTime);
		            manage1.setLastestDelivery(c);  
		            userService.addRoute(manage1); 
		              }
				 					  
				  else if(aryItem.length!=8){
					  List<String> room1 = new ArrayList<String>(); 
					  List<Object> onlineorders = new ArrayList<Object>(); 
					  
					  
					 // List<String> ID = new ArrayList<String>();
					  int sstr2 = 0;
					  
					  int sstr3=0;
					//  List<String> ID3 = new ArrayList<String>();
					  for(int k=0;k<aryItem.length;k++){
						  OnlineOrder order = aryItem[k];								  
						  String m =order.getRoomNO(); 
						  
						 
						//  int n =order.getId(); 
						//  String n1=Integer.toString(n);
						//ordertimes[k]=order.getOrdertime();  
						String d  =order.getOrdertime();
					  						
					   Date dd = null;
					try {
						dd = sdf.parse(d);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					long total_minute1 = (currentTime1.getTime() - dd.getTime())/(1000*60); 
					  
					if(total_minute1>30){
						sstr3=2;
				     room1.add(m);
				//	ID.add(n1);	
					}
					else if(total_minute1<=30){
					//	ID3.add(n1);	
						sstr2=1;
						onlineorders.add(aryItem[k]);
				}					
					}	
					  String[] Room1=new String[room1.size()];
					  room1.toArray(Room1);  
					  String Sstr1 =Arrays.toString(Room1).replaceAll("^\\[| |\\]$", ""); 
					// String[] ID2=new String[ID.size()];
				//		  bbbA.toArray(ID2);  
							Route manage1=new Route();			 
				            manage1.setRouteNO(String.valueOf(sstr3));  
				            manage1.setDomitory("竹二");
				            manage1.setArea("A区");					            
				            manage1.setRoute(Sstr1);
				            manage1.setCreatetime(currentTime);
				            manage1.setLastestDelivery(c);  
				            userService.addRoute(manage1); 
				            
				            
				        
				            	for(Object  obj1: onlineorders){
				            		OnlineOrder[] aryItem1 =(OnlineOrder[])obj1; 	
				            		for(int l=0;l<aryItem1.length; l++){
										OnlineOrder order = aryItem[l];
									
			                manage1.setRouteNO(String.valueOf(sstr2));  
				            manage1.setDomitory(order.getOrderNO());
				            manage1.setArea(order.getCustomername());					            
				            manage1.setRoute(order.getOrdertime());
				            manage1.setCreatetime(order.getDomitory());
				            manage1.setLastestDelivery(order.getRoomNO());  
				            userService.addRoute(manage1);    
				            		}
				            
				            } 
				            
				            
				            }			              
	               }      
			
			
	    //      }  
		//	
			
			
			
		}
		if(kkkk2b==1){
				
				OnlineOrder[] bbbb=new OnlineOrder[bbbB.size()];
				bbbB.toArray(bbbb);
				
				OnlineOrder[]	intbbb=dfdf.kspx(bbbb,0,bbbb.length-1);	
				
				for(int i=0;i<intbbb.length;i++){
					 Object[] subAry = yy.splitAry(intbbb, splitSize);//分割后的子块数组
				for(Object obj: subAry){//打印输出结果  
					OnlineOrder[] aryItem = (OnlineOrder[]) obj; 
					 String[] room =new String[aryItem.length];
					 String[] ordertimes = new String[aryItem.length];
					 String	c = null;
					 	
					for(int j=0;j<aryItem.length; j++){
						OnlineOrder order = aryItem[j];
					 room[j]=order.getRoomNO();
					 ordertimes[j]=order.getOrdertime();
					}
					for(int k=0;k<ordertimes.length-1;k++){
					String   a = ordertimes[k];
					String   b = ordertimes[k+1];					
					int result=a.compareTo(b);
					if (result==0){
						a=b;
						ordertimes[k+1]=b;
						  c= ordertimes[k+1];  }
					else if (result < 0 ){
						ordertimes[k+1]=a;}
						else if (result > 0 ){ ordertimes[k+1]=b;
						 c= ordertimes[k+1];
						}					
					}
					
					String sstr =	Arrays.toString(room).replaceAll("^\\[| |\\]$", "");
					java.util.Date dt=new  	java.util.Date();
			  		SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
			  		String  currentTime=sdf.format(dt);	
			      	//	long total_minute = 0;
			      	//	long total_minute1 = 0;
					//	SimpleDateFormat ddf = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss"); 
						
						  
						  Date currentTime1 = null;
					try {
						currentTime1 = sdf.parse(currentTime);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
						e.printStackTrace();
						}
					//	  total_minute = (currentTime1.getTime() - earlist_date.getTime())/(1000*60);
					  if(aryItem.length==8){              
			      		Route manage1=new Route();
			            manage1.setRouteNO("2");
			            manage1.setDomitory("竹二");
			            manage1.setArea("B区");
			            manage1.setRoute(sstr);
			            manage1.setCreatetime(currentTime);
			            manage1.setLastestDelivery(c);  
			            userService.addRoute(manage1); 
			              }
					 					  
					  else if(aryItem.length!=8){
						  List<String> room1 = new ArrayList<String>(); 
						  List<Object> onlineorders = new ArrayList<Object>(); 
						  
						  
						 // List<String> ID = new ArrayList<String>();
						  int sstr2 = 0;
						  
						  int sstr3=0;
						//  List<String> ID3 = new ArrayList<String>();
						  for(int k=0;k<aryItem.length;k++){
							  OnlineOrder order = aryItem[k];								  
							  String m =order.getRoomNO(); 
							  
							 
							//  int n =order.getId(); 
							//  String n1=Integer.toString(n);
						//	ordertimes[k]=order.getOrdertime();  
							String d  =order.getOrdertime();
						  						
						   Date dd = null;
						try {
							dd = sdf.parse(d);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					long	 total_minute1 = (currentTime1.getTime() - dd.getTime())/(1000*60); 
						  
						if(total_minute1>30){
							sstr3=2;
					     room1.add(m);
					//	ID.add(n1);	
						}
						else if(total_minute1<=30){
						//	ID3.add(n1);	
							sstr2=1;
							onlineorders.add(aryItem[k]);
					}					
						}	
						  String[] Room1=new String[room1.size()];
						  room1.toArray(Room1);  
						  String Sstr1 =Arrays.toString(Room1).replaceAll("^\\[| |\\]$", ""); 
						// String[] ID2=new String[ID.size()];
					//		  bbbA.toArray(ID2);  
								Route manage1=new Route();			 
					            manage1.setRouteNO(String.valueOf(sstr3));  
					            manage1.setDomitory("竹二");
					            manage1.setArea("B区");					            
					            manage1.setRoute(Sstr1);
					            manage1.setCreatetime(currentTime);
					            manage1.setLastestDelivery(c);  
					            userService.addRoute(manage1); 
					            
					            
					        
					            	for(Object  obj1: onlineorders){
					            		OnlineOrder[] aryItem1 =(OnlineOrder[])obj1; 	
					            		for(int l=0;l<aryItem1.length; l++){
											OnlineOrder order = aryItem[l];
										
				                manage1.setRouteNO(String.valueOf(sstr2));  
					            manage1.setDomitory(order.getOrderNO());
					            manage1.setArea(order.getCustomername());					            
					            manage1.setRoute(order.getOrdertime());
					            manage1.setCreatetime(order.getDomitory());
					            manage1.setLastestDelivery(order.getRoomNO());  
					            userService.addRoute(manage1);    
					            		}
					            
					            } 
					            
					            
					            }
		          
		      		
		              }
		               }      	
				
				
		}
				
		if(kkkk3a==1){
					
				OnlineOrder[] ccca=new OnlineOrder[cccA.size()];
				cccA.toArray(ccca);
			
				OnlineOrder[]	intcca=dfdf.kspx(ccca,0,ccca.length-1);	
				
				for(int i=0;i<intcca.length;i++){
					 Object[] subAry = yy.splitAry(intcca, splitSize);//分割后的子块数组
				for(Object obj: subAry){//打印输出结果  
					OnlineOrder[] aryItem = (OnlineOrder[]) obj; 
					 String[] room =new String[aryItem.length];
					 String[] ordertimes = new String[aryItem.length];
					 String	c = null;
					 	
					for(int j=0;j<aryItem.length; j++){
						OnlineOrder order = aryItem[j];
					 room[j]=order.getRoomNO();
					 ordertimes[j]=order.getOrdertime();
					}
					for(int k=0;k<ordertimes.length-1;k++){
					String   a = ordertimes[k];
					String   b = ordertimes[k+1];					
					int result=a.compareTo(b);
					if (result==0){
						a=b;
						ordertimes[k+1]=b;
						  c= ordertimes[k+1];  }
					else if (result < 0 ){
						ordertimes[k+1]=a;}
						else if (result > 0 ){ ordertimes[k+1]=b;
						 c= ordertimes[k+1];
						}					
					}
					
					String sstr =	Arrays.toString(room).replaceAll("^\\[| |\\]$", "");
					java.util.Date dt=new  	java.util.Date();
			      		//java.text.SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
			      		SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
			      		String  currentTime=sdf.format(dt);	
			      		//long total_minute = 0;
			      	//	long total_minute1 = 0;
					//	SimpleDateFormat ddf = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss");  
						  Date currentTime1 = null;
						try {
							currentTime1 = sdf.parse(currentTime);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//  total_minute = (currentTime1.getTime() - earlist_date.getTime())/(1000*60);
					  if(aryItem.length==8){              
			      		Route manage1=new Route();
			            manage1.setRouteNO("2");
			            manage1.setDomitory("竹三");
			            manage1.setArea("A区");
			            manage1.setRoute(sstr);
			            manage1.setCreatetime(currentTime);
			            manage1.setLastestDelivery(c);  
			            userService.addRoute(manage1); 
			              }
					 					  
					  else if(aryItem.length!=8){
						  List<String> room1 = new ArrayList<String>(); 
						  List<Object> onlineorders = new ArrayList<Object>(); 
						  
						  
						 // List<String> ID = new ArrayList<String>();
						  int sstr2 = 0;
						  
						  int sstr3=0;
						//  List<String> ID3 = new ArrayList<String>();
						  for(int k=0;k<aryItem.length;k++){
							  OnlineOrder order = aryItem[k];								  
							  String m =order.getRoomNO(); 
							  
							 
							//  int n =order.getId(); 
							//  String n1=Integer.toString(n);
							//ordertimes[k]=order.getOrdertime();  
							String d  =order.getOrdertime();
						  						
						   Date dd = null;
						try {
							dd = sdf.parse(d);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				long		 total_minute1 = (currentTime1.getTime() - dd.getTime())/(1000*60); 
						  
						if(total_minute1>30){
							sstr3=2;
					     room1.add(m);
					//	ID.add(n1);	
						}
						else if(total_minute1<=30){
						//	ID3.add(n1);	
							sstr2=1;
							onlineorders.add(aryItem[k]);
					}					
						}	
						  String[] Room1=new String[room1.size()];
						  room1.toArray(Room1);  
						  String Sstr1 =Arrays.toString(Room1).replaceAll("^\\[| |\\]$", ""); 
						// String[] ID2=new String[ID.size()];
					//		  bbbA.toArray(ID2);  
								Route manage1=new Route();			 
					            manage1.setRouteNO(String.valueOf(sstr3));  
					            manage1.setDomitory("竹三");
					            manage1.setArea("A区");					            
					            manage1.setRoute(Sstr1);
					            manage1.setCreatetime(currentTime);
					            manage1.setLastestDelivery(c);  
					            userService.addRoute(manage1); 
					            
					            
					        
					            	for(Object  obj1: onlineorders){
					            		OnlineOrder[] aryItem1 =(OnlineOrder[])obj1; 	
					            		for(int l=0;l<aryItem1.length; l++){
											OnlineOrder order = aryItem[l];
										
				                manage1.setRouteNO(String.valueOf(sstr2));  
					            manage1.setDomitory(order.getOrderNO());
					            manage1.setArea(order.getCustomername());					            
					            manage1.setRoute(order.getOrdertime());
					            manage1.setCreatetime(order.getDomitory());
					            manage1.setLastestDelivery(order.getRoomNO());  
					            userService.addRoute(manage1);    
					            		}
					            
					            } 
					            
					            
					            }			              
		               }      
				
				
		          }  
				
		}	
		
		
		if(kkkk3b==1){	
				OnlineOrder[] cccb=new OnlineOrder[cccB.size()];
				cccB.toArray(cccb);
				OnlineOrder[]	intccb=dfdf.kspx(cccb,0,cccb.length-1);
				
				for(int i=0;i<intccb.length;i++){
					 Object[] subAry = yy.splitAry(intccb, splitSize);//分割后的子块数组
				for(Object obj: subAry){//打印输出结果  
					OnlineOrder[] aryItem = (OnlineOrder[]) obj; 
					 String[] room =new String[aryItem.length];
					 String[] ordertimes = new String[aryItem.length];
					 String	c = null;
					 	
					for(int j=0;j<aryItem.length; j++){
						OnlineOrder order = aryItem[j];
					 room[j]=order.getRoomNO();
					 ordertimes[j]=order.getOrdertime();
					}
					for(int k=0;k<ordertimes.length-1;k++){
					String   a = ordertimes[k];
					String   b = ordertimes[k+1];					
					int result=a.compareTo(b);
					if (result==0){
						a=b;
						ordertimes[k+1]=b;
						  c= ordertimes[k+1];  }
					else if (result < 0 ){
						ordertimes[k+1]=a;}
						else if (result > 0 ){ ordertimes[k+1]=b;
						 c= ordertimes[k+1];
						}					
					}
					
					String sstr =	Arrays.toString(room).replaceAll("^\\[| |\\]$", "");
					java.util.Date dt=new  	java.util.Date();
			      		SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
			      		String  currentTime=sdf.format(dt);	
			      	//	long total_minute = 0;
			      	//	long total_minute1 = 0;
					//	SimpleDateFormat ddf = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss"); 
						 
						  
						  Date currentTime1 = null;
						try {
							currentTime1 = sdf.parse(currentTime);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//  total_minute = (currentTime1.getTime() - earlist_date.getTime())/(1000*60);
					  if(aryItem.length==8){              
			      		Route manage1=new Route();
			            manage1.setRouteNO("2");
			            manage1.setDomitory("竹三");
			            manage1.setArea("B区");
			            manage1.setRoute(sstr);
			            manage1.setCreatetime(currentTime);
			            manage1.setLastestDelivery(c);  
			            userService.addRoute(manage1); 
			              }
					 					  
					  else if(aryItem.length!=8){
						  List<String> room1 = new ArrayList<String>(); 
						  List<Object> onlineorders = new ArrayList<Object>(); 
						  
						  
						 // List<String> ID = new ArrayList<String>();
						  int sstr2 = 0;
						  
						  int sstr3=0;
						//  List<String> ID3 = new ArrayList<String>();
						  for(int k=0;k<aryItem.length;k++){
							  OnlineOrder order = aryItem[k];								  
							  String m =order.getRoomNO(); 
							  
							 
							//  int n =order.getId(); 
							//  String n1=Integer.toString(n);
						//	ordertimes[k]=order.getOrdertime();  
							String d  =order.getOrdertime();
						  						
						   Date dd = null;
						try {
							dd = sdf.parse(d);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					long	 total_minute1 = (currentTime1.getTime() - dd.getTime())/(1000*60); 
						  
						if(total_minute1>30){
							sstr3=2;
					     room1.add(m);
					//	ID.add(n1);	
						}
						else if(total_minute1<=30){
						//	ID3.add(n1);	
							sstr2=1;
							onlineorders.add(aryItem[k]);
					}					
						}	
						  String[] Room1=new String[room1.size()];
						  room1.toArray(Room1);  
						  String Sstr1 =Arrays.toString(Room1).replaceAll("^\\[| |\\]$", ""); 
						// String[] ID2=new String[ID.size()];
					//		  bbbA.toArray(ID2);  
								Route manage1=new Route();			 
					            manage1.setRouteNO(String.valueOf(sstr3));  
					            manage1.setDomitory("竹三");
					            manage1.setArea("B区");					            
					            manage1.setRoute(Sstr1);
					            manage1.setCreatetime(currentTime);
					            manage1.setLastestDelivery(c);  
					            userService.addRoute(manage1); 
					            
					            
					        
					            	for(Object  obj1: onlineorders){
					            		OnlineOrder[] aryItem1 =(OnlineOrder[])obj1; 	
					            		for(int l=0;l<aryItem1.length; l++){
											OnlineOrder order = aryItem[l];
										
				                manage1.setRouteNO(String.valueOf(sstr2));  
					            manage1.setDomitory(order.getOrderNO());
					            manage1.setArea(order.getCustomername());					            
					            manage1.setRoute(order.getOrdertime());
					            manage1.setCreatetime(order.getDomitory());
					            manage1.setLastestDelivery(order.getRoomNO());  
					            userService.addRoute(manage1);    
					            		}
					            
					            } 
					            
					            
					            }   			              
		               }      
				
				
		          }  
				
				
		}			
		if(kkkk4a==1){	
				OnlineOrder[] ddda=new OnlineOrder[dddA.size()];
				dddA.toArray(ddda);
				OnlineOrder[]	intdda=dfdf.kspx(ddda,0,ddda.length-1);	
				
				for(int i=0;i<intdda.length;i++){
					 Object[] subAry = yy.splitAry(intdda, splitSize);//分割后的子块数组
				for(Object obj: subAry){//打印输出结果  
					OnlineOrder[] aryItem = (OnlineOrder[]) obj; 
					 String[] room =new String[aryItem.length];
					 String[] ordertimes = new String[aryItem.length];
					 String	c = null;
					 	
					for(int j=0;j<aryItem.length; j++){
						OnlineOrder order = aryItem[j];
					 room[j]=order.getRoomNO();
					 ordertimes[j]=order.getOrdertime();
					}
					for(int k=0;k<ordertimes.length-1;k++){
					String   a = ordertimes[k];
					String   b = ordertimes[k+1];					
					int result=a.compareTo(b);
					if (result==0){
						a=b;
						ordertimes[k+1]=b;
						  c= ordertimes[k+1];  }
					else if (result < 0 ){
						ordertimes[k+1]=a;}
						else if (result > 0 ){ ordertimes[k+1]=b;
						 c= ordertimes[k+1];
						}					
					}
					
					String sstr =	Arrays.toString(room).replaceAll("^\\[| |\\]$", "");
					java.util.Date dt=new  	java.util.Date();
			      		SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
			      		String  currentTime=sdf.format(dt);	
			      	//	long total_minute = 0;
			      	//	long total_minute1 = 0;
					//	SimpleDateFormat ddf = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss"); 
						 
						  
						  Date currentTime1 = null;
						try {
							currentTime1 = sdf.parse(currentTime);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					//	  total_minute = (currentTime1.getTime() - earlist_date.getTime())/(1000*60);
					  if(aryItem.length==8){              
			      		Route manage1=new Route();
			            manage1.setRouteNO("2");
			            manage1.setDomitory("竹四");
			            manage1.setArea("A区");
			            manage1.setRoute(sstr);
			            manage1.setCreatetime(currentTime);
			            manage1.setLastestDelivery(c);  
			            userService.addRoute(manage1); 
			              }
					 					  
					  else if(aryItem.length!=8){
						  List<String> room1 = new ArrayList<String>(); 
						  List<Object> onlineorders = new ArrayList<Object>(); 
						  
						  
						 // List<String> ID = new ArrayList<String>();
						  int sstr2 = 0;
						  
						  int sstr3=0;
						//  List<String> ID3 = new ArrayList<String>();
						  for(int k=0;k<aryItem.length;k++){
							  OnlineOrder order = aryItem[k];								  
							  String m =order.getRoomNO(); 
							  
							 
							//  int n =order.getId(); 
							//  String n1=Integer.toString(n);
							//ordertimes[k]=order.getOrdertime();  
							String d  =order.getOrdertime();
						  						
						   Date dd = null;
						try {
							dd = sdf.parse(d);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					long	 total_minute1 = (currentTime1.getTime() - dd.getTime())/(1000*60); 
						  
						if(total_minute1>30){
							sstr3=2;
					     room1.add(m);
					//	ID.add(n1);	
						}
						else if(total_minute1<=30){
						//	ID3.add(n1);	
							sstr2=1;
							onlineorders.add(aryItem[k]);
					}					
						}	
						  String[] Room1=new String[room1.size()];
						  room1.toArray(Room1);  
						  String Sstr1 =Arrays.toString(Room1).replaceAll("^\\[| |\\]$", ""); 
						// String[] ID2=new String[ID.size()];
					//		  bbbA.toArray(ID2);  
								Route manage1=new Route();			 
					            manage1.setRouteNO(String.valueOf(sstr3));  
					            manage1.setDomitory("竹四");
					            manage1.setArea("A区");					            
					            manage1.setRoute(Sstr1);
					            manage1.setCreatetime(currentTime);
					            manage1.setLastestDelivery(c);  
					            userService.addRoute(manage1); 
					            
					            
					        
					            	for(Object  obj1: onlineorders){
					            		OnlineOrder[] aryItem1 =(OnlineOrder[])obj1; 	
					            		for(int l=0;l<aryItem1.length; l++){
											OnlineOrder order = aryItem[l];
										
				                manage1.setRouteNO(String.valueOf(sstr2));  
					            manage1.setDomitory(order.getOrderNO());
					            manage1.setArea(order.getCustomername());					            
					            manage1.setRoute(order.getOrdertime());
					            manage1.setCreatetime(order.getDomitory());
					            manage1.setLastestDelivery(order.getRoomNO());  
					            userService.addRoute(manage1);    
					            		}
					            
					            } 
					            
					            
					            }	              
		               }      
				
				
		          }  
				
				if(kkkk4b==1){		
				
				OnlineOrder[] dddb=new OnlineOrder[dddB.size()];
				dddB.toArray(dddb);
		
				OnlineOrder[]	intddb=dfdf.kspx(dddb,0,dddb.length-1);	
			   
	         
				for(int i=0;i<intddb.length;i++){
					 Object[] subAry = yy.splitAry(intddb, splitSize);//分割后的子块数组
				for(Object obj: subAry){//打印输出结果  
					OnlineOrder[] aryItem = (OnlineOrder[]) obj; 
					 String[] room =new String[aryItem.length];
					 String[] ordertimes = new String[aryItem.length];
					 String	c = null;
					 	
					for(int j=0;j<aryItem.length; j++){
						OnlineOrder order = aryItem[j];
					 room[j]=order.getRoomNO();
					 ordertimes[j]=order.getOrdertime();
					}
					for(int k=0;k<ordertimes.length-1;k++){
					String   a = ordertimes[k];
					String   b = ordertimes[k+1];					
					int result=a.compareTo(b);
					if (result==0){
						a=b;
						ordertimes[k+1]=b;
						  c= ordertimes[k+1];  }
					else if (result < 0 ){
						ordertimes[k+1]=a;}
						else if (result > 0 ){ ordertimes[k+1]=b;
						 c= ordertimes[k+1];
						}					
					}
					
					String sstr =	Arrays.toString(room).replaceAll("^\\[| |\\]$", "");
					java.util.Date dt=new  	java.util.Date();
			      		SimpleDateFormat  sdf=new  java.text.SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
			      		String  currentTime=sdf.format(dt);	
			      	//	long total_minute = 0;
			      	//	long total_minute1 = 0;
					//	SimpleDateFormat ddf = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss"); 
					//	  Date earlist_date = null;
					//	try {
					//		earlist_date = ddf.parse(c);
					//	} catch (ParseException e1) {
							// TODO Auto-generated catch block
					//		e1.printStackTrace();
					//	}
						  
						  Date currentTime1 = null;
						try {
							currentTime1 = sdf.parse(currentTime);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//  total_minute = (currentTime1.getTime() - earlist_date.getTime())/(1000*60);
					  if(aryItem.length==8){              
			      		Route manage1=new Route();
			            manage1.setRouteNO("2");
			            manage1.setDomitory("竹四");
			            manage1.setArea("B区");
			            manage1.setRoute(sstr);
			            manage1.setCreatetime(currentTime);
			            manage1.setLastestDelivery(c);  
			            userService.addRoute(manage1); 
			              }
					 					  
					  else if(aryItem.length!=8){
						  List<String> room1 = new ArrayList<String>(); 
						  List<Object> onlineorders = new ArrayList<Object>(); 
						  
						  
						 // List<String> ID = new ArrayList<String>();
						  int sstr2 = 0;
						  
						  int sstr3=0;
						//  List<String> ID3 = new ArrayList<String>();
						  for(int k=0;k<aryItem.length;k++){
							  OnlineOrder order = aryItem[k];								  
							  String m =order.getRoomNO(); 
							  
							 
							//  int n =order.getId(); 
							//  String n1=Integer.toString(n);
						//	ordertimes[k]=order.getOrdertime();  
							String d  =order.getOrdertime();
						  						
						   Date dd = null;
						try {
							dd = sdf.parse(d);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						long  total_minute1 = (currentTime1.getTime() - dd.getTime())/(1000*60); 
						  
						if(total_minute1>30){
							sstr3=2;
					     room1.add(m);
					//	ID.add(n1);	
						}
						else if(total_minute1<=30){
						//	ID3.add(n1);	
							sstr2=1;
							onlineorders.add(aryItem[k]);
					}					
						}	
						  String[] Room1=new String[room1.size()];
						  room1.toArray(Room1);  
						  String Sstr1 =Arrays.toString(Room1).replaceAll("^\\[| |\\]$", ""); 
						// String[] ID2=new String[ID.size()];
					//		  bbbA.toArray(ID2);  
								Route manage1=new Route();			 
					            manage1.setRouteNO(String.valueOf(sstr3));  
					            manage1.setDomitory("竹四");
					            manage1.setArea("B区");					            
					            manage1.setRoute(Sstr1);
					            manage1.setCreatetime(currentTime);
					            manage1.setLastestDelivery(c);  
					            userService.addRoute(manage1); 
					            
					            
					        
					            	for(Object  obj1: onlineorders){
					            		OnlineOrder[] aryItem1 =(OnlineOrder[])obj1; 	
					            		for(int l=0;l<aryItem1.length; l++){
											OnlineOrder order = aryItem[l];
										
				                manage1.setRouteNO(String.valueOf(sstr2));  
					            manage1.setDomitory(order.getOrderNO());
					            manage1.setArea(order.getCustomername());					            
					            manage1.setRoute(order.getOrdertime());
					            manage1.setCreatetime(order.getDomitory());
					            manage1.setLastestDelivery(order.getRoomNO());  
					            userService.addRoute(manage1);    
					            		}
					            
					            } 
					            
					            
					            }  			              
		               }      
				
				
		          }  }
			                         
				}
		response.sendRedirect("admin/pages/route.jsp");	 
	}
				
				
				
} 
			
				
				
			
			
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				 
							

	
	
				
	
			
				
				
				
			
			
			
				
				
				
			
			
			
			
	//	 manage.setUserNO(a); 
   //     manage.setRouteNO(b);
     //   manage.setRouteNO(c); 
   //     manage.setStarttime(d);
   //     userService.addUserRoute(manage);
     //   List<UserRoute> manages = userService.getUserRoutes(manage);
      //  request.setAttribute("blahs", manages);
     //   request.getRequestDispatcher("admin/usermanagement.jsp").forward(request, response);
        
       
        
	

	



