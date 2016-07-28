package arrange.model;
import java.io.Serializable;
import java.util.Date;
public class WorkArrange implements Serializable{
	private String workTime;
	private String shift;
	private int Id;
	private int workNO;
	private String userName;
	private String date;
	public String getWorkTime() {
		return workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getWorkNO() {
		return workNO;
	}
	public void setWorkNO(int workNO) {
		this.workNO = workNO;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
