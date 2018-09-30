package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "jsp/index";
    }
    @RequestMapping(value = "/index2",method = RequestMethod.GET)
    public String index2(){
        return "jsp/index2";
    }
    @RequestMapping(value = "/staticPage",method = RequestMethod.GET)
    public String redirectStatic(){
        return "redirect:/pages/final.html";
    }
    //下面两个函数都是练习重定向的
    //点了Index2页面的按钮之后，先到redirect，然后被重定向到finalPage,重定向的页面是return里面写着的那个
    @RequestMapping(value = "/redirect",method = RequestMethod.GET)
    public String redirectJsp(){
        return "redirect:finalPage";
    }
    @RequestMapping(value = "/finalPage",method = RequestMethod.GET)
    public String finalPage(){
        return "jsp/final";
    }
}
