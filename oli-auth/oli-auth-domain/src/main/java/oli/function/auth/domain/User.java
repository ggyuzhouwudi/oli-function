package oli.function.auth.domain;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import oli.function.database.domain.BaseDomain;

/**
 * @author Oliver
 * @date 2023年03月12日 16:48
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("tb_user")
public class User extends BaseDomain {

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 名字
     */
    private String firstname;
    /**
     * 姓
     */
    private String lastname;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 更新时间
     */
    private Long updateTime;
    /**
     * 逻辑删除
     */
    @TableLogic
    private Integer deleted;

}
