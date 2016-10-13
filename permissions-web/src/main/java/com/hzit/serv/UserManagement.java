package com.hzit.serv;

import com.hzit.dao.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface UserManagement {
    List<User> findAllUser();

    User findOne(Integer userId);

    boolean addUser(User user);

    int deleteUser(Integer userId);

    int updateUser(User user);
}
