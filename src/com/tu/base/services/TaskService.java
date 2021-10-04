package com.tu.base.services;

import com.tu.base.entities.Task;
import com.tu.base.exceptions.TaskIsAlreadyExist;
import com.tu.base.exceptions.TaskNotFoundException;
import com.tu.base.exceptions.UserNotFoundException;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService {

    private List<Task> taskList;

    public TaskService(List<Task> taskList) {
        this.taskList = taskList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public void createTask(Integer id, String title, String description, String importance, Integer userId ) throws TaskIsAlreadyExist {
        if(taskList.stream().anyMatch(t -> t.getId().equals(id))){
            throw new TaskIsAlreadyExist();
        }else {
            taskList.add(new Task(id, title, description, importance, userId));
        }
    }

    public void createTask(Integer id, String title, String description, String importance, Integer userId, Date dueDate ) throws TaskIsAlreadyExist {
        if(taskList.stream().anyMatch(t -> t.getId().equals(id))){
            throw new TaskIsAlreadyExist();
        }else {
            taskList.add(new Task(id, title, description, importance, userId, dueDate));
        }
    }

    public void editTask(Integer id, String title, String description, String importance ) throws TaskNotFoundException {

        Task task = taskList.stream().filter(t -> t.getId().equals(id)).findFirst().orElseThrow(TaskNotFoundException::new);
        task.setTitle(title);
        task.setDescription(description);
        task.setImportance(importance);

    }

    public void editTask(Integer id, String title, String description, String importance, Date dueDate ) throws TaskNotFoundException {

        Task task = taskList.stream().filter(t -> t.getId().equals(id)).findFirst().orElseThrow(TaskNotFoundException::new);
        task.setTitle(title);
        task.setDescription(description);
        task.setImportance(importance);
        task.setDueDate(dueDate);
    }

    // #Depricated
    public String fullDescription(Integer id) throws TaskNotFoundException {
       return taskList.stream().filter(t -> t.getId().equals(id)).findFirst()
                .orElseThrow(TaskNotFoundException::new).getDescription();
    }

    public void deleteTask(Integer id) throws TaskNotFoundException{
        System.out.println(id);
        if(taskList.stream().noneMatch(t -> t.getId().equals(id))){
            throw new TaskNotFoundException();
        }else {
            taskList = taskList.stream().filter(t -> !t.getId().equals(id)).collect(Collectors.toList());
        }
    }

    public List<Task> displayUserTasks(Integer userId)  {
        return taskList.stream().filter(t -> t.getUserId().equals(userId))
                .collect(Collectors.toList());

    }
}
