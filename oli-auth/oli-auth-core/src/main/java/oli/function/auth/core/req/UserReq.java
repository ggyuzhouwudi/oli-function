package oli.function.auth.core.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Oliver
 * @date 2023年03月12日 17:24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {
    /**
     * 用户名
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 名
     */
    private String firstname;
    /**
     * 姓
     */
    private String lastname;
    /**
     * 邮件
     */
    private String email;
}
