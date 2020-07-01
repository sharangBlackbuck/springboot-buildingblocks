package com.stacksimplify.restservices.Hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

//    @RequestMapping(method = RequestMethod.GET,path="/helloWorld")
    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "hello World1";
    }

    @GetMapping("/helloWorld-bean")
    public UserDetails helloWorldBean(){
        return new UserDetails("sharang","malhotra","Haridwar");
    }
}
