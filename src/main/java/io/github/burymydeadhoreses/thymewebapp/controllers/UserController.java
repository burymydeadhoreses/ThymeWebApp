package io.github.burymydeadhoreses.thymewebapp.controllers;

import io.github.burymydeadhoreses.thymewebapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String list(Model model) {
        model.addAttribute("users", userService.list());
        return "users";
    }
}
