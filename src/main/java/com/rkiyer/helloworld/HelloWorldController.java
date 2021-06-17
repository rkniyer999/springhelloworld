package com.rkiyer.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
    public void displayHello() 
    {
     System.out.println("Hello World");
    }

}
