package com.example.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mvc.dto.TaskResponse;

@Service
public class TaskService {
    public List<TaskResponse> getAllTasks(){
        return List.of(new TaskResponse(1L,"Spring Boot MVC","in Progress"));
    }
}
