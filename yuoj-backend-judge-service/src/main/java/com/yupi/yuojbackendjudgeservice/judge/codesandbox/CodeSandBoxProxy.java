package com.yupi.yuojbackendjudgeservice.judge.codesandbox;

import com.yupi.yuojbackendmodel.model.codesanbox.ExecuteCodeRequest;
import com.yupi.yuojbackendmodel.model.codesanbox.ExecuteCodeResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author tangzhen
 * @version 1.0
 * @date 2024/3/1 16:33
 */
@RequiredArgsConstructor
@Slf4j
public class CodeSandBoxProxy implements CodeSandBox {
    private final CodeSandBox codeSandBox;

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("提交给代码沙箱的数据信息" + executeCodeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandBox.executeCode(executeCodeRequest);
        log.info("代码沙箱响应的数据信息" + executeCodeResponse.toString());
        return executeCodeResponse;
    }
}
