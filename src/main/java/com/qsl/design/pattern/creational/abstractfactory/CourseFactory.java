package com.qsl.design.pattern.creational.abstractfactory;

/**
 * 抽象工厂方法
 * 应用层代码不与具体的产品发生依赖，横向扩展性好
 * 适用场景：用于同一产品族，产品等级相对固定
 * 缺点：当要新增产品等级时改动较大，违背开闭原则，纵向升级复杂。若是频繁改动，则不适用（若偶尔改动，是可以的）。
 *
 * @author DanielQSL
 * @date 2018/11/20
 */
public interface CourseFactory {
    Video getVideo();

    Article getArticle();
}
