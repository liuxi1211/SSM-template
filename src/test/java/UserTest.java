import com.sunline.service.UserService;
import com.sunline.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-config.xml")
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUsers() {
        List<User> users = userService.findAll("123456");
        System.out.println(users);
    }
}
