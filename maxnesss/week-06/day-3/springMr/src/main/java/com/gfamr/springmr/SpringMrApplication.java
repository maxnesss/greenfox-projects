package com.gfamr.springmr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringMrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMrApplication.class, args);
    }

    @RequestMapping("/svestky")
    @ResponseBody
    public String svestky(){
        return "svestky";
    }
}
