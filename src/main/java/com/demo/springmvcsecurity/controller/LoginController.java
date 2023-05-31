package com.demo.springmvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showLoginPage")
    public String showMyLoginPage() {
        //return "plain-login";
        return "fancy-login";
    }

    //add request mapping for /access-denied
    @GetMapping("/access-denied")
    public String showAccessDenied() {
        //return "plain-login";
        return "access-denied";
    }

}
