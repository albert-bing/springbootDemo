package com.wt.realtimeshow.controller;

import com.alibaba.fastjson.JSONArray;
import com.wt.realtimeshow.service.OnlineStatCarAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineStatCarAreaController {

    @Autowired
    private OnlineStatCarAreaService carAreaService;

    @RequestMapping("/carlocation/{ymd}/{timeMark}")
    @ResponseBody
    public String selectPeriodTime(@PathVariable String ymd,@PathVariable String timeMark){
        return (String) JSONArray.toJSON(carAreaService.selectPeriodTime(ymd,timeMark));
    }

}
