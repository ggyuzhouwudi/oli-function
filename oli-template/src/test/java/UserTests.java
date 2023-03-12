import jakarta.annotation.Resource;
import oli.function.auth.core.mapper.UserMapper;
import oli.function.auth.domain.User;
import oli.function.template.TemplateApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author Oliver
 * @date 2023年03月12日 17:27
 */
@SpringBootTest(classes = TemplateApplication.class)
public class UserTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void get() {
        List<User> users = userMapper.selectList(null);
        System.out.println("users = " + users);
    }
}
