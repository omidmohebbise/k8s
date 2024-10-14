package com.omidmohebbise.demoapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class SimpleController {

    record Links(String title, String url){}

    @GetMapping
    public ResponseEntity<List<Links>> hello() {
        return ResponseEntity.ok(List.of(
                new Links("Person","/persons")
        ));
    }
}
