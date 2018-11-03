package com.devglan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
@RequestMapping("/")
public class AppController {
 
    @RequestMapping(value = { "/hello"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "hello";
    }
 
    @RequestMapping(value = { "/contact"}, method = RequestMethod.GET)
    public ModelAndView productsPage(ModelMap model) {
    	return new ModelAndView("contact", "command", new Contact());
    }
 
    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String contactUsPage(ModelMap model) {
        return "home";
    }
}
