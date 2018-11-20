package com.qsl.design.pattern.creational.abstractfactory;

/**
 * @author DanielQSL
 * @date 2018/11/20
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("写Java手记");
    }
}
