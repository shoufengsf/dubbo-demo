package com.shoufeng.consumer.service;

import com.alibaba.dubbo.config.annotation.Method;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shoufeng.api.ProviderService;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @Reference(methods = {@Method(name = "providerMethod1", timeout = 3000, retries = 5, loadbalance = "roundrobin")}, version = "1.0.0")
    private ProviderService providerService;

    public void consumerMethod1(){
        System.out.println(providerService.providerMethod1("hello world 哈哈"));
    }

}
