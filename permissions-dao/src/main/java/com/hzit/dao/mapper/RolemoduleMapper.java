package com.hzit.dao.mapper;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import com.hzit.dao.entity.Rolemodule;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RolemoduleMapper {

	void insertRolemodule(Rolemodule rolemodule);

	void deleteRolemoduleByAssId(Integer assId);

	void updateRolemodule(Rolemodule rolemodule);

	Page<Rolemodule> searchRolemoduleByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Rolemodule> searchRolemoduleByParams(@Param("map") Map<String, String> map);

} 
