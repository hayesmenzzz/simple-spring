package com.seamount.spring.controller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class HelloController {

	@RequestMapping("/hello")
    public ModelAndView hello(){
        System.out.println("HelloController start ##########");
              ModelAndView mv =new ModelAndView();
              mv.addObject("spring", "spring mvc");
              mv.setViewName("hello");
              return mv;
    }
}
