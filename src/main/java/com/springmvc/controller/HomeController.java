package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //声明为控制器
@RequestMapping(path = "/home")  //请求映射
public class HomeController {
    @RequestMapping(path = "/index")  //请求映射
    public String index(Model model){
        //将message参数传到前端,Jsp可以访问到
        model.addAttribute("message","Hello Spring MVC!");
        return "home/index";
    }
}