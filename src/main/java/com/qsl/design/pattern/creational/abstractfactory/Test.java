package com.qsl.design.pattern.creational.abstractfactory;

/**
 * @author DanielQSL
 * @date 2018/11/20
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory=new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        article.produce();
        video.produce();
    }
}
