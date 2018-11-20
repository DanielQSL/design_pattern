package com.qsl.design.pattern.creational.builder;

/**
 * 建造者模式
 *
 * 适用场景：有一个相对复杂的内部结构，并且想把复杂对象的创建和使用分离，流程相对固定
 * 优点：1、封装性好，创建和使用分离，使得客户端不必知道产品内部组成的细节。
 *      2、扩展性好、建造者类之间独立，在一定程度上解耦
 * 缺点：1、会产生多余的builder对象
 *      2、产品内部发生变化，建造者都要修改，成本较大
 * 与工厂模式的区别：建造者模式更注重方法的调用顺序，工厂模式更注重于创建产品
 * @author DanielQSL
 * @date 2018/11/20
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    /**
     * 制作过程
     * @return
     */
    public abstract Course makeCourse();

}
