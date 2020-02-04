package com.cuit.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllera {
    @ResponseBody
    @RequestMapping("index")
    public String indeasd() {
        return "hello world";
    }
}
