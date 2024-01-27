package com.example.todoorganizer.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "todolist")
public class TodoList {
    public TodoList() {
    }

    public TodoList(long id, String taskName, String description, LocalDateTime createdAt, LocalDateTime dueBy, Integer duration_in_mins, String hashtags, String status, String comment, Integer priority, String resource) {
        super();
        this.id = id;
        this.taskName = taskName;
        this.description = description;
        this.createdAt = createdAt;
        this.DueBy = dueBy;
        this.duration_in_mins = duration_in_mins;
        this.hashtags = hashtags;
        this.status = status;
        this.comment = comment;
        this.priority = priority;
        this.resource = resource;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "task_name")
    private String taskName;
    @Column(name = "description")
    private String description;
    @Column(name = "created")
    private LocalDateTime createdAt;
    @Column(name = "due_date")
    private LocalDateTime DueBy;
    @Column(name = "Duration")
    private Integer duration_in_mins;
    @Column(name = "tags")
    private String hashtags;
    @Column(name = "status")
    private String status;
    @Column(name = "comment")
    private String comment;
    @Column(name = "priority")
    private Integer priority;
    @Column(name = "resource")
    private String resource;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getDueBy() {
        return DueBy;
    }

    public void setDueBy(LocalDateTime dueBy) {
        DueBy = dueBy;
    }

    public Integer getDuration_in_mins() {
        return duration_in_mins;
    }

    public void setDuration_in_mins(Integer duration_in_mins) {
        this.duration_in_mins = duration_in_mins;
    }

    public String getHashtags() {
        return hashtags;
    }

    public void setHashtags(String hashtags) {
        this.hashtags = hashtags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

}
