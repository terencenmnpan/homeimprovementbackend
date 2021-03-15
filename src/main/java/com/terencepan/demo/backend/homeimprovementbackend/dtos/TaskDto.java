package com.terencepan.demo.backend.homeimprovementbackend.dtos;

import com.terencepan.demo.backend.homeimprovementbackend.entities.Comment;
import com.terencepan.demo.backend.homeimprovementbackend.entities.Material;
import com.terencepan.demo.backend.homeimprovementbackend.entities.Step;

import java.util.List;

public class TaskDto {
    private String taskName;
    private String taskDescription;
    private List<Step> taskSteps;
    private List<Material> taskMaterials;
    private List<Comment> comments;
}
