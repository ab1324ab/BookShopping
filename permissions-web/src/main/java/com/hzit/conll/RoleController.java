package com.hzit.conll;

import com.hzit.dao.entity.Role;
import com.hzit.serv.RoleBiz;
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
public class RoleController {

    @Autowired
    private RoleBiz roleImpl;

    /**
     * 通过查询角色表全部内容的方法，返回Json字符串到页面上
     */
    @RequestMapping("/findroleall")
    @ResponseBody
    public List<Role> fingRoleAll() {
        return roleImpl.findRoleAll();
    }


    /**
     * 通过角色的ID来查询角色表一条数据的全部内容,主要为下面的编辑方法服务
     */
    @RequestMapping("/findrolebyid")
    @ResponseBody
    public String findRoleById(@RequestParam("roleId") Integer roleId, ModelMap modelMap) {


        Role ro = roleImpl.findRoleAllById(roleId);
        modelMap.put("ro", ro);
        return "";//返回JSon字符串到编辑的页面上
    }


    /**
     * 增加角色，返回true或者false，执行增加
     */
    @RequestMapping("/addrole")
    @ResponseBody
    public boolean addRole(Role role) {

        boolean boo = roleImpl.addRole(role);
        return boo;

    }

    /**
     * 增加角色，跳转页面
     */
    @RequestMapping("/toaddrole")
    public String toAddRole(Role role, ModelMap modelMap) {

        List<Role> addList = roleImpl.findRoleAll();
        modelMap.put("addList", addList);

        return "";//返回Json字符串到增加页面上，
    }


    /**
     * 根据角色ID删除角色的方法，返回1或者-1
     */
    @RequestMapping("/delerole")
    public int deleRole(@RequestParam("roleId") Integer roleId) {

        try {
            int num = roleImpl.deleRole(roleId);
            return num;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    /**
     * 角色表 编辑的方法，执行编辑，
     */

    @RequestMapping("/doeditrole")
    @ResponseBody
    public int doEditRole(Role role) {
        try {
            int num = roleImpl.editRole(role);
            return num;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

}
