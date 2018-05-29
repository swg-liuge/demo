package com.example.demo;

import com.google.common.eventbus.AsyncEventBus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: swg
 * @created: 2018/5/29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EventBusTest {

    @Autowired
    private AsyncEventBus asyncEventBus;

    @Test
    public void testSend(){
        String entity = "";
        asyncEventBus.post(entity);
    }
}
