package top.marinatedegg.leveup.proxy;


import top.marinatedegg.leveup.metrics_v1.UserController;

/**
 * @author ：shuntong
 * @date ：Created in 2020/5/29 18:34
 */
public class Demo {
    public static void main(String[] args) {

        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        ITestCollector userController = (ITestCollector) proxy.createProxy(new TestCollector());
        userController.printTest();
    }
}
