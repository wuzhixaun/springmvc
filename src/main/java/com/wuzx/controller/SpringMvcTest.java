package com.wuzx.controller;

import com.wuzx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

    private final static List<User> list = new ArrayList();
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

@RequestMapping(value = "/testRedirect")
    public String testRedirect() {
        return "redirect:index.jsp";
    }

    @RequestMapping(value = "/user" ,method = RequestMethod.GET)
    public String user() {
        return "input";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ModelAndView adduser(User user) {
        ModelAndView mv = new ModelAndView("input_success");

        list.add(user);
        mv.addObject("users", list);
        return mv;
    }


    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file") MultipartFile file) {

        System.out.println(file);
        return "success";
    }

}
