package ua.testing.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.testing.dto.UserDTO;
import ua.testing.dto.UsersDTO;
import ua.testing.service.UserService;

/**
 * <h1>Spring Boot Internationalization</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-03-04
 */
@Slf4j
@RestController
@RequestMapping(value = "/")
public class LoginFormController {
    private final UserService userService;

    @Autowired
    public LoginFormController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "login")
    public void loginFormController(UserDTO user) {
        log.info("{}", userService.findByUserLogin(user));
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public UsersDTO getAllUser() {
        log.info("{}", userService.getAllUsers());
        return userService.getAllUsers();
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public UsersDTO getAllUser() {
        return userService.getAllUsers();
    }
}
