package wm.model;

import java.io.Serializable;


public class Wages implements Serializable{
	
	String userName;
	int userNO;
	String appeal;//申诉
	String toConfirm;//申诉结果
	double integral;//积分
	int shift;//值班次数
	float wages;
	String date;
	int num;//份数
	float fixed;//跟上面合并了
	int late;
	private int Id;
	public Wages(){
		
	}
	public int getUserNO(){
		return userNO;
	}
	public void setUserNO(int userNO){
		this.userNO=userNO;
	}
	
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	
	public String getAppeal(){
		return appeal;
	}
	public void setAppeal(String appeal){
		this.appeal=appeal;
	}
	
	public String getToConfirm(){
		return toConfirm;
		
	}
	public void setToConfirm(String toConfirm){
		this.toConfirm=toConfirm;
	}
	public double getIntegral(){
		return integral;
	}
	public void setIntegral(double d){
		this.integral=d;
		
	}
	/*public int getMorningShift(){
		return morningShift;
	}
	public void setMorningShift(int moringShift){
		this.morningShift=moringShift;
	}*/
	public int getShift(){
		return shift;
	}
	public void setShift(int shift){
		this.shift=shift;
	}
	/*public int getNightShift(){
		return nightShift;
	}
	public void setNightShift(int nightShift){
		this.nightShift=nightShift;
	}*/
	public float getWages(){
		return wages;
	}
	public void setWages(float wages){
		this.wages=wages;
	}
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date=date;
	}
	public  int getNum(){
		return num;
	}
	public void setNum(int num){
		this.num =num;
	}
	/*public float getCustomerService(){
		return customerService;
	}
	public void setCustomerService(float customerService){
		this.customerService=customerService;
	}*/
	public float getFixed(){
		return fixed;
	}
	public void setFixed(float fixed){
		this.fixed=fixed;
	}
	public int getLate(){
		return late;
	}
	public void setLate(int late){
		this.late=late;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
}
