package com.yupi.yuojbackendjudgeservice.judge.codesandbox.impl;

import com.yupi.yuojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.yupi.yuojbackendmodel.model.codesanbox.ExecuteCodeRequest;
import com.yupi.yuojbackendmodel.model.codesanbox.ExecuteCodeResponse;

/**
 * @author tangzhen
 * @version 1.0
 * @date 2024/3/1 16:23
 */
public class ExampleCodeSandBoxImpl implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("实例代码沙箱");
        return null;
    }
}
