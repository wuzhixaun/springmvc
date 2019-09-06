package com.wuzx.views;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * @program: springmvc->HelloView
 * @description:
 * @author: wuzx
 * @create: 2019-09-06 18:28
 * @version: 1.0
 **/
@Component("helloView")
public class HelloView implements View {
    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.getWriter().println("hellow view ,time:" + new Date());
    }

    @Override
    public String getContentType() {
        return "text/html";
    }
}
