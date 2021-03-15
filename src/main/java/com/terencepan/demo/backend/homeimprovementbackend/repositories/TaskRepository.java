package com.terencepan.demo.backend.homeimprovementbackend.repositories;

import com.terencepan.demo.backend.homeimprovementbackend.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
