package com.example.demo.web;

import com.example.demo.domain.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    /*
    curl  --header "Content-Type: application/json" \
          --request POST \
          --data '{"description":"configuration","details":"congratulations, you have set up R2DBC correctly!","done": "true"}' \
          http://127.0.0.1:8080
    */
    @PostMapping("/todo")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    // curl http://127.0.0.1:8080
    @GetMapping("/todo")
    public Collection<Todo> getTodos() {
        return todoRepository.findAll();
    }
}
