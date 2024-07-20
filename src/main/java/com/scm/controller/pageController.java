package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class pageController {
    
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @GetMapping("/services")
    public String servicePage(){
        return "services";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return "about";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }

}
