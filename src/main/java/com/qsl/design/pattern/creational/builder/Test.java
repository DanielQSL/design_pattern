package com.qsl.design.pattern.creational.builder;

/**
 * （链式调用）
 *
 * @author DanielQSL
 * @date 2018/11/20
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActuallyBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        coach.makeCourse("设计模式", "设计模式PPT",
                "设计模式视频", "设计模式手记",
                "设计模式问答");

    }
}
