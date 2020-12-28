package com.wt.realtimeshow.mapper;

import com.wt.realtimeshow.entity.OnlineStatCarLocation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface OnlineStatCarLocationMapper {
    List<OnlineStatCarLocation> select();
}
