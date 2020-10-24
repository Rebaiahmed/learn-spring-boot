package com.learn.springBoot.roadmap.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulerTask {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private int count=0;


    @Scheduled(fixedDelay=5000)
    private void process()
    {
        this.logger.info(String.format("this is scheduler task runing  %d", count++));
        logger.info("this is a info message");
        logger.warn("this is a warn message");
        logger.error("this is a error message");
    }


    @Scheduled(cron = "0 * 9 * * ?")
    public void cronJobSch() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        logger.info("Java cron job expression:: {}" ,strDate);
    }

}
