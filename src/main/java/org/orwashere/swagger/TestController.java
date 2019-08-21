package org.orwashere.swagger;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String testEndpoint() {

        return "sadsad";


    }
}
