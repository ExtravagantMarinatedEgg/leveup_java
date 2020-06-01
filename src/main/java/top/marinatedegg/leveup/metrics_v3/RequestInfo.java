package top.marinatedegg.leveup.metrics_v3;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ：shuntong
 * @date ：Created in 2020/5/27 18:28
 */
@Data
@AllArgsConstructor
public class RequestInfo {
    private String apiName;
    private double responseTime;
    private long timestamp;
    //...省略constructor/getter/setter方法...
}