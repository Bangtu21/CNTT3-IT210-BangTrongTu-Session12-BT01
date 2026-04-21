package data_cookie.session12bt01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HopitalController {
    @GetMapping
    public String home() {
        return "home";
    }
}
