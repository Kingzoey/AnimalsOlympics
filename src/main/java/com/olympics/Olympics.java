package com.olympics;

import com.olympics.AOP.LogInterceptor;
import com.olympics.AbstractFactory.AbstractFactoryTest;
import com.olympics.BasketballScene.BasketballSceneDemo;
import com.olympics.ChainOfResponsibility.HandlerChain;
import com.olympics.Composite.CompositeTest;
import com.olympics.DependencyInjection.DependencyInjection;
import com.olympics.Repository.Repository;
import com.olympics.Factory.FactoryTest;
import com.olympics.Interpreter.InterpreterTest;
import com.olympics.Visitor.ObjectStructure;
import com.olympics.Visitor.Visitor;

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

        System.out.println(mkTestName("模板模式"));

        System.out.println(mkTestName("单例模式"));

        System.out.println(mkTestName("观察者模式"));

        System.out.println(mkTestName("桥接模式"));

        System.out.println(mkTestName("规格模式"));

        System.out.println(mkTestName("观察者模式"));

        System.out.println(mkTestName("流接口模式"));
        
        System.out.println(mkTestName("工厂模式"));
        FactoryTest.main(null);
        System.out.println(mkTestName("抽象工厂模式"));
        AbstractFactoryTest.main(null);
        System.out.println(mkTestName("组合模式"));
        CompositeTest.main(null);
        System.out.println(mkTestName("解释器模式"));
        InterpreterTest.main(null);
        System.out.println(mkTestName("依赖注入模式"));
        DependencyInjection.main(null);
        
        System.out.println(mkTestName("责任链模式"));
        HandlerChain.main(null);

        System.out.println(mkTestName("访问者模式"));
        ObjectStructure.main(null);

        System.out.println(mkTestName("静态工厂模式, 状态模式, 代理模式, 策略模式"));
        BasketballSceneDemo.main(null);

        System.out.println(mkTestName("建造者模式"));
        
        // ...
        
        System.out.println(mkTestName("面向切面编程模式"));
        LogInterceptor.main(null);
        
        System.out.println(mkTestName("资源库模式"));
        Repository.main(null);
    }
}
