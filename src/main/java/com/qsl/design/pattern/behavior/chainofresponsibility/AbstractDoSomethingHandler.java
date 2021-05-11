package com.qsl.design.pattern.behavior.chainofresponsibility;

import java.util.Objects;

/**
 * 业务逻辑处理Handler的抽象类
 *
 * @author qianshuailong
 * @date 2021/5/11
 */
public abstract class AbstractDoSomethingHandler {

    /**
     * 下一个处理者
     */
    private AbstractDoSomethingHandler nextHandler;

    /**
     * 设置下一个处理者
     *
     * @param nextHandler 下一个处理者
     */
    public void setNextHandler(AbstractDoSomethingHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 执行下一个处理器
     *
     * @param request 请求参数
     * @return 是否处理成功
     */
    public final boolean doExecute(Request request) {
        Result result = execute(request);
        if (Objects.nonNull(nextHandler) && result.getDoNext()) {
            return nextHandler.doExecute(request);
        } else {
            return result.getSuccess();
        }
    }


    /**
     * 执行处理逻辑
     *
     * @param request 请求参数
     * @return 处理结果
     */
    protected abstract Result execute(Request request);

}
