package com.hzit.serv.impl;

import com.hzit.dao.entity.Role;
import com.hzit.dao.mapper.RoleMapper;
import com.hzit.serv.RoleBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class RoleImpl implements RoleBiz {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> findRoleAll() {
        return roleMapper.searchRoleByParams(new HashMap());
    }
}
