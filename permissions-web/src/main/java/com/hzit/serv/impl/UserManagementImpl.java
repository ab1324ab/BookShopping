package com.hzit.serv.impl;

import com.hzit.dao.entity.User;
import com.hzit.dao.mapper.UserMapper;
import com.hzit.serv.UserManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class UserManagementImpl implements UserManagement{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        List<User> list=userMapper.searchUserByParams(null);
        return list;
    }

    @Override
    public User findOne(Integer userId) {
        Map m=new HashMap();
        m.put("userId",userId);
        List<User> list=userMapper.searchUserByParams(m);
        if(list.size()==1)
            return list.get(0);
        else
            return null;
    }

    @Override
    public boolean addUser(User user) {
        try{
            userMapper.insertUser(user);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public int deleteUser(Integer userId) {
        int i=userMapper.deleteUserByUserId(userId);
        return i;
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
