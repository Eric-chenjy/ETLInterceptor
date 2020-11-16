package com.eric.dw.flume;

import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;
import org.apache.velocity.runtime.directive.Foreach;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyInterceptor implements Interceptor {
    private List<Event> results = new ArrayList<Event>();
    private String startFlag = "\"en\":\"start\"";

    public void initialize() {

    }

    //核心方法
    public Event intercept(Event event) {
        byte[] body = event.getBody();
        String bodyStr = new String(body, Charset.forName("utf-8"));
        Map<String, String> headers = event.getHeaders();
        boolean flag=false;
        if (bodyStr.contains(startFlag)) {
            headers.put("topic", "topic_start");
            flag=ETLUtil.validStartLog(bodyStr);
        } else {
            headers.put("topic", "topic_event");
            flag=ETLUtil.validEventLog(bodyStr);
        }
        if (flag==false){
            return null;
        }
        return event;
    }

    public List<Event> intercept(List<Event> list) {
        results.clear();
        for (Event event :
                list) {
            Event result = intercept(event);
            if (result != null) {
                results.add(result);
            }

        }
        return results;
    }

    public void close() {

    }

    public static class Builder implements org.apache.flume.interceptor.Interceptor.Builder {
        //创建拦截器对象
        public Interceptor build() {
            return new MyInterceptor();
        }

        //从fulme配置文件中读取
        public void configure(Context context) {

        }
    }
}
