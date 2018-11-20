package com.qsl.design.pattern.creational.factorymethod;

/**
 * 工厂方法
 * 将具体实现方法交由子类,便于同级扩展
 * 适用场景：属于同一产品等级
 * @author DanielQSL
 * @date 2018/11/19
 */
public abstract class VideoFactory {

    public abstract Video getVideo();

}
