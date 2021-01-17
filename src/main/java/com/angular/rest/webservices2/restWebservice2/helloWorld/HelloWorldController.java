package com.angular.rest.webservices2.restWebservice2.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        //return new HelloWorldBean("Hello World App is up and running");
        throw new RuntimeException("Hello World App is down ");
    }

        @GetMapping(path="/hello-world/path-variable/{name}")
        public HelloWorldBean helloWorldPathVariable(@PathVariable String name ){
            return new HelloWorldBean (String.format("Hello World,%s",name));
        }
    }
