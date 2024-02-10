package org.rahimov.todolistapp.controller;

import lombok.RequiredArgsConstructor;
import org.rahimov.todolistapp.service.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth/")
@RequiredArgsConstructor
public class AuthenticationController {

private final AuthenticationService authService;

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String loginToWelcome(@RequestParam String username, @RequestParam String password,
                                 ModelMap modelMap){

        if (authService.authenticated(username,password)){
            modelMap.put("username",username);
            return "welcome";
        }
        modelMap.put("errorMessage","Invalid credentials!");
        return "login";


    }

}
