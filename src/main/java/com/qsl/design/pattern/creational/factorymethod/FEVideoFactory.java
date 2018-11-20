package com.qsl.design.pattern.creational.factorymethod;

/**
 * @author DanielQSL
 * @date 2018/11/20
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
