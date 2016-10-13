package com.hzit.conll;

import com.hzit.dao.entity.User;
import com.hzit.serv.impl.UserManagementImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
@Controller
public class UserControl {
    @Autowired
    private UserManagementImpl userManagementImpl;

    @RequestMapping("/addu")
    @ResponseBody
    public boolean addUser(User user){
        boolean b=userManagementImpl.addUser(user);
        return b;
    }
    @RequestMapping("/toadd")
    @ResponseBody
    public String addUser(ModelMap modelMap){
        List<User> list=userManagementImpl.findAllUser();
        modelMap.put("list",list);
        return "";
    }
    @RequestMapping("/deleteu")
    public String deleteUser(@RequestParam("userId")Integer userId){
        userManagementImpl.deleteUser(userId);
        return "";
    }
    @RequestMapping("/updateu")
    @ResponseBody
    public int updateUser(User user){
        int i=userManagementImpl.updateUser(user);
        return i;
    }
    @RequestMapping("/toupdate")
    public String findUser(@RequestParam("userid")Integer userid,ModelMap modelMap){
        User u=userManagementImpl.findOne(userid);
        modelMap.put("user",u);
        List<User> ulist=userManagementImpl.findAllUser();
        modelMap.put("ulist",ulist);
        return "";
    }
}


