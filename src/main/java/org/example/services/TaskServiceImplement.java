package org.example.services;

import org.example.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.repo.TaskRepo;


import java.util.List;
import java.util.Optional;


public class TaskServiceImplement {

    private TaskRepo taskRepository;

    @Autowired
    public TaskServiceImplement(TaskRepo taskRepository){
        this.taskRepository = taskRepository;
    }

    public void saveTask(Task task){
        taskRepository.save(task);
    }

    public void deleteTask(Task task){
        taskRepository.delete(task);
    }

    public List<Task> findTasks(){
        return taskRepository.findAll();
    }

    public Optional<Task> findTask(Long id){
        return  taskRepository.findById(id);
    }

}
