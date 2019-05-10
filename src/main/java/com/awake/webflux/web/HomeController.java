package com.awake.webflux.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HomeController {

    @RequestMapping("/index")
    public Mono<String> homePage(){
        return Mono.just("hello flux");
    }
}
