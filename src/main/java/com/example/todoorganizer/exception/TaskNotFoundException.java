package com.example.todoorganizer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TaskNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -634109245657300142L;
    public TaskNotFoundException(String message) {
        super(message);
    }
}
