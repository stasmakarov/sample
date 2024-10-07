package com.company.sample.app;

import org.springframework.stereotype.Component;

@Component(value = "smpl_MyBean")
public class MyBean {
    public void execute(String param) {
        if (!"OK".equals(param))
            throw new RuntimeException("Technical error");
    }

    public String getEmail(String username) {
        return "admin@company.com";
    }
}