package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//练习@ResponseBody
@Controller
public class ResponseBodyExample1Controller {
    @RequestMapping(value = "/saveResult")
    @ResponseBody
    public String authorInfo(Model model){
        //这里返回一个字符串，也可以不是字符串，写中文的话会显示问号，大概要处理一下编码问题吧
        return "savedresult";
    }
}
