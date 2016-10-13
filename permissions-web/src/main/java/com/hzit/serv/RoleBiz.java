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
}
