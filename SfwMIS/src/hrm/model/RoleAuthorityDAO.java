package hrm.model;

import java.util.List;


public interface RoleAuthorityDAO {
	void addRoleAuthority(RoleAuthority roleAuthority);
	RoleAuthority getRoleAuthority(RoleAuthority roleAuthority);
	void updateRoleAuthority(RoleAuthority roleAuthority);
	void deleteRoleAuthority(RoleAuthority roleAuthority);
	List<RoleAuthority> getRoleAuthoritys(RoleAuthority roleAuthority);

}