package com.thepathways.oauthgithubdemo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class GreetingController {

    @GetMapping("/greeting")
    public ResponseEntity<String> sayHello(@AuthenticationPrincipal OAuth2User principal){
        return ResponseEntity.ok("Hello from Private API, you are logged in as : " + principal.getAttribute("name"));
    }

    @GetMapping("/user")
    public ResponseEntity<String> home(@AuthenticationPrincipal OAuth2User principal) {
        return ResponseEntity.ok("Hello " +  principal.getAttribute("name"));
    }

}
