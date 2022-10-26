package com.RestfulWebServices.RestfulWebServices.Welcome;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class WelcomeController {
    private MessageSource messageSource;
    public WelcomeController(MessageSource messageSource)
    {
        this.messageSource=messageSource;
    }
   @GetMapping(path="/welcome")
   public String  welcome()
   {
       return "Welcome to Spring Boot";
   }
    @GetMapping(path="/username")
    public String  user()
    {
        return "Hello "+messageSource.getMessage("username.message",null,Locale.ENGLISH)+"!";
    }
   @GetMapping(path="/welcome-internationalized")
    public String welcomeInternationalized()
   {
     Locale locale= LocaleContextHolder.getLocale();
      return messageSource.getMessage("welcome.message",null,"Default message",locale);
   }
}
