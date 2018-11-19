package com.qsl.design.principle.openclose;

/**
 * @author DanielQSL
 * @date 2018/9/20
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "Java设计模式", 348d);
        System.out.println("课程ID：" + javaCourse.getId() + "，课程名称：" + javaCourse.getName() + "，课程价格" + javaCourse.getPrice());
    }
}
