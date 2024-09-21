package com.mohamed.resttemplate.controller;

import com.mohamed.resttemplate.dto.ObjectDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/post")
    public ResponseEntity<?> postObject(@RequestBody ObjectDTO objectDTO) {
        System.out.println(objectDTO);
        return ResponseEntity
                .accepted()
                .build();
    }

}
