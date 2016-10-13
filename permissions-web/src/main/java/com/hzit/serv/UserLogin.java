package com.hzit.serv;

import com.hzit.dao.entity.User;
import com.hzit.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public interface UserLogin {
    /**
     * 登录的方法
     */
    User login(String username,String userpassword);

}
