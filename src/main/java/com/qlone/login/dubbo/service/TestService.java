package com.qlone.login.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.qlone.api.login.Test;

@Service(version = "1.0.0")
public class TestService implements Test {

    @Override
    public String getMessage() {
        return "yes you get it";
    }
}
