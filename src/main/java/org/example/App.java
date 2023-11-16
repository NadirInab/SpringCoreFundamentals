package org.example;


import org.example.entities.Task;
import org.example.entities.User;
import org.example.services.TaskServiceImplement;
import org.example.services.UserServiceImplement;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        UserServiceImplement userService = context.getBean("UserService", UserServiceImplement.class);
        User user=context.getBean("User", User.class);

        TaskServiceImplement taskService = context.getBean("TaskService",TaskServiceImplement.class);
        Task task=context.getBean("Task", Task.class);

        System.out.println( "Hello World!" );
    }
}
