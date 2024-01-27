package com.example.todoorganizer.controller;

import com.example.todoorganizer.model.TodoList;
import com.example.todoorganizer.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ToDoController {
    @Autowired
    private ToDoRepository toDoRepository;
    @GetMapping("/todo")
    public List<TodoList> getAllTasks(){
        return toDoRepository.findAll();
    }

}
