package hou;

import com.hzit.Applicatio;
import com.hzit.serv.UserLogin;
import com.sun.xml.internal.ws.api.server.InstanceResolverAnnotation;
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
public class TestHou {
    @Autowired
    UserLogin userLogin;
    @Test
    public void jj(){
        userLogin.login("1","1");
    }
}
