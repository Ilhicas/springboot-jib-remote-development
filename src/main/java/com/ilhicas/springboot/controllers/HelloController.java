package com.ilhicas.springboot.controllers;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Remote development inside a container created by jib!";
    }

    @RequestMapping(value = "/route1", method = RequestMethod.GET)
    public String controller() {
        return "route1";
    }
}
