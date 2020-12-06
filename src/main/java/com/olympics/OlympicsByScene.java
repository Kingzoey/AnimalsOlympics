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
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class OlympicsByScene {
    public static ArrayList<Runnable> patterns = new ArrayList<>();

    /**
     * 获取某包下所有类
     *
     * @param packageName  包名
     * @param childPackage 是否遍历子包
     * @return 类的完整名称
     */
    public static List<String> getClassName(String packageName, boolean childPackage) {
        List<String> fileNames = null;
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        String packagePath = packageName.replace(".", "/");
        URL url = loader.getResource(packagePath);
        if (url != null) {
            String type = url.getProtocol();
            if (type.equals("file")) {
                fileNames = getClassNameByFile(url.getPath(), null, childPackage);
            } else if (type.equals("jar")) {
                fileNames = getClassNameByJar(url.getPath(), childPackage);
            }
        } else {
            fileNames = getClassNameByJars(((URLClassLoader) loader).getURLs(), packagePath, childPackage);
        }
        return fileNames;
    }

    /**
     * 从jar获取某包下所有类
     *
     * @param jarPath      jar文件路径
     * @param childPackage 是否遍历子包
     * @return 类的完整名称
     */
    private static List<String> getClassNameByJar(String jarPath, boolean childPackage) {
        List<String> myClassName = new ArrayList<String>();
        String[] jarInfo = jarPath.split("!");
        String jarFilePath = jarInfo[0].substring(jarInfo[0].indexOf("/"));
        String packagePath = jarInfo[1].substring(1);
        try {
            JarFile jarFile = new JarFile(jarFilePath);
            Enumeration<JarEntry> entrys = jarFile.entries();
            while (entrys.hasMoreElements()) {
                JarEntry jarEntry = entrys.nextElement();
                String entryName = jarEntry.getName();
                if (entryName.endsWith(".class")) {
                    if (childPackage) {
                        if (entryName.startsWith(packagePath)) {
                            entryName = entryName.replace("/", ".").substring(0, entryName.lastIndexOf("."));
                            myClassName.add(entryName);
                        }
                    } else {
                        int index = entryName.lastIndexOf("/");
                        String myPackagePath;
                        if (index != -1) {
                            myPackagePath = entryName.substring(0, index);
                        } else {
                            myPackagePath = entryName;
                        }
                        if (myPackagePath.equals(packagePath)) {
                            entryName = entryName.replace("/", ".").substring(0, entryName.lastIndexOf("."));
                            myClassName.add(entryName);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return myClassName;
    }

    /**
     * 从所有jar中搜索该包，并获取该包下所有类
     *
     * @param urls         URL集合
     * @param packagePath  包路径
     * @param childPackage 是否遍历子包
     * @return 类的完整名称
     */
    private static List<String> getClassNameByJars(URL[] urls, String packagePath, boolean childPackage) {
        List<String> myClassName = new ArrayList<String>();
        if (urls != null) {
            for (int i = 0; i < urls.length; i++) {
                URL url = urls[i];
                String urlPath = url.getPath();
                // 不必搜索classes文件夹  
                if (urlPath.endsWith("classes/")) {
                    continue;
                }
                String jarPath = urlPath + "!/" + packagePath;
                myClassName.addAll(getClassNameByJar(jarPath, childPackage));
            }
        }
        return myClassName;
    }

    /**
     * 从项目文件获取某包下所有类
     *
     * @param filePath     文件路径
     * @param className    类名集合
     * @param childPackage 是否遍历子包
     * @return 类的完整名称
     */
    private static List<String> getClassNameByFile(String filePath, List<String> className, boolean childPackage) {
        List<String> myClassName = new ArrayList<String>();
        File file = new File(filePath);
        File[] childFiles = file.listFiles();
        for (File childFile : childFiles) {
            if (childFile.isDirectory()) {
                if (childPackage) {
                    myClassName.addAll(getClassNameByFile(childFile.getPath(), myClassName, childPackage));
                }
            } else {
                String childFilePath = childFile.getPath();
                if (childFilePath.endsWith(".class")) {
                    childFilePath = childFilePath.substring(childFilePath.indexOf("\\classes") + 9, childFilePath.lastIndexOf("."));
                    childFilePath = childFilePath.replace("\\", ".");
                    myClassName.add(childFilePath);
                }
            }
        }

        return myClassName;
    }

    public static void red(String s) {
        System.out.println(Ansi.ansi().fgRed().a(s).reset().toString());
    }

    public static void green(String s) {
        System.out.println(Ansi.ansi().fgGreen().a(s).reset().toString());
    }

    public static void blue(String s) {
        System.out.println(Ansi.ansi().fgBlue().a(s).reset().toString());
    }

    public static void startblue() {
        System.out.print(Ansi.ansi().fgBlue().toString());
    }

    public static void startred() {
        System.out.print(Ansi.ansi().fgRed().toString());
    }

    public static void startgreen() {
        System.out.print(Ansi.ansi().fgGreen().toString());
    }

    public static void reset() {
        System.out.print(Ansi.ansi().reset().toString());
    }

    public static void space() {
        System.out.println();
    }

    public static void cont() {
        String string = new Scanner(System.in).nextLine();
        if (string.equals("")) {
            return;
        }
    }

    public static void sceneName(String s) {
        space();
        green("[场景切换] >>> " + s);
    }

    public static Boolean first = true;

    public static void patternName(String s) {
        if (!first) {
            red("继续测试下一个模式? (按回车键继续)");
            cont();
        }
        first = false;
        blue(s);
    }

    public static void LeisureScene() {
        sceneName("运动会中场休息场景");

        patternName("[Facade/外观模式] 运动员可在商场进行休闲娱乐，可选择餐厅用餐、影院观影、超市购物三种功能");
        FacadeTest.main(null);

        patternName("[Business Delegate/业务代表模式] 运动员可以向前台发送请求");
        BusinessTest.main(null);
    }

    public static void BasketballScene() {
        sceneName("现在进入篮球比赛场景");
        patternName("[Factory/工厂模式] 为篮球比赛的的比赛双方增加队员");
        FactoryTest.main(null);
        AbstractFactoryTest.main(null);

        patternName("[Static Factory/静态工厂模式, State/状态模式, Proxy/代理模式, Strategy/策略模式] 开始篮球比赛");
        BasketballSceneDemo.main(null);
    }

    public static void FoolballScene() {
        sceneName("现在进入足球比赛场景");
        patternName("[Composite/组合模式] 兔子足球队包含不同的球员");
        CompositeTest.main(null);

        patternName("[Mediator/中介者模式] 急救员、边裁、主裁等众多工作人员和场上的各个球员、教练、赞助商等人员之间的信息交流");
        MediatorTest.main(null);
    }

    public static void WaterballScene() {
        sceneName("现在进入水球比赛场景");
        patternName("[Object Pool/对象池模式, Command/命令模式] 管理水球比赛场地, 裁判下达比赛命令");
        WaterPoloGame.main(null);

        patternName("[Adapter/适配器模式] 适配比赛类和日常训练类");
        WaterPoloTraining.main(null);

        patternName("[Decorator/装饰器模式] ");
        EnhancedGame.main(null);
    }

    public static void PingpongScene() {
        sceneName("现在进入乒乓球比赛场景");
        patternName("[Builder/建造者模式] 使用建造者模式构建队伍");
        TeamTest.main(null);
    }

    public static void RunScene() {
        sceneName("现在进入田径比赛场景");
        patternName("[Chain of Responsibility/责任链模式] 接力比赛传递接力棒");
        HandlerChain.main(null);
    }


    public static void WeiqiScene() {
        sceneName("现在进入围棋比赛场景");

        patternName("[Fly Weight/享元模式] 现在开始围棋比赛");
        ChessTest.main(null);
        ChessmanTest.main(null);

        patternName("[Momento/备忘录模式] 围棋比赛状态保存");
        MementoTest.main(null);
    }

    public static void ShotScene() {
        sceneName("现在进入射击比赛场景");

        patternName("[Composite Entity/组合实体模式] 将射击比赛的工具(细粒度对象)整合成工具包(粗粒度对象)");
        CompositeEntity.main(null);

        patternName("[MVC/模型-视图-控制器模式] 每一箭射完将成绩显示出来");
        MVCPatternDemo.main(null);
    }

    public static void RepositoryScene() {
        sceneName("现在进入仓库场景");
        patternName("[Visitor/访问者模式] 不同身份的工作人员访问仓库");
        ObjectStructure.main(null);

        patternName("[Repository/资源库模式] 需要什么东西只需告诉仓库管理员");
        Repository.main(null);

        patternName("[Transfer Object/传输对象模式] 数据库中球员信息出错并需要更改");
        TransferObjectPatternDemo.main(null);
    }

    public static void UtilScene() {
        sceneName("基础架构");
        patternName("[Registry/注册模式] 获取系统全局Logger");
        Registry.main(null);

        patternName("[AOP/面向切面编程模式] 测量函数性能");
        LogInterceptor.main(null);

        patternName("[Data Access Object/数据访问对象模式] 把低级的数据访问 API 或操作从高级的业务服务中分离出来");
        DaoPatternTest.main(null);
    }

    public static void CompetitionScene() {
        sceneName("现在来到比赛场景");

        patternName("[Template/模板模式, Bridge/桥接模式, Observer/观察者模式, Singleton/单例模式] 发布比赛流程");
        InformNote.main(null);

        patternName("[Multiton/多例模式] 创建比赛裁判");
        MultitonTest.main(null);

        patternName("[Filter/过滤器模式] 区分男子组和女子组");
        FilterTest.main(null);

        patternName("[Iterator/迭代器模式] 遍历赛程表");
        IteratorTest.main(null);

        patternName("[Specification/规格模式] 比赛类型筛选");
        SpecificationTest.main(null);

        patternName("[Fluent/流接口模式, Data Mapper/数据映射模式, Encapsulate Field/封装字段模式] 查询比赛相关信息(日程, 场地等)");
        Sport.main(null);

        patternName("[Null Object/空对象模式] 运动员查询自己的比赛日程");
        NullObjectTest.main(null);
    }

    public static void AwardScene() {
        sceneName("比赛结束开始颁奖");

        patternName("[Prototype/原型模式] 创建奖杯");
        PrototypeTrophy.main(null);
        
        patternName("[Interpreter/解释器模式] 识别出某球队是否进入了决赛");
        InterpreterTest.main(null);
    }

    public static void main(String[] args) {
        /* !!! 注意注意
          如果要编译成jar在windows下直接运行, 需要加下面这一行
          在IDEA里直接执行, 就把这行注释掉
         */
        AnsiConsole.systemInstall();
        
        sceneName("2020年青青草原动物运动会开始了!");

        CompetitionScene();
        BasketballScene();
        FoolballScene();
        PingpongScene();
        RunScene();
        WaterballScene();
        WeiqiScene();
        ShotScene();

        LeisureScene();

        RepositoryScene();

        AwardScene();

        UtilScene();

        sceneName("2020年青青草原动物运动会圆满结束!");
    }

}
