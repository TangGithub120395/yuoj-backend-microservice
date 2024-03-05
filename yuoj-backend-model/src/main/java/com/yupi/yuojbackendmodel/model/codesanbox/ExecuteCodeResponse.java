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
public class ExecuteCodeResponse {
    /**
     * 接口信息
     */
    private String message;
    /**
     * 执行结果
     */
    private JudgeInfo judgeInfo;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 输出用例
     */
    private List<String> outputList;
}
