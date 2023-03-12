package oli.function.database.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Oliver
 * @date 2023年03月10日 12:57 PM
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class ModifyDomain extends BaseDomain {
    /**
     * 创建用户
     */
    private Long creator;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新用户
     */
    private Long updater;

    /**
     * 更新时间
     */
    private Long updateTime;
}
