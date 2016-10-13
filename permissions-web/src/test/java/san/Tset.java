package san;

import com.hzit.Applicatio;
import com.hzit.dao.entity.User;
import com.hzit.serv.impl.UserManagementImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Applicatio.class)
public class Tset {
    @Autowired
    private UserManagementImpl userManagementImpl;
    @Test
    public void addUser(){
        User u=new User();
        u.setUserName("ss");
        u.setUserPwd("ss");
        userManagementImpl.addUser(u);
    }
}
