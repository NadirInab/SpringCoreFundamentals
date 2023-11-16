package org.example.services;

import org.example.entities.Goal;
import org.example.repo.GoalRepo;

import java.util.List;
import java.util.Optional;

public class GoalService {

    private final GoalRepo GoalRepo;

    public GoalService (GoalRepo GoalRepo){
        this.GoalRepo = GoalRepo;
    }

    public void saveGoal(Goal goal){
        GoalRepo.save(goal);
    }

    public void deleteGoal(Goal goal){
        GoalRepo.delete(goal);
    }

    public List<Goal> getAllGoals(){
        return GoalRepo.findAll();
    }

    public Optional<Goal> getGoal(Long id){
        return GoalRepo.findById(id);
    }
}
