/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.List;
import models.Task;
import models.TaskManager;

/**
 *
 * @author tapas
 */
public class TaskController {
    
    TaskManager taskManager = null;

    public TaskController() {
        taskManager = new TaskManager();
    }
    
    public void insertTask(Task task){
        taskManager.insertTask(task);
    }
    
    public List<Task> getAllTasks(){
        return taskManager.getAllTasks();
    }
    
    public List<Task> getAllTasks(boolean status){
        return taskManager.getAllTasks(status);
    }
    
    
}
