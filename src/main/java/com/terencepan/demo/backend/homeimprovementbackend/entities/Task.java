package com.terencepan.demo.backend.homeimprovementbackend.entities;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.time.LocalDateTime;
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
    //@CreatedBy
    private String createdBy;
    private LocalDateTime createdOn;
    //@LastModifiedBy
    private String modifiedBy;
    private LocalDateTime modifiedOn;

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public List<Step> getTaskSteps() {
        return taskSteps;
    }

    public void setTaskSteps(List<Step> taskSteps) {
        this.taskSteps = taskSteps;
    }

    public List<Comment> getTaskComments() {
        return taskComments;
    }

    public void setTaskComments(List<Comment> taskComments) {
        this.taskComments = taskComments;
    }

    public List<Material> getTaskMaterials() {
        return taskMaterials;
    }

    public void setTaskMaterials(List<Material> taskMaterials) {
        this.taskMaterials = taskMaterials;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(LocalDateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}
