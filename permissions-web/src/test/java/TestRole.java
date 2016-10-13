import com.hzit.Applicatio;
import com.hzit.dao.entity.Role;
import com.hzit.serv.impl.RoleImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = Applicatio.class)
public class TestRole {
    @Autowired
    private RoleImpl roleImpl;

    /**
     * 查询角色信息表的全部内容 测试
     */
    @Test
    public void roleFindAll() {

        List<Role> list = roleImpl.findRoleAll();
        for (Role r : list) {

            System.out.println(r);
        }

    }

    /**
     * 查询角色信息表的全部内容 测试
     */
    @Test
    public void findroleAllById() {

        Role ro = roleImpl.findRoleAllById(1);
        System.out.println(ro);

    }

    /**
     * 新增角色的测试
     */
    @Test
    public void addRole() {
        Role ro = new Role();
        ro.setRoleName("测试1");
        ro.setRoleDepict("测试能不能成功");
        roleImpl.addRole(ro);

    }

    /**
     * 删除角色的测试
     */
    @Test
    public void deleRole() {

        int num = roleImpl.deleRole(2);
        System.out.println(num);
    }

    /**
     * 根据ID编辑角色的测试
     */
    @Test
    public void editRole() {
        Role role = new Role();
        role.setRoleId(3);
        role.setRoleDepict("测试编辑");
        role.setRoleName("编辑");
        int num = roleImpl.editRole(role);
        System.out.println(num);
    }

}
