package com.qsl.design.pattern.behavior.chainofresponsibility;

import org.springframework.stereotype.Component;

/**
 * 第二步的handler
 *
 * @author qianshuailong
 * @date 2021/5/12
 */
@Component
public class SecondStepHandler extends AbstractDoSomethingHandler {

    @Override
    protected Result execute(Request request) {
        System.out.println("第二步处理逻辑");
        return new Result(Boolean.TRUE);
    }

}
