package com.wuzx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @ResponseBody
    @RequestMapping(value = "/testparam", method = RequestMethod.GET,params = {"username"})
    public String  testparam() {
        return "testparam";
    }


    @RequestMapping(value = "/testRestful", method = RequestMethod.POST)
    public String   testRestful1() {
        System.out.println("post");
        return "hello";
    }

    @RequestMapping(value = "/testRestful", method = RequestMethod.DELETE)
    public String  testRestful2() {
        System.out.println("delete");
        return "hello";
    }

    @RequestMapping(value = "/testRestful", method = RequestMethod.PUT)
    public String  testRestful3() {
        System.out.println("put");
        return "hello";
    }

    @ResponseBody
    @RequestMapping(value = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String head) {

        System.out.println(head);
        return head;
    }


    @ResponseBody
    @RequestMapping(value = "/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookies) {
        return cookies;
    }
}
