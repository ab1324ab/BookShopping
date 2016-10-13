package com.hzit.dao.entity;

/**
 * 
 * @author HOU
 */
public class Rolemodule {
	/**
	 *  关联ID
	 */
	private Integer assId;
	/**
	 *  角色ID
	 */
	private Integer roleId;
	/**
	 *  模块ID
	 */
	private Integer moduleId;
	/**
	 * 关联ID
	 * @param assId
	 */
	public void setAssId(Integer assId){
		this.assId = assId;
	}
	
    /**
     * 关联ID
     * @return
     */	
    public Integer getAssId(){
    	return assId;
    }
	/**
	 * 角色ID
	 * @param roleId
	 */
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}
	
    /**
     * 角色ID
     * @return
     */	
    public Integer getRoleId(){
    	return roleId;
    }
	/**
	 * 模块ID
	 * @param moduleId
	 */
	public void setModuleId(Integer moduleId){
		this.moduleId = moduleId;
	}
	
    /**
     * 模块ID
     * @return
     */	
    public Integer getModuleId(){
    	return moduleId;
    }
}