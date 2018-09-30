package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//练习使用@RequestParam
//http://localhost:8080/mvc01/user?name=admin,然后admin作为参数被传进去了
@Controller
public class RequestParamExampleController {
    @RequestMapping("/user")
    public String userInfo(Model model, @RequestParam(value = "name", defaultValue = "Guest") String name) {
        model.addAttribute("name", name);
        if ("admin".equals((name))) {
            model.addAttribute("email", "这是一个email");
        } else {
            model.addAttribute("email", "没有设置");
        }
        //如果不加pages目录的话，就默认这儿的是直接在view目录下面的，在spring-mvc.xml设置的
        // <property name="prefix" value="/WEB-INF/views/"/><!--设置JSP文件的目录位置-->
        return "pages/userInfo";
    }
}
