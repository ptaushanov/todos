package com.tu.ui;

import javax.swing.*;

public class ToDoApp {

    private JPanel mainPanel;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ToDoApp");
        frame.setContentPane(new ToDoApp().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

