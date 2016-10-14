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
    /*
   * 显示所有用户到页面
   * */
    @RequestMapping("/finduserall")
    public String findUser(ModelMap modelMap){
        List<User> list=userManagementImpl.findAllUser();
        modelMap.put("list",list);
        return "userindex";
    }
    /*
    * 增加用户，返回Json字符串
    * */
    @RequestMapping("/adduser")
    @ResponseBody
    public boolean addUser(User user){
        boolean b=userManagementImpl.addUser(user);
        return b;
    }
    //增加跳转页面
    @RequestMapping("/toadduser")
    public String addUser(){
        return "adduser";
    }

    /*
    * 删除用户
    * */
    @RequestMapping("/deluser")
    @ResponseBody
    public int deleteUser(@RequestParam("userId")Integer userId){
        int i=userManagementImpl.deleteUser(userId);
        return i;
    }

    /*
    * 修改用户，返回Json字符串
    * */
    @RequestMapping("/updateu")
    @ResponseBody
    public int updateUser(User user){
        int i=userManagementImpl.updateUser(user);
        return i;
    }
    //编辑跳转页面
    @RequestMapping("/toupdateu")
    public String findUser(@RequestParam("userid")Integer userid,ModelMap modelMap){
        User u=userManagementImpl.findOne(userid);
        modelMap.put("user",u);
        List<User> ulist=userManagementImpl.findAllUser();
        modelMap.put("ulist",ulist);
        return "";
    }

}


