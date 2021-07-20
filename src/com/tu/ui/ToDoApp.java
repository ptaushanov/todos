package com.tu.ui;

import javax.swing.*;
import java.awt.*;

public class ToDoApp {

    private static class Tasks {
        private String taskName;
        private String importance;

        public Tasks(String taskName, String importance) {
            this.taskName = taskName;
            this.importance = importance;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public String getImportance() {
            return importance;
        }

        public void setImportance(String importance) {
            this.importance = importance;
        }

        @Override
        public String toString() {
            return "<html><br/>Task: " + taskName + "<br/>Importance: " + importance;
        }
    }

    private final JFrame frame;
    private JPanel mainPanel;
    private JList<Tasks> taskList;
    private JScrollPane scrollPanel;
    private JButton newButton;
    private JButton deleteButton;
    private JButton updateButton;
    private JButton refreshListButton;
    private JButton viewButton;

    public ToDoApp(){
        frame = new JFrame("ToDo List");
        frame.setContentPane(this.mainPanel);
        frame.setMinimumSize(new Dimension(900, 500));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

        frame.setVisible(true);

        Tasks[] products = new Tasks[10];
        products[0] = new Tasks("Clean up the room!", "Low");
        products[1] = new Tasks("Trow out the trash", "ASAP");
        products[2] = new Tasks("Go to the vet for the dog", "High");
        products[3] = new Tasks("Task 4", "High");
        products[4] = new Tasks("Task 5", "High");
        products[5] = new Tasks("Task 6", "High");
        products[6] = new Tasks("Task 7", "High");
        products[7] = new Tasks("Task 8", "High");
        products[8] = new Tasks("Task 9", "High");
        products[9] = new Tasks("Task 10", "High");

        taskList.setListData(products);
        taskList.setVisibleRowCount(8);
    }

    public static void main(String[] args) {
        ToDoApp app = new ToDoApp();
    }
}

