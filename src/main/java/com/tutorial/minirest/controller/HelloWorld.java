package com.tutorial.minirest.controller;

import com.tutorial.minirest.DTOTicket;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class HelloWorld {
    @ResponseBody
    @PostMapping("/post")
    public DTOTicket postHelloWorld(@RequestBody DTOTicket response){
        return response;
    }
}
