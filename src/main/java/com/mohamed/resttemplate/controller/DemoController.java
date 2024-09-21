package com.mohamed.resttemplate.controller;

import com.mohamed.resttemplate.dto.ObjectDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/get")
    public String get() {
        return "Hello World!";
    }

    @GetMapping("/get/{id}")
    public ObjectDTO getObject(@PathVariable int id) {
        return new ObjectDTO(id, "mohamed");
    }

}
