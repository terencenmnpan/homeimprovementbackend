package com.terencepan.demo.backend.homeimprovementbackend.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String taskName;
    private String taskDescription;
    @OneToMany
    private List<Step> taskSteps;
    @OneToMany
    private List<Comment> taskComments;
    @OneToMany
    private List<Material> taskMaterials;
    @OneToOne
    private User createdBy;

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskId() {
        return taskId;
    }
}
