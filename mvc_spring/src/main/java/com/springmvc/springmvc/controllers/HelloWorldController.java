package com.springmvc.springmvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormTwo")
    public String letShourDude(HttpServletRequest request, Model model) {

        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        model.addAttribute("message", theName);
        return "helloworld";
    }

    @RequestMapping("/processFormThree")
    public String letShourDude(
            @RequestParam("studentName") String theName,
            Model model) {

        theName = theName.toUpperCase();
        model.addAttribute("message", theName);
        return "helloworld";
    }
}
