package com.yupi.yuojbackendmodel.model.dto.question;

import lombok.Data;

/**
 * @author tangzhen
 * @version 1.0
 * @date 2024/2/25 14:21
 */
@Data
public class JudgeConfig {
    /**
     * 时间限制（ms）
     */
    private int timeLimit;
    /**
     * 内存限制（KB）
     */
    private int memoryLimit;
    /**
     * 栈限制（KB）
     */
    private int stackLimit;
}
