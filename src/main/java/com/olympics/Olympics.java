package com.olympics;

import com.olympics.abstractfactory.AbstractFactoryTest;
import com.olympics.aop.LogInterceptor;
import com.olympics.basketballscene.BasketballSceneDemo;
import com.olympics.chainofresponsibility.HandlerChain;
import com.olympics.composite.CompositeTest;
import com.olympics.compositeentity.CompositeEntity;
import com.olympics.dependencyinjection.DependencyInjection;
import com.olympics.factory.FactoryTest;
import com.olympics.informationnotice.InformNote;
import com.olympics.interpreter.InterpreterTest;
import com.olympics.repository.Repository;
import com.olympics.specification.SpecificationTest;
import com.olympics.specification.Sport;
import com.olympics.transferobject.TransferObjectPatternDemo;
import com.olympics.visitor.ObjectStructure;

public class Olympics {
    public static String mkTestName(String patternName) {
        return "------现在开始测试" + patternName + "------";
    }

    public static void main(String[] args) {
        System.out.println("动物运动会测试");

        System.out.println(mkTestName("多例模式"));
        // 在这里添加该模式的测试代码

        System.out.println(mkTestName("外观模式"));

        System.out.println(mkTestName("享元模式"));

        System.out.println(mkTestName("备忘录模式"));

        System.out.println(mkTestName("模板模式、单例模式、观察者模式、桥接模式"));
        InformNote.main(args);

        System.out.println(mkTestName("规格模式"));
        SpecificationTest.main(args);

        System.out.println(mkTestName("观察者模式"));

        System.out.println(mkTestName("数据映射模式、流接口模式和封装字段模式"));
        Sport.main(args);

        System.out.println(mkTestName("工厂模式"));
        FactoryTest.main(args);

        System.out.println(mkTestName("抽象工厂模式"));
        AbstractFactoryTest.main(args);

        System.out.println(mkTestName("组合模式"));
        CompositeTest.main(args);

        System.out.println(mkTestName("解释器模式"));
        InterpreterTest.main(args);

        System.out.println(mkTestName("依赖注入模式"));
        DependencyInjection.main(args);

        System.out.println(mkTestName("责任链模式"));
        HandlerChain.main(args);

        System.out.println(mkTestName("访问者模式"));
        ObjectStructure.main(args);

        System.out.println(mkTestName("静态工厂模式, 状态模式, 代理模式, 策略模式"));
        BasketballSceneDemo.main(args);

        System.out.println(mkTestName("建造者模式"));

        // ...

        System.out.println(mkTestName("面向切面编程模式"));
        LogInterceptor.main(args);

        System.out.println(mkTestName("资源库模式"));
        Repository.main(args);

        System.out.println(mkTestName("组合实体模式"));
        CompositeEntity.main(args);

        System.out.println(mkTestName("传输对象模式"));
        TransferObjectPatternDemo.main(args);
    }
}
