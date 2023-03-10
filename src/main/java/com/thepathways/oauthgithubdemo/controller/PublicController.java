package com.thepathways.oauthgithubdemo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/public/")
public class PublicController {

    @GetMapping("/greeting")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello I am a Public API");
    }


}
