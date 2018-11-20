package com.qsl.design.pattern.creational.abstractfactory;

/**
 * @author DanielQSL
 * @date 2018/11/20
 */
public class JavaCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
