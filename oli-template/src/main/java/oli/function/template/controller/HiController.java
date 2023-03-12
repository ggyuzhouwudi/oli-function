package oli.function.template.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import oli.function.common.api.Result;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Oliver
 * @date 2023年03月10日 23:14
 */
@Validated
@RestController
public class HiController {

    @GetMapping("hi")
    public Result<String> get(@Valid @NotNull String abc) {
        return Result.success(abc);
    }
}
