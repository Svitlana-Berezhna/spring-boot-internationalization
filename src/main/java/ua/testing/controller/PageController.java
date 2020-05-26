package ua.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h1>Spring Boot Internationalization</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-03-04
 */
@Controller
public class PageController {
    @RequestMapping("/api")
    public String mainPage() { return "index.html"; }

    @RequestMapping("/all_user")
    public String userPage() { return "index.html"; }

    @RequestMapping("/welcome")
    public String hello() { return "welcome"; }
}
