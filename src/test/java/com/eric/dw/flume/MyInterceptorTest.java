package com.eric.dw.flume;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;

public class MyInterceptorTest {
    @Test
    public void test(){
        String startStr="1605011453882|{\"cm\":{\"ln\":\"-107.4\",\"sv\":\"V2.2.0\",\"os\":\"8.1.8\",\"g\":\"HB1AW5GN@gmail.com\",\"mid\":\"999\",\"nw\":\"4G\",\"l\":\"en\",\n" +
                "\"vc\":\"14\",\"hw\":\"640*1136\",\"ar\":\"MX\",\"uid\":\"999\",\"t\":\"1604920477796\",\"la\":\"12.5\",\"md\":\"sumsung-5\",\"vn\":\"1.1.1\",\"ba\":\"Sumsung\",\"sr\":\"I\"},\"ap\":\"app\",\"et\":[{\"ett\":\"1604993177455\",\"en\":\"display\",\"kv\":{\"goodsid\":\"260\",\"action\":\"2\",\"extend1\":\"2\",\"place\":\"0\",\"category\":\"2\"}},{\"ett\":\"1604944809908\",\"en\":\"loading\",\"kv\":{\"extend2\":\"\",\"loading_time\":\"8\",\"action\":\"3\",\"extend1\":\"\",\"type\":\"3\",\"type1\":\"\",\"loading_way\":\"1\"}},{\"ett\":\"1604976229359\",\"en\":\"notification\",\"kv\":{\"ap_time\":\"1604967369227\",\"action\":\"2\",\"type\":\"4\",\"content\":\"\"}},{\"ett\":\"1605009851283\",\"en\":\"active_background\",\"kv\":{\"active_source\":\"1\"}},{\"ett\":\"1604989674660\",\"en\":\"error\",\"kv\":{\"errorDetail\":\"java.lang.NullPointerException\\\\n    at cn.lift.appIn.web.AbstractBaseController.validInbound(AbstractBaseController.java:72)\\\\n at cn.lift.dfdf.web.AbstractBaseController.validInbound\",\"errorBrief\":\"at cn.lift.dfdf.web.AbstractBaseController.validInbound(AbstractBaseController.java:72)\"}},{\"ett\":\"1604998113371\",\"en\":\"comment\",\"kv\":{\"p_comment_id\":3,\"addtime\":\"1605004941895\",\"praise_count\":136,\"other_id\":3,\"comment_id\":0,\"reply_count\":58,\"userid\":4,\"content\":\"借违躁炯覆襄墅辕亢跺异吨队涂档裳泻跟嫌耍\"}},{\"ett\":\"1604929865774\",\"en\":\"favorites\",\"kv\":{\"course_id\":8,\"id\":0,\"add_time\":\"1605001994918\",\"userid\":9}},{\"ett\":\"1604981941182\",\"en\":\"praise\",\"kv\":{\"target_id\":7,\"id\":2,\"type\":4,\"add_time\":\"1604968492110\",\"userid\":0}}]}";
        String  eventStr="{\"action\":\"1\",\"ar\":\"MX\",\"ba\":\"HTC\",\"detail\":\"\",\"en\":\"start\",\"entry\":\"3\",\"extend1\":\"\",\"g\":\"5AU68SJN@gmail.com\",\"hw\":\"10\n" +
                "80*1920\",\"l\":\"es\",\"la\":\"-31.4\",\"ln\":\"-116.7\",\"loading_time\":\"7\",\"md\":\"HTC-19\",\"mid\":\"998\",\"nw\":\"WIFI\",\"open_ad_type\":\"1\",\"os\":\"8.0.2\",\"sr\":\"V\",\"sv\":\"V2.3.2\",\"t\":\"1604923702708\",\"uid\":\"998\",\"vc\":\"16\",\"vn\":\"1.1.0\"}";
        System.out.println(ETLUtil.validStartLog(eventStr));
        System.out.println(ETLUtil.validEventLog(startStr));
    }
}
