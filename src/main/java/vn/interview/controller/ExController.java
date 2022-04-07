package vn.interview.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
}