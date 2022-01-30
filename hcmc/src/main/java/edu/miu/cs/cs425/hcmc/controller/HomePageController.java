package edu.miu.cs.cs425.hcmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/", "/hcmcweb"})
public class HomePageController {

    @GetMapping(value = {"/", "/home"})
    public String displayHomePage(){
        return "home/index";
    }
}

