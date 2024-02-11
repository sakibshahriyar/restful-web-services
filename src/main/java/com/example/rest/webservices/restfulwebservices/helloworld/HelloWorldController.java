package com.example.rest.webservices.restfulwebservices.helloworld;


import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;


@RestController
public class HelloWorldController {
    private MessageSource messageSource;
    public HelloWorldController(MessageSource messageSource){
        this.messageSource=messageSource;
    }
    @GetMapping(path="/helloworld")
    public String helloWorld(){
        return "Hello World ";
    }
    @GetMapping(path="/helloworldbean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean");
    }

    @GetMapping(path ="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World,%s",name));
    }
    @GetMapping(path="/helloworldInternationalized")
    public String helloWorldInternationalized(){
        Locale locale = LocaleContextHolder.getLocale();
       return messageSource.getMessage("good.morning.message",null,"Default Message",locale);
       // return "Hello World V2 ";
    }
}
