package com.shoufeng.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.shoufeng.api.ProviderService;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Service(version = "1.0.0", loadbalance = "leastactive")
@Component
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String providerMethod1(String message) {
//        try {
//            TimeUnit.SECONDS.sleep(5L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "调用远程方法{参数：" + message + "}";
    }

    @Override
    public String providerMethod2(String message) {
        return null;
    }

}
