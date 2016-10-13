package com.hzit.dao.mapper;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import com.hzit.dao.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoleMapper {

	void insertRole(Role role);

	void deleteRoleByRoleId(Integer roleId);

	void updateRole(Role role);

	Page<Role> searchRoleByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Role> searchRoleByParams(@Param("map") Map<String, String> map);

} 
