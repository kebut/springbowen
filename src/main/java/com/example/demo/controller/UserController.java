package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/gibu")
    public String gibu(Model model) {
        List<User> user = new ArrayList<>();
        user.add(new User("gibson","bowen", "gkr@gmail.com"));
        user.add(new User("gison","boen", "gkidr@gmail.com"));
        user.add(new User("gibon","bon", "gkabira@gmail.com"));
        user.add(new User("oibson","owen", "gkrowen@gmail.com"));
        user.add(new User("gibs","boen", "gkr@gmail.com"));
        model.addAttribute("user", user);
        return "na";
    }
}
