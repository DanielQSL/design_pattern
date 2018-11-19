package com.qsl.design.pattern.creational.simplefactory;

/**
 * @author DanielQSL
 * @date 2018/9/20
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制java课程视频");
    }
}
