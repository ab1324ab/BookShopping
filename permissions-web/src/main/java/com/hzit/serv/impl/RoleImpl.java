package com.hzit.serv.impl;

import com.hzit.dao.entity.Role;
import com.hzit.dao.mapper.RoleMapper;
import com.hzit.serv.RoleBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class RoleImpl implements RoleBiz {
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 角色表查询全部的方法
     *
     * @return
     */
    @Override
    public List<Role> findRoleAll() {
        return roleMapper.searchRoleByParams(new HashMap());
    }

    /**
     * 角色表，根据角色ID查询全部的方法
     *
     * @return
     */
    @Override
    public Role findRoleAllById(@RequestParam(name = "roleId") Integer roleId) {

        Map<String, String> p = new HashMap<String, String>();
        p.put("roleId", roleId + "");

        List<Role> list = roleMapper.searchRoleByParams(p);

        if (list.size() == 1) {
            return list.get(0);
        }
        return null;

    }

    /**
     * 角色表 增加角色的方法
     * @return
     */
    @Override
    public boolean addRole(Role role) {

        try {
            roleMapper.insertRole(role);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public int deleRole(Integer roleId) {

        try {

          int num=  roleMapper.deleteRoleByRoleId(roleId);
            return num;//num应该是1
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    /**
     * 根据ID来编辑 角色

     * @return
     */
    @Override
    public int editRole(Role role) {

        try {
            int num= roleMapper.updateRole(role);
            return num;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }
}
