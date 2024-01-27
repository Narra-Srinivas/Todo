package com.example.todoorganizer.repository;

import com.example.todoorganizer.model.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<TodoList, Long > {


}
