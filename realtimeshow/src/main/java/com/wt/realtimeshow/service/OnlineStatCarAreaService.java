package com.wt.realtimeshow.service;

import com.wt.realtimeshow.entity.OnlineStatCarArea;
import com.wt.realtimeshow.mapper.OnlineStatCarAreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineStatCarAreaService {

    @Autowired
    private OnlineStatCarAreaMapper carAreaMapper;

    public List<OnlineStatCarArea> selectPeriodTime(String ymd,String timeMark){
        return carAreaMapper.selectPeriodTime(ymd, timeMark);
    }

}
