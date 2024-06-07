package es.ies.puerto.controller;

import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.dto.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String createAuthenticationToken(@RequestBody User user) {
        return "Soy el token";
    }
}
