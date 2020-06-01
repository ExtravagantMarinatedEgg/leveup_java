package top.marinatedegg.leveup.metrics_v3;

import com.google.gson.Gson;

import java.util.Map;

/**
 * @author ：shuntong
 * @date ：Created in 2020/5/28 11:07
 */
public class ConsoleViewer implements StatViewer {
    @Override
    public void output(
            Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills) {
        System.out.println("Time Span: [" + startTimeInMillis + ", " + endTimeInMills + "]");
        Gson gson = new Gson();
        System.out.println(gson.toJson(requestStats));
    }
}
