package dm.model;
import java.util.Date;
public class Timefuntion {
	
	

	public class mss {
	 
	  public mss() {   
	  } 

	  public long fromDateStringToLong(String inVal) { //�˷�������ʱ�����
	  Date date = null;   //����ʱ������       
	  java.text.SimpleDateFormat inputFormat = new java.text.SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
	  try { 
	  date = inputFormat.parse(inVal); //���ַ���ת����������
	  } catch (Exception e) { 
	  e.printStackTrace(); 
	  } 
	  return date.getTime();   //���غ�����
	  } 
	}}
