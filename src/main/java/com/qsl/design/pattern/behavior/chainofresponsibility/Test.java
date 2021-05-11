package com.qsl.design.pattern.behavior.chainofresponsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 责任链模式
 *
 * @author qianshuailong
 * @date 2021/5/11
 */
@Service
public class Test {

    @Autowired
    private DoSomethingChainFactory doSomethingChainFactory;

    public void test() {
        Request request = new Request();
        AbstractDoSomethingHandler handlerChain = doSomethingChainFactory.getHandlerChain();
        handlerChain.doExecute(request);
    }

}
