package com.hzit.serv;

import com.hzit.dao.entity.Role;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface RoleBiz  {
    /**
     * 角色表查询全部的方法
     *
     */
    public List<Role> findRoleAll();

    /**
     * 角色表,根据角色ID,查询全部的方法
     *
     */
    public Role findRoleAllById(Integer roleId);

    /**
     * 角色表，新增的方法
     */

    public boolean addRole(Role role);

    /**
     * 角色表，删除的方法，根据ID删除，
     */
    public int deleRole(Integer roleId);


    /**
     * 角色表，编辑的方法，
     */
    public int editRole(Role role);




}
