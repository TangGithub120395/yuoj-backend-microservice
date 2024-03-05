package com.yupi.yuojbackendmodel.model.dto.question;

import lombok.Data;

/**
 * @author tangzhen
 * @version 1.0
 * @date 2024/2/25 14:21
 */
@Data
public class JudgeCase {
    /**
     * 输入用例
     */
    private String input;
    /**
     * 输出用例
     */
    private String output;
}
