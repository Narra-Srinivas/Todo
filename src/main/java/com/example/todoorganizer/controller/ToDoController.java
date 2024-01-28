package com.example.todoorganizer.controller;

import com.example.todoorganizer.model.TodoList;
import com.example.todoorganizer.repository.ToDoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class ToDoController {
    Logger logger = LoggerFactory.getLogger(ToDoController.class);
    @Autowired
    private ToDoRepository toDoRepository;
    @GetMapping("/todo")
    public List<TodoList> getAllTasks(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        int currentHour = currentDateTime.getHour();
        int currentMinute = currentDateTime.getMinute();
        logger.trace("API hit at - " + currentHour + ":" + currentMinute );
        return toDoRepository.findAll();
    }

    @PostMapping("/todo")
    public TodoList addTodoList(@RequestBody TodoList todoList){
        return toDoRepository.save(todoList);
    }
}
