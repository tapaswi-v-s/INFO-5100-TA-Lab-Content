/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;
import java.util.List;
import models.Task;

/**
 *
 * @author tapas
 */
public class DBUtils {
    // responsible for contacting Database
    
    // Singleton Pattern
    private static DBUtils single_instance = null;

    public DBUtils() {}

    public static synchronized DBUtils getInstance(){
        if (single_instance == null)
            single_instance = new DBUtils();

        return single_instance;
    }
    
    List<Task> tasks = new ArrayList<>(){{
        add(new Task("Task 1", false));
        add(new Task("Task 2", true));
        add(new Task("Task 3", false));
        add(new Task("Task 4", true));
    }};
    
    public List<Task> getAllTasks(){
//        Write the logic to query the db
        return tasks;
    }
    
//    public List<Task> getAllTasks(boolean status){
////        Write the logic to query the db
//        return tasks.stream().filter(obj -> obj.getStatus() == status).toList();
//    }
  
    public void insertTask(Task task) {
        
        tasks.add(task);
    }
}
