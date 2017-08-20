package com.springapp.mvc.controllers;

import com.springapp.mvc.model.User;
import com.springapp.mvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("connect", "Hi there! Please, log in if you want to access our secret page");
        return "login";
    }

//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public String printWelcome(@ModelAttribute("SpringWeb") User user, ModelMap model) {
//        if (userService.checkUser(user)){
//            model.addAttribute("user", user);
//            return "hello";
//        }
//        else
//            return "registration";
//    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String register (@ModelAttribute("SpringWeb") User user,
                               ModelMap model) {
        model.addAttribute("user", user);
        userService.addUser(user);
        return "hello";
        /*
        try {
            userService.addUserData();
        } catch (Exception e){}
        */
    }
    /*
        model.addAttribute("user", user);
        model.addAttribute("userList", userService.getUsers());
        System.out.println(userService.getUsers());
        return "redirect:/showUsers";
    }

    @RequestMapping(value = "/showUsers", method = RequestMethod.GET)
    public String showUsers (ModelMap model) {
        model.addAttribute("userList", userService.getUsers());
        return "allusers";
    }

    @RequestMapping(value = "/delete/{username}", method = RequestMethod.GET)
    public String deleteUser (@PathVariable ("username") String username, ModelMap model)  {
        System.out.println("найден ли "+ username+": "+ userService.findUserByName(username));
        userService.deleteUserByName(username);
        model.addAttribute("userList", userService.getUsers());
        return "redirect:/showUsers";
    }
    */
}
