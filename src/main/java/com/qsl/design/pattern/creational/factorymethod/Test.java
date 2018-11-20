package com.qsl.design.pattern.creational.factorymethod;

/**
 * 工厂方法测试类
 *
 * @author DanielQSL
 * @date 2018/11/19
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
