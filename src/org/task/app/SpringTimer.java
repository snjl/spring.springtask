package org.task.app;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 34924
 */
@Component
public class SpringTimer {
    @Scheduled(cron="0/5 * * * * ? ") //每5秒执行一次
    public void myTest(){
        System.out.println("进入测试  " + new Date());
    }
}


