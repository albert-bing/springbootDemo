package com.wt.realtimeshow.controller;

import com.wt.realtimeshow.entity.OnlineStatCarLocation;
import com.wt.realtimeshow.service.OnlineStatCarLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OnlineStatCarLocationController {

    @Autowired
    private OnlineStatCarLocationService onlineLocationService;

    @RequestMapping("/carlocation")
    @ResponseBody
    public String selectAll(){
        List<OnlineStatCarLocation> onlineStatCarLocations = onlineLocationService.selectAll();
        return onlineStatCarLocations.toString();
    }

}
