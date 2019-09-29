package com.shoufeng.consumer;

import com.shoufeng.consumer.service.ConsumerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerApplicationTests {

    @Autowired
    private ConsumerService consumerService;

    @Test
    public void contextLoads() throws Exception {
        consumerService.consumerMethod1();
    }

}
