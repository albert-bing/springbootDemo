package com.wt.realtimeshow;

import com.wt.realtimeshow.entity.OnlineStatCarLocation;
import com.wt.realtimeshow.mapper.OnlineStatCarLocationMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RealtimeshowApplicationTests {

    @Autowired
    OnlineStatCarLocationMapper carLocationMapper;

    @Test
    void contextLoads() {
        List<OnlineStatCarLocation> onlineStatCarLocation = carLocationMapper.select();
        System.out.println(onlineStatCarLocation.toString());
    }

}
