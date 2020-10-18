package com.wangzg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProviderController {

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam(value = "name",defaultValue = "helloWord")String sayHello){

        return "tom say: " + sayHello;
    }
}
