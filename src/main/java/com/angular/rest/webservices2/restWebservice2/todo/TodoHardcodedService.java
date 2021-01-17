package com.angular.rest.webservices2.restWebservice2.todo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList();
    private static int idCounter=0;

    static{
        todos.add(new Todo( ++idCounter , " angular " , " need to complete angular " , new Date(), false ));
        todos.add(new Todo( ++idCounter , " Spring boot " , " need to complete Spring Boot " , new Date(), false ));
        todos.add(new Todo( ++idCounter , " Spring " , " need to complete Spring " , new Date(),false ));


    }

    public List<Todo> findAll(){
        return todos;
    }

}
