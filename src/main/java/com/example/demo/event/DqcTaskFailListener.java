package com.example.demo.event;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @description: dqc任务失败时 发送报警邮件
 * @author: swg
 * @created: 2018/5/29
 */
@Component
public class DqcTaskFailListener {

    @Autowired
    private AsyncEventBus asyncEventBus;

    @PostConstruct
    public void register(){
        asyncEventBus.register(this);
    }

    @Subscribe
    public void warn(String taskInstanceEntity){
        System.out.println("test....." + taskInstanceEntity);
    }
}
