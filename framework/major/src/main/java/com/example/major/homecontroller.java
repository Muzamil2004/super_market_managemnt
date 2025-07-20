package com.example.major;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class homecontroller {
    @RequestMapping("/")
    public String requestMethodName() {
        return "index.html";
    }
}
