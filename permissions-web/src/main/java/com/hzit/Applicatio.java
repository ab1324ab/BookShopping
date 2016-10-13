package com.hzit;

import org.mybatis.spring.annotation.MapperScan;
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


}
