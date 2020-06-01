package top.marinatedegg.leveup.metrics_v3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：shuntong
 * @date ：Created in 2020/5/27 18:26
 */
public class RedisMetricsStorage implements MetricsStorage {

    //test
    private Map<String, List<RequestInfo>> map = new HashMap<>();

    //...省略属性和构造函数等...
    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
        //...
        this.map.putIfAbsent(requestInfo.getApiName(), new ArrayList<>());
        this.map.get(requestInfo.getApiName()).add(requestInfo);
    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimestamp, long endTimestamp) {
        //...
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimestamp, long endTimestamp) {
        //...
        return this.map;
    }
}