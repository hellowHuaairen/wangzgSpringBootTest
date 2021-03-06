package com.wangzg.controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by forezp on 2019/5/12.
 */

@RestController
@RefreshScope
public class ConfigController {

    @Value("${username:wangzg}")
    private String username;

    @RequestMapping("/username")
    public String userNameInfo() {
        return username;
    }
}