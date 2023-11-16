package org.example.repo;

import org.example.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository <Task, Long> {
}
