package com.springmvc.controller;

import com.springmvc.temp.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    //在ModelAndView对象中传递了一个名为“command”的空对象，因为如果在JSP中使用<form：form>标签，spring框架需要一个名为“command”的对象文件。
    // 所以当调用student()方法时，它返回student.jsp视图
    //viewName那儿写WEBINF下对应的jsp文件，记得加目录
    public ModelAndView student() {

        return new ModelAndView("jsp/student", "command", new Student());
    }

    //从服务方法返回“result”视图，这将最终渲染result.jsp视图
    //如果从student.jsp输入时，把年龄和id填的类型不是整数，那么会报错（400）
    //@ModelAttribute("SpringWeb")本来加在Student student这个前面，不过这里好像没有用
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        return "jsp/result";
    }
}