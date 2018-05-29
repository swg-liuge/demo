package com.example.demo.event;

import com.google.common.eventbus.AsyncEventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

/**
 * @description:
 * @author: swg
 * @created: 2018/5/29
 */
@Configuration
public class EventBusConfiguration {

    @Bean
    public AsyncEventBus asyncEventBus(){
        return new AsyncEventBus(Executors.newFixedThreadPool(5));
    }

}
