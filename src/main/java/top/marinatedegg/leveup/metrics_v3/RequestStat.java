package top.marinatedegg.leveup.metrics_v3;

import lombok.Data;

/**
 * @author ：shuntong
 * @date ：Created in 2020/5/27 18:31
 */
@Data
public class RequestStat {
    private double maxResponseTime;
    private double minResponseTime;
    private double avgResponseTime;
    private double p999ResponseTime;
    private double p99ResponseTime;
    private long count;
    private long tps;
    //...省略getter/setter方法...
}
