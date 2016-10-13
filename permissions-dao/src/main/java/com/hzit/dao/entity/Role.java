package com.hzit.dao.entity;

/**
 * 
 * @author HOU
 */
public class Role {
	/**
	 *  角色ID
	 */
	private Integer roleId;
	/**
	 *  角色名
	 */
	private String roleName;
	/**
	 *  角色描述
	 */
	private String roleDepict;
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
	 * 角色名
	 * @param roleName
	 */
	public void setRoleName(String roleName){
		this.roleName = roleName;
	}
	
    /**
     * 角色名
     * @return
     */	
    public String getRoleName(){
    	return roleName;
    }
	/**
	 * 角色描述
	 * @param roleDepict
	 */
	public void setRoleDepict(String roleDepict){
		this.roleDepict = roleDepict;
	}
	
    /**
     * 角色描述
     * @return
     */	
    public String getRoleDepict(){
    	return roleDepict;
    }
}