package com.hzit.dao.mapper;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import com.hzit.dao.entity.Module;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ModuleMapper {

	void insertModule(Module module);

	int deleteModuleByModuleId(Integer moduleId);

	int updateModule(Module module);

	Page<Module> searchModuleByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Module> searchModuleByParams(@Param("map") Map<String, String> map);



} 
