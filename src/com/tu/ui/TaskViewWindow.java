package com.tu.ui;

import com.tu.base.entities.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskViewWindow {
    private final JFrame frame;
    private JPanel taskViewPanel;
    private JButton closeButton;
    private JLabel titleLbl;
    private JLabel titleTextLbl;
    private JLabel descriptionLbl;
    private JLabel descriptionTextLbl;
    private JLabel importanceLbl;
    private JLabel dueDateLbl;
    private JLabel importanceTextLbl;
    private JLabel dueDateTextLbl;

    public TaskViewWindow(Task selectedTask) {
        frame = new JFrame("Task info");
        frame.setContentPane(this.taskViewPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        titleTextLbl.setText(selectedTask.getTitle());
        descriptionTextLbl.setText(selectedTask.getDescription());
        importanceTextLbl.setText(selectedTask.getImportance());
        dueDateTextLbl.setText(String.valueOf(selectedTask.getDueDate()));

        frame.pack();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

        frame.setVisible(true);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
