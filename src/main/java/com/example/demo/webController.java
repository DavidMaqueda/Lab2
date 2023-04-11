package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webController {

    @RequestMapping("/webcontroller")
    public String hellohandler(){
        return "hello.html";
    }
}
