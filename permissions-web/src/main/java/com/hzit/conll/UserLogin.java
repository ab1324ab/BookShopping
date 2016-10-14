package com.hzit.conll;

/**
 * Created by Administrator on 2016/10/13.
 */

import com.hzit.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserLogin {
    @Autowired
    com.hzit.serv.UserLogin userLogin;
    @RequestMapping("/Longin")
    public String login(@RequestParam(name = "Username",defaultValue = "")String user, @RequestParam(name = "Password",defaultValue = "")String pwd, HttpSession session){
        if("".equals(user)|"".equals(pwd)){return "redirect:/LonginJson";}
        User userl=userLogin.login(user,pwd);
        if (userl!=null){
            session.setAttribute("user",userl);
            return "redirect:/index.jsp?target=_blank";
        }
        return "redirect:/LonginJson";
    }

    @RequestMapping("/LonginJson")
    @ResponseBody
    public String loginJson(){
        return "错误";
    }
}
