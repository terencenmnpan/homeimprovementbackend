package com.terencepan.demo.backend.homeimprovementbackend.controllers;

import com.terencepan.demo.backend.homeimprovementbackend.dtos.TaskDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TaskController {

    @PostMapping
    public void createNewTask(
            @Valid @RequestBody TaskDto taskDto){

    }
}
