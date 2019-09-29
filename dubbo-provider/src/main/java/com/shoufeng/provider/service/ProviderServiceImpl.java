package com.shoufeng.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.shoufeng.api.ProviderService;
import org.springframework.stereotype.Component;

@Service
@Component
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String providerMethod1(String message) {
        return "调用远程方法{参数：" + message + "}";
    }

}
