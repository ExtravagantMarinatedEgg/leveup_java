package top.marinatedegg.leveup.proxy;

import top.marinatedegg.leveup.metrics_v1.UserController;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：shuntong
 * @date ：Created in 2020/5/29 18:30
 */

public class MetricsCollectorProxy {
    private TestCollector testCollector;

    public MetricsCollectorProxy() {
        this.testCollector = new TestCollector();
    }

    public Object createProxy(Object proxiedObject) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {
        private Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTimestamp = System.currentTimeMillis();
            System.out.println("之前" + startTimestamp);
            Object result = method.invoke(proxiedObject, args);
            long endTimeStamp = System.currentTimeMillis();
            System.out.println("之后" + endTimeStamp);
            return result;
        }
    }
}

    //MetricsCollectorProxy使用举例
//    MetricsCollectorProxy proxy = new MetricsCollectorProxy();
//    IUserController userController = (IUserController) proxy.createProxy(new UserController());