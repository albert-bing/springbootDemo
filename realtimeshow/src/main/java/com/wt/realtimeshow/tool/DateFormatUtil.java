package com.wt.realtimeshow.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {

    private String pattern = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取当前时间戳
     * @return
     */
    public Long getCurrentTimeStamp(){
        Long currentTimeStamp = System.currentTimeMillis();
        return currentTimeStamp;
    }

    /**
     * 格式化时间戳
     * @param currentTimeStamp
     * @return
     */
    public String formatTimeStamp(Long currentTimeStamp){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date(currentTimeStamp));
    }

    /**
     * 获取当前时间
     * @return
     */
    public String getCurrentTime(){
        String currentTime = formatTimeStamp(getCurrentTimeStamp());
        return currentTime;
    }

    /**
     * 获取当前的ymd时间
     * @return
     */
    public String getCurrentYmd(){
         return formatTimeStamp(getCurrentTimeStamp()).split(" ")[0];
    }

    /**
     * 获取当前时间的时分秒
     * @return
     */
    public String getCurrentHMS(){
        return formatTimeStamp(getCurrentTimeStamp()).split(" ")[1];
    }
}
