package com.wt.realtimeshow.service;

import com.wt.realtimeshow.entity.OnlineStatCarLocation;
import com.wt.realtimeshow.mapper.OnlineStatCarLocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineStatCarLocationService {

    @Autowired
    OnlineStatCarLocationMapper onlineLocationMapper;

    public List<OnlineStatCarLocation> selectAll() {
        List<OnlineStatCarLocation> onlineStatCarLocations = onlineLocationMapper.select();
        return onlineStatCarLocations;
    }

}
