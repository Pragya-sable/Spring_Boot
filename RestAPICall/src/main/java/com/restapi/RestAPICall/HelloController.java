package com.restapi.RestAPICall;

import com.restapi.RestAPICall.DTO.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from Bridgelabz";
    }

    @GetMapping("/hello/query")
    public String greetUser(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("hello/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }


    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }


}
