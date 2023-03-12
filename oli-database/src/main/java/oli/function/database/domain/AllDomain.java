package oli.function.database.domain;

import com.baomidou.mybatisplus.annotation.TableLogic;
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
public abstract class AllDomain extends ModifyDomain {
    /**
     * 是否已删除
     */
    @TableLogic
    private Integer deleted;
}
