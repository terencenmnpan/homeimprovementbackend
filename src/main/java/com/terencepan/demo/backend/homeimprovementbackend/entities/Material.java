package com.terencepan.demo.backend.homeimprovementbackend.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Material {
    private String materialId;

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    @Id
    public String getMaterialId() {
        return materialId;
    }
}
