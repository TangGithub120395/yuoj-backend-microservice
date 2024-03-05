package com.yupi.yuojbackendjudgeservice.judge.strategy;


import com.yupi.yuojbackendmodel.model.codesanbox.JudgeInfo;

/**
 * @author tangzhen
 * @version 1.0
 * @date 2024/3/2 13:53
 */
public interface JudgeStrategy {
    /**
     * 根据代码沙箱返回的执行结果，判断执行结果是否符合要求
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
