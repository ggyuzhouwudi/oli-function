package oli.function.auth.core.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Oliver
 * @date 2023年03月12日 16:32
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginReq {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
