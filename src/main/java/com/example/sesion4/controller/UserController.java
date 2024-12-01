
package com.example.sesion4.controller;

import com.example.sesion4.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/user/form")
    public String mostrarFormulario(Model model) {
        model.addAttribute("user", new User()); // Se usa "User" y "user"
        return "form"; // Referencia a form.html
    }

    @PostMapping("/user/submit")
    public String procesarFormulario(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user); // Los datos del formulario se envían aquí
        return "resultado"; // Referencia a result.html
    }
}
