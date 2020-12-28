package com.wt.realtimeshow.mapper;

import com.wt.realtimeshow.entity.OnlineStatCarArea;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OnlineStatCarAreaMapper {
    public List<OnlineStatCarArea> selectPeriodTime(String ymd,String timeMark);
}
