package com.terencepan.demo.backend.homeimprovementbackend.services;


import com.terencepan.demo.backend.homeimprovementbackend.entities.Comment;
import com.terencepan.demo.backend.homeimprovementbackend.entities.Step;
import com.terencepan.demo.backend.homeimprovementbackend.entities.Task;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    @Override
    public void createTask(Task task) {
        
    }

    @Override
    public void removeTask(Long taskId) {

    }

    @Override
    public List<Comment> getComments(Long taskId) {
        return null;
    }

    @Override
    public List<Step> getSteps(Long taskId) {
        return null;
    }

    @Override
    public void addStep(Step step) {

    }

    @Override
    public void removeStep(Long stepId) {

    }
}
