package com.wangzg.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="nacos-provider")
public interface ProviderClient {

    @GetMapping("/sayHello")
    String sayHello(@RequestParam(value = "name", defaultValue = "wangzg", required = false) String name);
}


