package com.siva.assignment4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.assignment4.Models.Registration;
import com.siva.assignment4.Service.RegistrationService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/workshop")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new Registration());
        return "registrationform"; 
    }
	
	@PostMapping("/save")
    public String saveRegistration(@Valid Registration registration, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "registrationform"; 
        }
        registrationService.saveRegistration(registration);
        model.addAttribute("message", "Registration Successful!");
        return "registrationform"; 
    }

}
