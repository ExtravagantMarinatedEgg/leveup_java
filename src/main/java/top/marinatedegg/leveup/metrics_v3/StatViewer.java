package top.marinatedegg.leveup.metrics_v3;

import java.util.Map;

/**
 * @author ：shuntong
 * @date ：Created in 2020/5/28 11:07
 */

public interface StatViewer {
    void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills);
}