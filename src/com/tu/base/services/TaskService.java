package com.tu.base.services;

import com.tu.base.entities.Task;
import com.tu.base.exceptions.TaskNotFoundException;

import java.util.List;

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

    public String fullDescription(Integer id) throws TaskNotFoundException {
       return taskList.stream().filter(t -> t.getId().equals(id)).findFirst()
                .orElseThrow(TaskNotFoundException::new).getDescription();
    }
}
