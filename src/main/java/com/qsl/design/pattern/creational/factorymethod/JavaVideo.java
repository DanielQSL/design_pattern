package com.qsl.design.pattern.creational.factorymethod;

/**
 * @author DanielQSL
 * @date 2018/11/19
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制java课程视频");
    }
}
