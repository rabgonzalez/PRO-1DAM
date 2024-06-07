package es.ies.puerto.controller.interfaces;

import org.springframework.web.bind.annotation.RequestBody;

import es.ies.puerto.model.entity.User;

public interface IAuthController {
    public String createAuthenticationToken(@RequestBody User user);

    public String createAuthenticationToken2(@RequestBody User user);
}
