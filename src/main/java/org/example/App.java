package org.example;


import org.example.entities.Goal;
import org.example.entities.Task;
import org.example.entities.User;
import org.example.services.GoalService;
import org.example.services.TaskServiceImplement;
import org.example.services.UserServiceImplement;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        UserServiceImplement userService = context.getBean("UserService", UserServiceImplement.class);
        User user=context.getBean("User", User.class);

        TaskServiceImplement taskService = context.getBean("TaskService",TaskServiceImplement.class);
        Task task=context.getBean("Task", Task.class);

        GoalService goalService = context.getBean("GoalService", GoalService.class) ;
        Goal goal = context.getBean("Goal", Goal.class) ;


        user.setName("John doe");
        user.setEmail("john@gmail.com");
        user.setPassword("password");


        goal.setName("featured");
        goal.setStatus("to do");
        goal.setUser(userService.getUserById(1L));
        goal.setCreatedDate(new java.util.Date(System.currentTimeMillis()));
        goal.setEndDate(Date.valueOf("2024-02-02"));
        goalService.saveGoal(goal);


        task.setName("learn JS");
        task.setStatus("to do");
        task.setCreatedDate(new java.util.Date(System.currentTimeMillis()));
        task.setEndDate(Date.valueOf("2024-01-02"));
        task.setGoal(goalService.getGoal(1L).get());
        taskService.saveTask(task);

        Task task2=context.getBean("Task",Task.class);
        task2.setName("in progresse");
        task2.setStatus("to do");
        task2.setCreatedDate(new java.util.Date(System.currentTimeMillis()));
        task2.setEndDate(Date.valueOf("2024-01-02"));
        task2.setGoal(goalService.getGoal(1L).get());
        taskService.saveTask(task2);


        Task task3=context.getBean("Task",Task.class);
        task3.setName("Learn English");
        task3.setStatus("done");
        task3.setCreatedDate(new java.util.Date(System.currentTimeMillis()));
        task3.setEndDate(Date.valueOf("2024-01-02"));
        task3.setGoal(goalService.getGoal(1L).get());
        taskService.saveTask(task3);

        System.out.println( "Hello World!" );

        List<Task> tasks = taskService.findTasks();
        System.out.println("All Tasks: " + tasks);

        context.close();
    }
}