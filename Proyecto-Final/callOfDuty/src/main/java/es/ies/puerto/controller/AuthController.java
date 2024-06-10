package es.ies.puerto.controller;

import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.controller.interfaces.IAuthController;
import es.ies.puerto.model.entity.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
public class AuthController implements IAuthController {

    @Override
    @PostMapping("/login")
    public String createAuthenticationToken(@RequestBody User user) {
        return "Soy el token";
    }

    @Override
    @PostMapping("/login2")
    public String createAuthenticationToken2(@RequestBody User user) {
        return "Soy el token2";
    }
}