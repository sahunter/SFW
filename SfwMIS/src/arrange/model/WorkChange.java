package arrange.model;
import java.io.Serializable;

public class WorkChange implements Serializable{
	private String dayOff;
	private String changeOff;
	private int Id;
	private float changeNO;
	private String userName;
	private String date;
	private String time;
	private String workOverTime;
	private String joinPopularization;
	private String beingLate;
	
	public String getDayOff() {
		return dayOff;
	}
	public void setDayOff(String dayOff) {
		this.dayOff = dayOff;
	}
	public String getChangeOff() {
		return changeOff;
	}
	public void setChangeOff(String changeOff) {
		this.changeOff = changeOff;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public float getChangeNO() {
		return changeNO;
	}
	public void setChangeNO(float changeNO) {
		this.changeNO = changeNO;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getWorkOverTime() {
		return workOverTime;
	}
	public void setWorkOverTime(String workOverTime) {
		this.workOverTime = workOverTime;
	}
	public String getJoinPopularization() {
		return joinPopularization;
	}
	public void setJoinPopularization(String joinPopularization) {
		this.joinPopularization = joinPopularization;
	}
	public String getBeingLate() {
		return beingLate;
	}
	public void setBeingLate(String beingLate) {
		this.beingLate = beingLate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
