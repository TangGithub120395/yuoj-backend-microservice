package com.yupi.yuojbackendjudgeservice.judge.codesandbox;


import com.yupi.yuojbackendjudgeservice.judge.codesandbox.impl.ExampleCodeSandBoxImpl;
import com.yupi.yuojbackendjudgeservice.judge.codesandbox.impl.RemoteCodeSandBoxImpl;
import com.yupi.yuojbackendjudgeservice.judge.codesandbox.impl.ThirdPartCodeSandBoxImpl;

/**
 * @author tangzhen
 * @version 1.0
 * @date 2024/3/1 16:28
 */
public class CodeSandBoxFactory {
    public static CodeSandBox getCodeSandBox(String type){
        CodeSandBox codeSandBox = null;
        if("remote".equals(type)){
            codeSandBox = new RemoteCodeSandBoxImpl();
        }else if("thirdPart".equals(type)){
            codeSandBox = new ThirdPartCodeSandBoxImpl();
        }else if("example".equals(type)){
            codeSandBox = new ExampleCodeSandBoxImpl();
        }
        return codeSandBox;
    }
}
