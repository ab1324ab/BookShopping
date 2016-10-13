package com.hzit.serv.impl;

import com.hzit.dao.entity.User;
import com.hzit.dao.mapper.UserMapper;
import com.hzit.serv.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class UserLoginImpl implements UserLogin{
    public UserLoginImpl(){
        System.out.println("我出书了");
    }
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(String username, String userpassword) {
        Map map=new HashMap();
        map.put("userName",username);
        map.put("userPwd",userpassword);
        List<User> userList=userMapper.searchUserByParams(map);
        if(userList.size()!=0)
        return userList.get(0);
        return null;
    }
}
