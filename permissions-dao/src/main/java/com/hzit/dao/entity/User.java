package com.hzit.dao.entity;

/**
 * 
 * @author HOU
 */
public class User {
	/**
	 *  用户ID
	 */
	private Integer userId;
	/**
	 *  用户名
	 */
	private String userName;
	/**
	 *  用户密码
	 */
	private String userPwd;
	/**
	 *  角色ID
	 */
	private Integer roleId;
	/**
	 * 用户ID
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 用户ID
     * @return
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 用户名
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 用户名
     * @return
     */	
    public String getUserName(){
    	return userName;
    }
	/**
	 * 用户密码
	 * @param userPwd
	 */
	public void setUserPwd(String userPwd){
		this.userPwd = userPwd;
	}
	
    /**
     * 用户密码
     * @return
     */	
    public String getUserPwd(){
    	return userPwd;
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
}