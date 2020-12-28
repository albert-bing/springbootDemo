package com.wt.realtimeshow.mapper;

import com.wt.realtimeshow.entity.OnlineStatCarArea;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OnlineStatCarAreaMapper {
    public List<OnlineStatCarArea> selectPeriodTime(String ymd,String timeMark);
}
