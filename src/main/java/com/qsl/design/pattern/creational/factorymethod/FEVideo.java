package com.qsl.design.pattern.creational.factorymethod;

/**
 * @author DanielQSL
 * @date 2018/11/20
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制前端视频");
    }
}
