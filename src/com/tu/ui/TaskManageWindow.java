package com.tu.ui;

import com.tu.base.entities.Task;
import com.tu.base.exceptions.TaskIsAlreadyExist;
import com.tu.base.exceptions.TaskNotFoundException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

import static com.tu.base.Main.taskService;

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

    public TaskManageWindow(String title, String actionText, Integer userId, Optional<Task> currentTask) {
        frame = new JFrame(title);
        frame.setContentPane(this.taskManagePanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        actionButton.setText(actionText);
        importanceComboBox.addItem("High");
        importanceComboBox.addItem("Medium");
        importanceComboBox.addItem("Low");

        insertDataIntoForm(currentTask);

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

        actionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Calendar cal = Calendar.getInstance();
                    Date dueDate = null;
                    if(dueDateCheckBox.isSelected()) {
                        cal.set(Calendar.YEAR, Integer.parseInt(yearInput.getText()));
                        cal.set(Calendar.MONTH, Integer.parseInt(monthInput.getText()));
                        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dayInput.getText()));
                        cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hourInput.getText()));
                        cal.set(Calendar.MINUTE, Integer.parseInt(minuteInput.getText()));
                        dueDate = cal.getTime();
                    }

                    if(currentTask.isEmpty()){
                        taskService.createTask((int)Math.floor(Math.random() * Integer.MAX_VALUE),
                                titleInput.getText(),
                                descriptionTextarea.getText(),
                                (String) importanceComboBox.getSelectedItem(),
                                userId, dueDate);
                    }
                    else {
                        taskService.editTask(currentTask.get().getId(),
                                titleInput.getText(),
                                descriptionTextarea.getText(),
                                (String) importanceComboBox.getSelectedItem(),
                                dueDate);
                    }

                    frame.dispose();
                } catch (TaskIsAlreadyExist taskIsAlreadyExist) {
                    JOptionPane.showMessageDialog(frame, taskIsAlreadyExist.getMessage(), "Task exists", JOptionPane.ERROR_MESSAGE);
                } catch (TaskNotFoundException taskNotFoundException) {
                    JOptionPane.showMessageDialog(frame, taskNotFoundException.getMessage(), "Missing task", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void insertDataIntoForm(Optional<Task> currentTask) {
        if(currentTask.isPresent()) {
            Task taskToUpdate = currentTask.get();
            titleInput.setText(taskToUpdate.getTitle());
            descriptionTextarea.setText(taskToUpdate.getDescription());
            importanceComboBox.setSelectedItem(taskToUpdate.getImportance());

            if(taskToUpdate.getDueDate() != null) {
                Calendar cal = Calendar.getInstance();
                cal.setTime(taskToUpdate.getDueDate());

                dueDateCheckBox.setSelected(true);

                yearInput.setText(String.valueOf(cal.get(Calendar.YEAR)));
                monthInput.setText(String.valueOf(cal.get(Calendar.MONTH)));
                dayInput.setText(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
                hourInput.setText(String.valueOf(cal.get(Calendar.HOUR)));
                minuteInput.setText(String.valueOf(cal.get(Calendar.MINUTE)));
            }
        }
    }

}
