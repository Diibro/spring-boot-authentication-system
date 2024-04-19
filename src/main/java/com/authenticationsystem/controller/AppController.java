package com.authenticationsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class AppController {
     
     @GetMapping(value = "/")
     public String serve(){
          return "This is a simple java application";
     } 
}
