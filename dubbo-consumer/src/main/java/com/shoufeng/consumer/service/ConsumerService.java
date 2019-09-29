package com.shoufeng.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shoufeng.api.ProviderService;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @Reference
    private ProviderService providerService;

    public void consumerMethod1(){
        System.out.println(providerService.providerMethod1("hello world 哈哈"));
    }

}
