package io.github.burymydeadhoreses.thymewebapp.controllers;

import io.github.burymydeadhoreses.thymewebapp.services.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hash")
public class HashController {

    private final PasswordService passwordService;

    @Autowired
    public HashController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @PostMapping("/generate")
    public String generate(@RequestParam("password") String password, Model model) {

        model.addAttribute("hash", passwordService.hash(password));
        return "hash";
    }

    @GetMapping({"/", ""})
    public String showForm(Model model) {
        model.addAttribute("hash");
        return "hash";
    }
}
