package com.angular.rest.webservices2.restWebservice2.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodoJpaResource {

    @Autowired
    private TodoHardcodedService todoService;

    @GetMapping("/jpa/users/{username}/todos")
    public List<Todo> getAllTodos( @PathVariable String username){
        return todoService.findAll();
    }

    @GetMapping("/jpa/users/{username}/todos/{id}")
    public Todo getTodo( @PathVariable String username, @PathVariable long id){
        return todoService.findById(id);
    }

    @DeleteMapping("/jpa/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username , @PathVariable long id){
        Todo todo = todoService.deleteById(id);
        if(todo != null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/jpa/users/{username}/todos/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable String username , @PathVariable long id, @RequestBody Todo todo) {
        Todo todoUpdated = todoService.save(todo);

        return new ResponseEntity<Todo>(todo,HttpStatus.OK);

    }

    @PostMapping("/jpa/users/{username}/todos/{id}")
    public ResponseEntity<Void> createTodo(@PathVariable String username , @RequestBody Todo todo) {
        Todo createdTodo = todoService.save(todo);


        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }


}
