package com.qsl.design.pattern.behavior.chainofresponsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 业务逻辑责任链条
 *
 * @author qianshuailong
 * @date 2021/5/12
 */
@Component
public class DoSomethingChainFactory {

    @Autowired
    private FirstStepHandler firstStepHandler;

    @Autowired
    private SecondStepHandler secondStepHandler;

    @Autowired
    private ThirdStepHandler thirdStepHandler;

    /**
     * 构造函数
     * 组装责任链条
     */
    public DoSomethingChainFactory() {
        firstStepHandler.setNextHandler(secondStepHandler);
        secondStepHandler.setNextHandler(thirdStepHandler);
    }

    /**
     * 创建业务逻辑handler链条
     *
     * @return handler链条
     */
    public AbstractDoSomethingHandler getHandlerChain() {
        return firstStepHandler;
    }

}
