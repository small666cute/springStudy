package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//练习使用@pathvariable
//http://localhost:8080/mvc01/web/fe/这是一个前缀/中文/document/6666/这是后面的
/*这是6666号萌新教程
site prefix:这是一个前缀
language:中文
ID:6666
Natural text:这是后面的 */
@Controller
public class PathVariableExampleController {
    @RequestMapping("/web/fe/{sitePrefix}/{language}/document/{id}/{naturalText}")
    public String documentView(Model model,
                               @PathVariable(value = "sitePrefix")String sitePrefix,
                               @PathVariable(value = "language")String language,
                               @PathVariable(value = "id")Long id,
                               @PathVariable(value = "naturalText")String naturalText){
        //向前台传参数，jsp里可以访问这些变量
        model.addAttribute("sitePrefix",sitePrefix);
        model.addAttribute("language",language);
        model.addAttribute("id",id);
        model.addAttribute("naturalText",naturalText);
        String documentName ="这是一个萌新教程";
        if(id==6666){
            documentName="这是6666号萌新教程";
        }
        model.addAttribute("documentName",documentName);
        return "jsp/documentView";//WEB-INF下views下的目录
    }
}
