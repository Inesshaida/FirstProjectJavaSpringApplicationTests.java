package pl.edu.vistula.firstprojectjavaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// @RestController // Only use one: either @Controller (for views) or @RestController (for plain data)
public class HelloController {

    @GetMapping(value = "/")
    public String hello() {
        return "Hello Vistula, in my first Spring controller.";
    }

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}

