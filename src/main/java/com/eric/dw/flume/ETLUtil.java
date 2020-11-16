package com.eric.dw.flume;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

public class ETLUtil {
    //判断启动日志是否符合格式要求， {},验证JSON字符串的完整性，是否以{}开头结尾
    public static boolean validStartLog(String source) {
        if (StringUtils.isEmpty(source)) {
            return false;
        }
        String trimSource = source.trim();
        if (trimSource.startsWith("{") && trimSource.endsWith("}")) {
            return true;
        }
        return false;
    }

    //   判断事件日志是否符合格式要求,时间戳|{}
    //						时间戳需要合法：
    //							a)长度合法(13位)
    //							b)都是数字
    //						验证JSON字符串的完整性，是否以{}开头结尾
    public static boolean validEventLog(String source) {
        if (StringUtils.isEmpty(source)) {
            return false;
        }
        String trimSource = source.trim();
        String[] splits = trimSource.split("\\|");
        if (splits.length!=2){
            return false;
        }
        if (splits[0].length() == 13 && NumberUtils.isNumber(splits[0])) {
            if (splits[1].startsWith("{") && splits[1].endsWith("}")) {
                return true;
            } else
                return false;
        }


        return false;
    }
}
