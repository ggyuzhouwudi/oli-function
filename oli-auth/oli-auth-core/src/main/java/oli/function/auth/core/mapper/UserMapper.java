package oli.function.auth.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import oli.function.auth.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Oliver
 * @date 2023年03月12日 17:11
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
