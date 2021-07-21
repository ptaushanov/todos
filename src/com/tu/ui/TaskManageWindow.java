package com.tu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TaskManageWindow {
    private final JFrame frame;
    private JPanel taskManagePanel;
    private JTextField titleInput;
    private JTextArea descriptionTextarea;
    private JComboBox<String> importanceComboBox;
    private JCheckBox dueDateCheckBox;
    private JTextField minuteInput;
    private JTextField yearInput;
    private JTextField dayInput;
    private JTextField monthInput;
    private JTextField hourInput;
    private JButton actionButton;
    private JLabel titleLbl;
    private JLabel descriptionLbl;
    private JLabel importanceLbl;
    private JLabel dayLbl;
    private JLabel monthLbl;
    private JLabel yearLbl;
    private JLabel hourLbl;
    private JLabel minuteLbl;
    private JPanel dueDatePanel;

    public TaskManageWindow(String title, String actionText) { // TODO: Add Optional task information
        frame = new JFrame(title);
        frame.setContentPane(this.taskManagePanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        actionButton.setText(actionText);
        importanceComboBox.addItem("ASAP");
        importanceComboBox.addItem("Very High");
        importanceComboBox.addItem("High");
        importanceComboBox.addItem("Low");
        importanceComboBox.addItem("Very Low");

        dueDatePanel.setVisible(false);

        frame.pack();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

        frame.setVisible(true);
        dueDateCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                dueDatePanel.setVisible(e.getStateChange() == ItemEvent.SELECTED);
                frame.pack();
            }
        });
    }

    public static void main(String[] args) {
        TaskManageWindow taskManageWindow = new TaskManageWindow("Add Task", "Add");
    }
}
