package oli.function.auth.core.service;

import cn.dev33.satoken.stp.SaTokenInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import oli.function.auth.core.req.LoginReq;
import oli.function.auth.core.req.UserReq;
import oli.function.auth.domain.User;
import oli.function.common.api.Result;

/**
 * @author Oliver
 * @date 2023年03月12日 17:22
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     */
    Result<Boolean> register(UserReq req);

    /**
     * 用户登录
     */
    Result<SaTokenInfo> doLogin(LoginReq req);
}
