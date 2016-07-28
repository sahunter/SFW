package arrange.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Date;
import java.util.List;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hrm.model.User;
import hrm.model.WebService;

/**
 * Servlet implementation class EmailThe
 */
@WebServlet("/EmailThe")
public class EmailThe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailThe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		Properties prop=new Properties();
		prop.setProperty("mail.smtp.host", "smtp.126.com");
		prop.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		prop.setProperty("mail.smtp.socketFactory.fallback", "false");
		prop.setProperty("mail.smtp.port","25");
		prop.setProperty("mail.smtp.socketFactory.port", "25");
		prop.setProperty("mail.smtp.auth", "true");
		Session session=Session.getDefaultInstance(prop,new Authenticator(){
		protected PasswordAuthentication getPasswordAuthentication(){
			return new PasswordAuthentication("zpf12345678910@126.com","zpf123456789");
		}
		});
		PrintWriter out=response.getWriter();
		String emailwho=request.getParameter("emailwho");
		switch(emailwho){
		case "1":
			WebService userService = (WebService) getServletContext().getAttribute("userService");
			List<User> blahs = userService.getUsers();
			for (int i = 0; i < blahs.size(); i++) { 
		 		User bh = blahs.get(i);
		 		String name=bh.getUsername();
		 		String email=bh.getMail();
		 		Message message=new MimeMessage(session);
		 			try {
		 				message.setRecipient(Message.RecipientType.TO,new InternetAddress(email));
		 				message.setFrom(new InternetAddress("zpf12345678910@126.com"));
		 				message.setSubject("下周的值班表已完成，请尽快登录系统查看！");
		 				message.setText(name+"员工，查看后需要修改的请在系统中提出申请。");
		 				message.setSentDate(new Date());
		 				Transport.send(message);
		 			} catch (AddressException e) {
			// TODO Auto-generated catch block
		 				e.printStackTrace();
		 			} catch (MessagingException e) {
			// TODO Auto-generated catch block
		 				e.printStackTrace();
		 			}
		 		}
			response.sendRedirect("pages/CheckWorkArrange.jsp");
			break;
		case "2":
			String thedate=request.getParameter("thedate");
			 String thetime=request.getParameter("thetime");
			 String reason=java.net.URLDecoder.decode(request.getParameter("reason"),"UTF-8");
			 String username=java.net.URLDecoder.decode(request.getParameter("username"),"UTF-8"); 
			Message message2=new MimeMessage(session);
			try {
				message2.setRecipient(Message.RecipientType.TO,new InternetAddress("2969311176@qq.com"));
				message2.setFrom(new InternetAddress("zpf12345678910@126.com"));
				message2.setSubject("员工"+username+"向您提出请假申请，请尽快处理！");
				message2.setText("请假时间是："+thedate+";请假班次是："+thetime+";请假原因是："+reason+"。");
				message2.setSentDate(new Date());
				Transport.send(message2);
			} catch (AddressException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.print(1);
			break;
		case "3":
			String olddate=request.getParameter("thedate");
			 String oldtime=request.getParameter("thetime");
			 String newsection=java.net.URLDecoder.decode(request.getParameter("reason"),"UTF-8");
			 String username3=java.net.URLDecoder.decode(request.getParameter("username"),"UTF-8"); 
			Message message3=new MimeMessage(session);
			try {
				message3.setRecipient(Message.RecipientType.TO,new InternetAddress("2969311176@qq.com"));
				message3.setFrom(new InternetAddress("zpf12345678910@126.com"));
				message3.setSubject("员工"+username3+"向您提出调换班次的申请，请尽快处理！");
				message3.setText("原班次时间是："+olddate+";原班次是："+oldtime+";申请调至："+newsection+"。");
				message3.setSentDate(new Date());
				Transport.send(message3);
			} catch (AddressException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.print(1);
			break;
		}
		out.close();
		
		/*String name=request.getParameter("username");
		String email=request.getParameter("email");
		WebService userService = (WebService) getServletContext().getAttribute("userService");
		User acct=new User();
		String psw="1";
		acct.setUsername(name);
		acct.setMail(email);
		
		if(userService.isGetPasswordOK(acct)){
			psw=userService.getUser(acct).getPassword();
			Message message=new MimeMessage(session);
			try {
				message.setRecipient(Message.RecipientType.TO,new InternetAddress(email));
				message.setFrom(new InternetAddress("zpf12345678910@126.com"));
				message.setSubject("找回密码");
				message.setText(psw);
				message.setSentDate(new Date());
				Transport.send(message);
			} catch (AddressException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			}}else{
				request.getRequestDispatcher("404.html").forward(request, response);
			}*/
	}
	 
}



/*137：sZeroRecords:"No matching records found"},

    sProcessing:"Processing...",sSearch:"查找:",

,oSearch:h.extend({},m.models.oSearch)     ,sSearch:"查找:"
*/