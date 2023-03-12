import jakarta.annotation.Resource;
import oli.function.auth.core.AuthApplication;
import oli.function.auth.core.copier.UserCopier;
import oli.function.auth.core.mapper.UserMapper;
import oli.function.auth.core.req.UserReq;
import oli.function.auth.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author Oliver
 * @date 2023年03月12日 17:27
 */
@SpringBootTest(classes = AuthApplication.class)
public class User11Tests {

    @Resource
    private UserMapper userMapper;

    @Test
    void get() {
        List<User> users = userMapper.selectList(null);
        System.out.println("users = " + users);
    }
    @Test
    void copier() {
        UserReq req = new UserReq();
        req.setId(1L);
        req.setUsername("username");
        User user = UserCopier.INSTANCE.req2Domain(req);
        System.out.println("user = " + user);
    }
}
