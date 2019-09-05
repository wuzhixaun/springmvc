package com.wuzx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springmvc->HelloWord
 * @description: 测试
 * @author: wuzx
 * @create: 2019-09-05 17:37
 * @version: 1.0
 **/
@Controller
public class HelloWord {


    @RequestMapping(value = "/helloworld")
    public String helloWorld() {
        return "hello";
    }
}
