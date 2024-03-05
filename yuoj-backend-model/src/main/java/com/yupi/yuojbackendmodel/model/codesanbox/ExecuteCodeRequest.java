package com.yupi.yuojbackendmodel.model.codesanbox;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author tangzhen
 * @version 1.0
 * @date 2024/3/1 16:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExecuteCodeRequest {
    /**
     * 用户提交的代码
     */
    private String code;
    /**
     * 用户选择的语言
     */
    private String language;
    /**
     * 输入用例
     */
    private List<String> inputList;
}
