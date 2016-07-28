package dm.model;
import java.util.Date;
public class Timefuntion {
	
	

	public class mss {
	 
	  public mss() {   
	  } 

	  public long fromDateStringToLong(String inVal) { //此方法计算时间毫秒
	  Date date = null;   //定义时间类型       
	  java.text.SimpleDateFormat inputFormat = new java.text.SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
	  try { 
	  date = inputFormat.parse(inVal); //将字符型转换成日期型
	  } catch (Exception e) { 
	  e.printStackTrace(); 
	  } 
	  return date.getTime();   //返回毫秒数
	  } 
	}}
