package com.tu.base.services;

import com.tu.base.entities.Task;
import com.tu.base.entities.User;
import com.tu.base.exceptions.TaskIsAlreadyExist;
import com.tu.base.exceptions.TaskNotFoundException;

import java.time.LocalDateTime;
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

    public void createTask(Integer id, String tittle, String description, String importance, User author ) throws TaskIsAlreadyExist {
        if(taskList.stream().anyMatch(t -> t.getId().equals(id))){
            throw new TaskIsAlreadyExist();
        }else {
            taskList.add(new Task(id, tittle, description, importance, author));
        }
    }

    public void createTask(Integer id, String tittle, String description, String importance, User author, LocalDateTime dueDate ) throws TaskIsAlreadyExist {
        if(taskList.stream().anyMatch(t -> t.getId().equals(id))){
            throw new TaskIsAlreadyExist();
        }else {
            taskList.add(new Task(id, tittle, description, importance, author, dueDate));
        }
    }

    public void editTask(Integer id, String tittle, String description, String importance ) throws TaskNotFoundException {

        Task task = taskList.stream().filter(t -> t.getId().equals(id)).findFirst().orElseThrow(TaskNotFoundException::new);
        task.setTittle(tittle);
        task.setDescription(description);
        task.setImportance(importance);

    }

    public void editTask(Integer id, String tittle, String description, String importance, LocalDateTime dueDate ) throws TaskNotFoundException {

        Task task = taskList.stream().filter(t -> t.getId().equals(id)).findFirst().orElseThrow(TaskNotFoundException::new);
        task.setTittle(tittle);
        task.setDescription(description);
        task.setImportance(importance);
        task.setDueDate(dueDate);
    }

    public String fullDescription(Integer id) throws TaskNotFoundException {
       return taskList.stream().filter(t -> t.getId().equals(id)).findFirst()
                .orElseThrow(TaskNotFoundException::new).getDescription();
    }

    public void deleteTask(Integer id) throws TaskNotFoundException{
        if(taskList.stream().noneMatch(t -> t.getId().equals(id))){
            throw new TaskNotFoundException();
        }else {
            taskList = taskList.stream().dropWhile(t -> t.getId().equals(id)).collect(Collectors.toList());
        }
    }
}
