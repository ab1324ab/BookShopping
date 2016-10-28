package com.hzit.vo;

/**
 * 
 * @author HOU
 */
public class ModuleVo {
	/**
	 * 描述模块是否被选中的属性
	 */
	private boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 *  模块id
	 */
	private Integer moduleId;
	/**
	 *  模块名
	 */
	private String moduleName;
	/**
	 *  模块级别
	 */
	private Integer moduleLevel;
	/**
	 *  父模块ID
	 */
	private Integer moduleParentId;
	/**
	 *  模块地址
	 */
	private String moduleurl;
	/**
	 *  是否有子模块
	 */
	private String moduleChildren;
	/**
	 *  模块序号
	 */
	private Integer moduleOrder;
	/**
	 * 模块id
	 * @param moduleId
	 */
	public void setModuleId(Integer moduleId){
		this.moduleId = moduleId;
	}
	
    /**
     * 模块id
     * @return Integer
     */	
    public Integer getModuleId(){
    	return moduleId;
    }
	/**
	 * 模块名
	 * @param moduleName
	 */
	public void setModuleName(String moduleName){
		this.moduleName = moduleName;
	}
	
    /**
     * 模块名
     * @return String
     */	
    public String getModuleName(){
    	return moduleName;
    }
	/**
	 * 模块级别
	 * @param moduleLevel
	 */
	public void setModuleLevel(Integer moduleLevel){
		this.moduleLevel = moduleLevel;
	}
	
    /**
     * 模块级别
     * @return Integer
     */	
    public Integer getModuleLevel(){
    	return moduleLevel;
    }
	/**
	 * 父模块ID
	 * @param moduleParentId
	 */
	public void setModuleParentId(Integer moduleParentId){
		this.moduleParentId = moduleParentId;
	}
	
    /**
     * 父模块ID
     * @return Integer
     */	
    public Integer getModuleParentId(){
    	return moduleParentId;
    }
	/**
	 * 模块地址
	 * @param moduleurl
	 */
	public void setModuleurl(String moduleurl){
		this.moduleurl = moduleurl;
	}
	
    /**
     * 模块地址
     * @return String
     */	
    public String getModuleurl(){
    	return moduleurl;
    }
	/**
	 * 是否有子模块
	 * @param moduleChildren
	 */
	public void setModuleChildren(String moduleChildren){
		this.moduleChildren = moduleChildren;
	}
	
    /**
     * 是否有子模块
     * @return String
     */	
    public String getModuleChildren(){
    	return moduleChildren;
    }
	/**
	 * 模块序号
	 * @param moduleOrder
	 */
	public void setModuleOrder(Integer moduleOrder){
		this.moduleOrder = moduleOrder;
	}
	
    /**
     * 模块序号
     * @return Integer
     */	
    public Integer getModuleOrder(){
    	return moduleOrder;
    }
}