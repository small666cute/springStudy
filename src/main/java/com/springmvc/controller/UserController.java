package com.springmvc.controller;

import com.springmvc.temp.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ModelAndView user(){
        //return new ModelAndView("jsp/user","command",new User());
        User user = new User();
        user.setFavoriteStrings(new ArrayList<String>());
        ModelAndView modelAndView = new ModelAndView("jsp/user","command",user);
        return modelAndView;
    }
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(User user, ModelMap model){
        model.addAttribute("username",user.getUsername());
        model.addAttribute("password",user.getPassword());
        model.addAttribute("address",user.getAddress());
        model.addAttribute("receivePaper",user.isReceivePaper());
        model.addAttribute("favoriteStrings",user.getFavoriteStrings());
        model.addAttribute("country",user.getCountry());
        model.addAttribute("skills",user.getSkills());
        return "jsp/userlist";
    }
//    这个是做什么来着，@ModelAttribute？
    @ModelAttribute("weekList")
    public List<String > getWeekList(){
        List<String> weekList = new ArrayList<String>();
        weekList.add("明天星期一真开心");
        weekList.add("明天星期二真开心");
        weekList.add("明天星期三真开心");
        weekList.add("明天星期四真开心");
        weekList.add("明天星期五真开心");
        weekList.add("明天星期六真开心");
        weekList.add("明天星期日真开心");
        return weekList;
    }
    @ModelAttribute("countryList")
    public Map<String ,String > getCountryList(){
        Map<String,String >countryList = new HashMap<String, String>();
        countryList.put("US", "United States");
        countryList.put("CH", "China");
        countryList.put("SG", "Singapore");
        countryList.put("MY", "Malaysia");
        return countryList;
    }
//    这个名字不一样也行？
    @ModelAttribute("skillsList")
    public Map<String ,String >getSkillsList(){
        Map<String ,String >skillList = new HashMap<String, String>();
        skillList.put("sleep","sleeping");
        skillList.put("sleep2","sleep2ing");
        skillList.put("sleep3","sleep3ing");
        skillList.put("sleep4","sleep4ing");
        skillList.put("sleep5","sleep5ing");
        return skillList;
    }

}
