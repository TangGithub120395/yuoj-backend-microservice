package com.yupi.yuojbackendjudgeservice.judge;


import com.yupi.yuojbackendmodel.model.entity.QuestionSubmit;

/**
 * @author tangzhen
 * @version 1.0
 * @date 2024/3/2 13:19
 */
public interface JudgeService {
    public QuestionSubmit doJudge(long questionSubmitId);
}
