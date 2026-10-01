package com.example.working;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return """
		<font color=red><h1>Welcome Ajith Sir>
		""";
    }
}
