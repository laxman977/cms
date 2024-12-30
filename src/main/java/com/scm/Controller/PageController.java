package com.scm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("youtubeChannel", "Learn Code With Durgesh");
        model.addAttribute("githubRepo", "https://github.com/learncodewithdurgesh/");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("about page handler");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services page loading");
        return "services";
    }

    // this is showing login page
    @GetMapping("/login")
    public String login() {
        return new String("login");
    }

    // registration page
    @GetMapping("/register")
    public String register() {

       // UserForm userForm = new UserForm();
        // default data bhi daal sakte hai
        // userForm.setName("Durgesh");
        // userForm.setAbout("This is about : Write something about yourself");
       // model.addAttribute("userForm", userForm);
        return "register";
    }

    //processing registration
    @RequestMapping(value = "/do-register",method = {RequestMethod.POST})
    public String processRegister() {
        System.out.println("processing register");
        return "redirect:/register";
    }


}


