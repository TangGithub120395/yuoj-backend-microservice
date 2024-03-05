package com.yupi.yuojbackendmodel.model.codesanbox;

/**
 * @author tangzhen
 * @version 1.0
 * @date 2024/2/25 14:45
 */

import lombok.Data;

/**
 * 判题信息
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;
    /**
     * 消耗时间(ms)
     */
    private Long time;
    /**
     * 消耗内存(kb)
     */
    private Long memory;
}
