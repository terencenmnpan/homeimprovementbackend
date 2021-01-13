package com.terencepan.demo.backend.homeimprovementbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Step {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stepId;

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    public Long getStepId() {
        return stepId;
    }
}
