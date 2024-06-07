package es.ies.puerto.controller;

import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.model.User;

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

    @PostMapping("/login2")
    public String createAuthenticationToken2(@RequestBody User user) {
        return "Soy el token2";
    }
}
