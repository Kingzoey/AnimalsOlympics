package com.olympics;

import com.olympics.abstractfactory.AbstractFactoryTest;
import com.olympics.adapter.WaterPoloTraining;
import com.olympics.aop.LogInterceptor;
import com.olympics.basketballscene.BasketballSceneDemo;
import com.olympics.builder.TeamTest;
import com.olympics.businessdelegate.BusinessTest;
import com.olympics.chainofresponsibility.HandlerChain;
import com.olympics.composite.CompositeTest;
import com.olympics.compositeentity.CompositeEntity;
import com.olympics.dataaccessobject.DaoPatternTest;
import com.olympics.decorator.EnhancedGame;
import com.olympics.decorator.WaterPoloGame;
import com.olympics.dependencyinjection.DependencyInjection;
import com.olympics.facade.FacadeTest;
import com.olympics.factory.FactoryTest;
import com.olympics.filter.FilterTest;
import com.olympics.flyweight.ChessTest;
import com.olympics.flyweight.ChessmanTest;
import com.olympics.informationnotice.InformNote;
import com.olympics.interpreter.InterpreterTest;
import com.olympics.iterator.IteratorTest;
import com.olympics.mediator.MediatorTest;
import com.olympics.memento.MementoTest;
import com.olympics.multiton.MultitonTest;
import com.olympics.mvc.MVCPatternDemo;
import com.olympics.nullobject.NullObjectTest;
import com.olympics.prototype.PrototypeTrophy;
import com.olympics.registry.Registry;
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
        MultitonTest.main(args);

        System.out.println(mkTestName("外观模式"));
        FacadeTest.main(args);

        System.out.println(mkTestName("享元模式"));
        ChessTest.main(args);
        ChessmanTest.main(args);

        System.out.println(mkTestName("备忘录模式"));
        MementoTest.main(args);

        System.out.println(mkTestName("模板模式、单例模式、观察者模式、桥接模式"));
        InformNote.main(args);

        System.out.println(mkTestName("规格模式"));
        SpecificationTest.main(args);

        System.out.println(mkTestName("数据映射模式、流接口模式、封装字段模式"));
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
        TeamTest.main(args);

        System.out.println(mkTestName("注册模式"));
        Registry.main(args);

        System.out.println(mkTestName("空对象模式"));
        NullObjectTest.main(args);

        System.out.println(mkTestName("原型模式"));
        PrototypeTrophy.main(args);

        System.out.println(mkTestName("过滤器模式"));
        FilterTest.main(args);

        System.out.println(mkTestName("迭代器模式"));
        IteratorTest.main(args);

        System.out.println(mkTestName("中介者模式"));
        MediatorTest.main(args);

        System.out.println(mkTestName("对象池模式，命令模式"));
        WaterPoloGame.main(args);

        System.out.println(mkTestName("适配器模式"));
        WaterPoloTraining.main(args);

        System.out.println(mkTestName("装饰器模式"));
        EnhancedGame.main(args);
        
        System.out.println(mkTestName("面向切面编程模式"));
        LogInterceptor.main(args);

        System.out.println(mkTestName("资源库模式"));
        Repository.main(args);

        System.out.println(mkTestName("组合实体模式"));
        CompositeEntity.main(args);

        System.out.println(mkTestName("传输对象模式"));
        TransferObjectPatternDemo.main(args);

        System.out.println(mkTestName("模型-视图-控制器模式"));
        MVCPatternDemo.main(args);

        System.out.println(mkTestName("业务代表模式"));
        BusinessTest.main(args);

        System.out.println(mkTestName("数据访问对象模式"));
        DaoPatternTest.main(args);
    }
}
