package com.example.yantra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Visa {
    @GetMapping("/myvisa")
    public String getData(){
        return "Please submit your visa application here";
    }
}
