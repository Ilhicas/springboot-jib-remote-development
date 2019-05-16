package com.ilhicas.springboot.controllers;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SecondController {

    @RequestMapping(value="/secondcontroller", method = RequestMethod.GET)
    public String index() {
        return "Yet another Controller";
    }
}
