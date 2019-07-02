package com.poc.controller;

import com.poc.service.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Client client;

    @RequestMapping("/")
    public String getData() {
        return " Hello " + client.getResponse();
    }

}
