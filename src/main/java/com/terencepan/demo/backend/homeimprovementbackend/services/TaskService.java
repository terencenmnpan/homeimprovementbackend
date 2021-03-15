package com.terencepan.demo.backend.homeimprovementbackend.services;

import com.terencepan.demo.backend.homeimprovementbackend.entities.Comment;
import com.terencepan.demo.backend.homeimprovementbackend.entities.Step;
import com.terencepan.demo.backend.homeimprovementbackend.entities.Task;

import java.util.List;

public interface TaskService {

    void createTask(Task task);
    void removeTask(Long taskId);
    List<Comment> getComments(Long taskId);
    List<Step> getSteps(Long taskId);
    void addStep(Step step);
    void removeStep(Long stepId);
}
