package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello, World?!";
    }
	
	@RequestMapping("/hello")
    @ResponseBody
    public String home2() {
        return "Alternate Hello, World to github!";
    }
	
	@RequestMapping("/testpage")
    public String testpage() {
        return "testpage";
    }

    public static void main(String[] arguments) {
        SpringApplication.run(HelloWorldController.class, arguments);
    }

}