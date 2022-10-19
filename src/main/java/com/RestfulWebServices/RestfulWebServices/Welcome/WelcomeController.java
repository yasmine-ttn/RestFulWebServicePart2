package com.RestfulWebServices.RestfulWebServices.Welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
   @GetMapping(path="/welcome")
   public String  welcome()
   {
       return "Welcome to Spring Boot";
   }
}
