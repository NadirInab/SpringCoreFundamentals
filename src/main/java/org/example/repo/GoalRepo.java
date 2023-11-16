package org.example.repo;

import org.example.entities.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepo extends JpaRepository <Goal, Long> {
}
