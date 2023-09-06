package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping()
    public String sayHello(){
        return "Your Spring Boot Application is running fine";
    }
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        StringBuilder strb = new StringBuilder(name.toLowerCase());
        String a = (strb.charAt(0)+"").toUpperCase();
        System.out.println(a);
        strb.replace(0,1, a);
        return "Welcome "+strb.toString()+", to our Spring Boot Rest Test application";
    }

    @GetMapping("/request")
    public String requestParam(@RequestParam(name="var", defaultValue = "") String var){
        return "Request address successfully but no records found for var: "+var;
    }

}
