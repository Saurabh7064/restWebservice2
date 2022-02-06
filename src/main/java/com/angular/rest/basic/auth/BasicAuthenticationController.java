package com.angular.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BasicAuthenticationController {

    @GetMapping("/basicAuth")
    public AuthenticationBean helloWorldBean()  {
        //return new HelloWorldBean("Hello World App is up and running");
        return new AuthenticationBean(" you are successfully Authenticated ");
    }


    }
