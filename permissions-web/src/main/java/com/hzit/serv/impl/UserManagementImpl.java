package com.hzit.serv.impl;

import com.hzit.dao.entity.User;
import com.hzit.dao.mapper.UserMapper;
import com.hzit.serv.UserManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class UserManagementImpl implements UserManagement{
    @Autowired
    private UserMapper userMapper;
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
