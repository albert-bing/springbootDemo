package com.wt.realtimeshow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wt.realtimeshow.mapper")
public class RealtimeshowApplication {

    public static void main(String[] args) {
//        SpringApplication.run(RealtimeshowApplication.class, args);
        SpringApplication springApplication = new SpringApplication(RealtimeshowApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }

}
