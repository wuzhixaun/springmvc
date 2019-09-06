package com.wuzx.controller;

import com.wuzx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.Map;

/**
 * @program: springmvc->SpringMvcTest
 * @description:
 * @author: wuzx
 * @create: 2019-09-06 14:53
 * @version: 1.0
 **/

@SessionAttributes(value = {"helloword"},types = {User.class})
@Controller
public class SpringMvcTest {
    private static final String SUCCESS = "success";

    @ResponseBody
    @RequestMapping(value = "testServletApi")
    public Object testServletApi(HttpServletRequest request, HttpServletResponse response,
                                 HttpSession session, Writer out) throws IOException {
        System.out.println("hello");
        out.write("你好");
        return request;
    }

    @RequestMapping(value = "testModelAndview")
    public ModelAndView testModelAndview(HttpServletRequest request, HttpServletResponse response,
                                       HttpSession session, Writer out) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("username", "wuzhixuan");
        modelAndView.addObject("date", new Date());
        return modelAndView;
    }

    @RequestMapping(value = "testSessionAttribute")
    public String testSessionAttribute(Map<String, Object> map) {

        User user = new User();
        user.setUseraname("wuzhixuan");
        user.setAge(10);
        map.put("user", user);
        map.put("helloword", "123131");
        return "hello";
    }

    @RequestMapping(value = "/testi18n")
    public String testi18n() {

        return "success";
    }

    @RequestMapping(value = "/testView")
    public String testView() {

        return "helloView";
    }
    @ModelAttribute
    public void testModelAttribute() {
        System.out.println("testModelAttribute");
    }
}
