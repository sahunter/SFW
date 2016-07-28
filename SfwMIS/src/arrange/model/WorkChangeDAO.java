package arrange.model;

import java.util.List;

public interface WorkChangeDAO {
	void addWorkChange(WorkChange workChange);
	//Administrator getAdministrator(WorkChange workChange);
	//void updateWorkChange(WorkChange workChange);
	void deleteWorkChange(WorkChange workChange);
	List<WorkChange> getWorkChangeBLs();
	List<WorkChange> getWorkChangeWOTs();
	List<WorkChange> getBeingLates(WorkChange workChange);
	List<WorkChange> getPopularizations(WorkChange workChange);
	List<WorkChange> getWorkOverTimes(WorkChange workChange);
	void updateWorkOverTime(WorkChange workChange);
	void updateBeingLate(WorkChange workChange);
	void updateRealBeingLate(WorkChange workChange);
	WorkChange getDayOff(WorkChange workChange);
	WorkChange getChangeOff(WorkChange workChange);
}
