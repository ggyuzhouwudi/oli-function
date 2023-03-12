package oli.function.auth.core.service.impl;

import cn.dev33.satoken.stp.SaTokenInfo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.NonNull;
import oli.function.auth.core.mapper.UserMapper;
import oli.function.auth.core.req.LoginReq;
import oli.function.auth.core.req.UserReq;
import oli.function.auth.core.service.UserService;
import oli.function.auth.domain.User;
import oli.function.common.api.Result;
import org.springframework.stereotype.Service;

/**
 * @author Oliver
 * @date 2023年03月12日 17:23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public Result<Boolean> register(@NonNull UserReq req) {
        return null;
    }

    @Override
    public Result<SaTokenInfo> doLogin(LoginReq req) {
        return null;
    }
}
