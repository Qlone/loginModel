package com.qlone.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class TestController {
    @ResponseBody
    @RequestMapping("")
    public Object getBill(ModelAndView modelAndView){
        modelAndView.addObject("res","hello");
        return modelAndView.getModel();
    }
}
