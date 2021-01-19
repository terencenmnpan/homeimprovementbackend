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
}
