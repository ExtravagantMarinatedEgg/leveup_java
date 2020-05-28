package top.marinatedegg.leveup.metrics_v2;

import java.util.List;
import java.util.Map;

/**
 * @author ：shuntong
 * @date ：Created in 2020/5/27 18:26
 */

public interface MetricsStorage {
    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}