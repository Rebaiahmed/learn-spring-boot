package com.learn.springBoot.roadmap.config.schedule;

import com.learn.springBoot.roadmap.service.SchedulerTask;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class ScheduleConfig {

    @Bean
    @ConditionalOnProperty(value = "jobs.enabled", matchIfMissing = true, havingValue = "true")
    public SchedulerTask scheduledJob() {
        return new SchedulerTask();
    }
}
