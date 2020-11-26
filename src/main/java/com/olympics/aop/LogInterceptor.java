package com.olympics.aop;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LogInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
        System.out.println("[AOP] Before invoke Class: \"" + object.getClass().getSuperclass().getName() + "\", Method: \"" + method.getName() + "\"");
        long start = System.currentTimeMillis();
        proxy.invokeSuper(object, objects);
        System.out.println("[AOP] After invoke Class: \"" + object.getClass().getSuperclass().getName() + "\", Method: \"" + method.getName() + "\"");
        System.out.println("[AOP] Execution time: " + (System.currentTimeMillis() - start) + "ms");
        return object;
    }

    public static void main(String[] args) {
        LogInterceptor logInterceptor = new LogInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallback(logInterceptor);

        Dao dao = (Dao) enhancer.create();
        dao.business1();
        dao.business2();
    }
}
