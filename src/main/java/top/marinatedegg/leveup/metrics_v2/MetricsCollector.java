package top.marinatedegg.leveup.metrics_v2;


import org.apache.commons.lang3.StringUtils;

/**
 * @author ：shuntong
 * @date ：Created in 2020/5/27 18:25
 */

public class MetricsCollector {
    private MetricsStorage metricsStorage;//基于接口而非实现编程

    //依赖注入
    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    //用一个函数代替了最小原型中的两个函数
    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }
}