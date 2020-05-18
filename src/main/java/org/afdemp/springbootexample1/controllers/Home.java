/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.springbootexample1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mac
 */
@Controller
@RequestMapping("/")
public class Home {
    
    @RequestMapping("/")
    public String Home(ModelMap view) {
        view.addAttribute("greeting", new String("Hello George"));
        return "welcome";
    }
    
}



//@RestController
//public class Home {
//
//    @GetMapping("/")
//    public String home() {
//        return ("<h1>Welcome home SIR</h1>");
//    }
//
//    @GetMapping("/admin")
//    public String admin() {
//        return ("<h1>Welcome ADMIN!!!");
//    }
//
//    @GetMapping("/user")
//    public String user() {
//        return ("<h1>Welcome USER!!!");
//    }
//}
