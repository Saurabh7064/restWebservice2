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


    public Todo save(Todo todo){
        if(todo.getId()==-1 || todo.getId()==0){
            todo.setId(++idCounter);
            todos.add(todo);
        }else{
            deleteById(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

    public Todo deleteById(long id){
        Todo todo = findById(id);

        if(todo==null)
            return null;

        if(todos.remove(todo)){
            return todo;
        }
        return null;
    }

    public Todo findById(long id) {
        for(Todo todo:todos)
        {
            if(todo.getId()==id) {
                return todo;
            }
        }
        return null;
    }

}
