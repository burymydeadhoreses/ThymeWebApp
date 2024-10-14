package io.github.burymydeadhoreses.thymewebapp.advices;

import io.github.burymydeadhoreses.thymewebapp.exceptions.EmptyPasswordException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PasswordExceptionHandler {

    @ExceptionHandler(EmptyPasswordException.class)
    public String handleEmptyPasswordException(EmptyPasswordException ex, Model model) {
        model.addAttribute("hash", ex.getMessage());
        return "hash";
    }
}
