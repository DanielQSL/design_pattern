package com.qsl.design.pattern.behavior.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 响应结果
 *
 * @author qianshuailong
 * @date 2021/5/11
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result {

    /**
     * 处理结果
     */
    private Boolean success;

    /**
     * 是否执行下一个handler
     */
    private Boolean doNext = true;

    public Result(Boolean success) {
        this.success = success;
    }

}
