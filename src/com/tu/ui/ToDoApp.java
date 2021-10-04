package com.tu.ui;

import com.tu.base.entities.Task;
import com.tu.base.entities.User;
import com.tu.base.exceptions.TaskNotFoundException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

import static com.tu.base.Main.taskService;

public class ToDoApp {

    private final JFrame frame;
    private JPanel mainPanel;
    private JList<Task> taskList;
    private JScrollPane scrollPanel;
    private JButton newButton;
    private JButton deleteButton;
    private JButton updateButton;
    private JButton viewButton;
    private JLabel usernameLbl;
    private JButton refreshListButton;

    public ToDoApp(User currentUser){
        frame = new JFrame("ToDo List");
        frame.setContentPane(this.mainPanel);
        frame.setMinimumSize(new Dimension(900, 500));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

        usernameLbl.setText(currentUser.getUsername());
        updateListOfTasks(currentUser);

        frame.setVisible(true);

        taskList.setVisibleRowCount(8);
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TaskManageWindow newTasksWindow = new TaskManageWindow("Add Task", "Add", currentUser.getId(), Optional.empty());
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(taskList.isSelectionEmpty()) return;

                Task selectedTask = taskList.getSelectedValue();
                TaskManageWindow updateTasksWindow = new TaskManageWindow("Update Task", "Update", currentUser.getId(), Optional.of(selectedTask));
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(taskList.isSelectionEmpty()) return;

                Task selectedTask = taskList.getSelectedValue();
                try {
                    taskService.deleteTask(selectedTask.getId());
                    updateListOfTasks(currentUser);
                } catch (TaskNotFoundException taskNotFoundException) {
                    JOptionPane.showMessageDialog(frame, "Task was not found", "Not found", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(taskList.isSelectionEmpty()) return;
                Task selectedTask = taskList.getSelectedValue();
                TaskViewWindow taskView = new TaskViewWindow(selectedTask);
            }
        });
        refreshListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateListOfTasks(currentUser);
            }
        });
    }

    private void updateListOfTasks(User currentUser) {
        taskList.setListData(taskService.displayUserTasks(currentUser.getId()).toArray(Task[]::new));
    }

}

