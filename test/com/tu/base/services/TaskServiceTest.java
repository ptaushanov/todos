package com.tu.base.services;

import com.tu.base.entities.Task;
import com.tu.base.entities.User;
import com.tu.base.exceptions.TaskNotFoundException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TaskServiceTest {

    private TaskService taskService;

    @Before
    public void setUp() throws Exception {
        Task[] tasks = new Task[]{
                new Task(1, "first", "description", "importance", new User("ivan", "123")),
                new Task(2, "second", "description", "importance", new User("sasho", "123")),
                new Task(3, "third", "description", "importance", new User("pesho", "123"))
        };

        taskService = new TaskService(new ArrayList<>(Arrays.asList(tasks)));
    }

    @Test
    public void createTask() {
    }

    @Test
    public void testCreateTask() {
    }

    @Test
    public void editTask() throws TaskNotFoundException {
        taskService.editTask(1, "firstE", "descriptionE", "importanceE");

        assertEquals(
                taskService.getTaskList().stream().filter(task -> task.getId() == 1)
                        .findFirst().get().getTittle(), "firstE");
    }

    @Test
    public void testEditTask() {
    }

    @Test
    public void fullDescription() {
    }

    @Test
    public void deleteTask() {
    }
}