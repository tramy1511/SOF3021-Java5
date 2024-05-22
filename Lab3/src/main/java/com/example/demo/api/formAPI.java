package com.example.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class formAPI {
    @GetMapping("/form-Validation")
    public String doGetFormValidation(){
        return"form";
    }
}
