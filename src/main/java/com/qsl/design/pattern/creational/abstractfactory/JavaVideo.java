package com.qsl.design.pattern.creational.abstractfactory;

/**
 * @author DanielQSL
 * @date 2018/11/20
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
