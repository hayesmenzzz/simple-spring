package com.seamount.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(){
        return "SUCCESSS！成功。";
    }
}
