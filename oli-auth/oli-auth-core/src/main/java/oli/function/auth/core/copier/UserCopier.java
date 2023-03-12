package oli.function.auth.core.copier;

import oli.function.auth.core.req.UserReq;
import oli.function.auth.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Oliver
 * @date 2023年03月12日 18:15
 */
@Mapper
public interface UserCopier {

    // 实例
    UserCopier INSTANCE = Mappers.getMapper(UserCopier.class);

    /**
     * 属性名一样的，会自动映射并填充，属性名不一样的用下面这个 @Mapping 注解，定义映射关系
     * source 为数据来源，target为要填充的目标属性
     */
    User req2Domain(UserReq req);

    List<User> reqs2Domains(List<UserReq> reqs);
}
