package com.example.RestService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {
    @GetMapping("/{name}")
    public ResponseEntity<String> greetings(@PathVariable String name){
        return ResponseEntity.ok("Hello " + name  );
    }
}
