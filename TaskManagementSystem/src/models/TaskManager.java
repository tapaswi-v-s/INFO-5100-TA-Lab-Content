/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import utils.DBUtils;

/**
 *
 * @author tapas
 */
public class TaskManager {
    // Responsigble for Fetching tasks and insertion of the tasks
    DBUtils dBUtils = null;

    public TaskManager() {
        dBUtils = new DBUtils();
    }
    
    
    public List<Task> getAllTasks(){
        return dBUtils.getAllTasks();
    }
    
    public List<Task> getAllTasks(boolean status){
        return dBUtils.getAllTasks().stream()
                .filter(task -> task.getStatus() == status).toList();
    }
    
    public void insertTask(Task task){
        
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
                .format(Calendar.getInstance().getTime());
        
        task.setName(timeStamp+" "+task.getName());
        
        dBUtils.insertTask(task);
    }
}
