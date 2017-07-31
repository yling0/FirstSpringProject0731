package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class MainController {

    @RequestMapping("/")
    public @ResponseBody String thisIndex()
    {
        //This shows when you visit http://localhost:8080

        return "You made it!";
    }

    @GetMapping("/index")
    public @ResponseBody String returnIndex()
    {
        return "This is the index page";
    }


}
