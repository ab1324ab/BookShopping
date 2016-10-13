package com.hzit;

import com.hzit.serv.UserLogin;
import com.hzit.serv.impl.UserLoginImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/10/13.
 */
@SpringBootApplication
@MapperScan("com.hzit.dao.mapper")
@ComponentScan({"com.hzit.conll","com.hzit.serv","com.fc"})
public class Applicatio extends SpringBootServletInitializer{


   /* public static void main(String[] args) {
        UserLogin userLogin=new UserLoginImpl();
        userLogin.login("1","1");
    }*/
}
