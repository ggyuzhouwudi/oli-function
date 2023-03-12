package oli.function.template.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

/**
 * @author Oliver
 * @date 2023年03月12日 16:23
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AbcRequest {

    @Min(value = 2)
    private Integer i;

    @NotEmpty(message = "abc不能为空")
    private String abc;

    @NonNull
    private Object object;
}
