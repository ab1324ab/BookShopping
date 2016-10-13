package com.hzit.serv;

import com.hzit.dao.entity.User;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface UserManagement {
    boolean addUser(User user);

    int deleteUser(Integer userId);

    int updateUser(User user);
}
