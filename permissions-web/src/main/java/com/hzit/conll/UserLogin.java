package com.hzit.conll;

/**
 * Created by Administrator on 2016/10/13.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserLogin {
    @Autowired
    com.hzit.serv.UserLogin userLogin;
    @RequestMapping("/Longin")
    public String login(@RequestParam(name = "Username",defaultValue = "")String user,@RequestParam(name = "Password",defaultValue = "")String pwd){
        userLogin.login(user,pwd);
        return "redirect:/login.html";
    }
}
