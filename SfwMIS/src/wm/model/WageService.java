package wm.model;
import java.util.*;








public class WageService {
			private WagesDAO wagesDAO;
	
	
	

			public WageService(String USERS,WagesDAO wagesDAO) {
			    this(wagesDAO);
			}
			public WageService(WagesDAO wagesDAO){
				this.wagesDAO=wagesDAO;
				}
	
			
			 
			public Wages getWage(Wages wage) {
		  			
					return wagesDAO.getWage(wage);
				}
			 public List<Wages> getWages(Wages wage){
					return wagesDAO.getWages(wage);
				}
			 
			 
			 public void addWage(Wages  wage){
				 wagesDAO.addWage(wage);
				}
				
				public void updateWage(Wages wage) {
					wagesDAO.updateWage(wage);
				}
				public void deleteWage(Wages wage){
					wagesDAO.deleteWage(wage);
				}
			 	
				
				
				public String getTheLastWageDate() {
		  			
					return wagesDAO.getTheLastWageDate();
				}
		
				public void updateWageLate(Wages wage) {
					wagesDAO.updateWageLate(wage);
				}
		
				public void updateWageIntegral(Wages wage) {
					wagesDAO.updateWageIntegral(wage);
				}
		
				public void updateWageShift(Wages wage) {
					wagesDAO.updateWageShfit(wage);
				}
		
				public Wages getWageForChange(Wages wage) {
		  			
					return wagesDAO.getWageForChange(wage);
				}
		
		
	 
}