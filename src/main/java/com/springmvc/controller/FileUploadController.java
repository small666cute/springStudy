package com.springmvc.controller;

import com.springmvc.temp.FileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import java.io.File;

@Controller
public class FileUploadController {
    @Autowired
    ServletContext context;
    @RequestMapping(value = "/fileuploadpage",method = RequestMethod.GET)
    public ModelAndView fileUploadPage(){
        FileModel file = new FileModel();
        ModelAndView modelAndView = new ModelAndView("jsp/fileupload","command",file);
        return modelAndView;
    }
    @RequestMapping(value = "/fileuploadpage",method = RequestMethod.POST)
    public String fileUpload(@Validated FileModel file, BindingResult result, ModelMap model)
        throws Exception{
        if(result.hasErrors()){
            System.out.println("validation errors");
            return "redirect:fileuploadpage";
        }else {
            System.out.println("fetching file");
            MultipartFile multipartFile = file.getFile();
            String uploadPath = context.getRealPath("")+File.separator+"temp"+File.separator;
            FileCopyUtils.copy(file.getFile().getBytes(),new File(uploadPath+file.getFile().getOriginalFilename()));
            String fileName = multipartFile.getOriginalFilename();
            model.addAttribute("fileName",fileName);
            return "jsp/success";

        }
    }

}
