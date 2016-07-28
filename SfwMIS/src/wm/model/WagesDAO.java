package wm.model;

import java.util.List;


public interface WagesDAO {
	void addWage(Wages wages);
	Wages getWage(Wages wages);
	void updateWage(Wages wages);
	void deleteWage(Wages wages);
	List<Wages> getWages(Wages wages);
	List<Wages> getUndoWages(Wages wages);
	String getTheLastWageDate();
	void updateWageLate(Wages wages);
	void updateWageIntegral(Wages wage);
	void updateWageShfit(Wages wage);
	Wages getWageForChange(Wages wage);
	
}
