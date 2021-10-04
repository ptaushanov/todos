package com.tu.ui;

import com.tu.base.entities.User;
import com.tu.base.exceptions.UserNotFoundException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.tu.base.Main.taskService;
import static com.tu.base.Main.userService;

public class LoginWindow {
    private final JFrame frame;
    private JPanel loginPanel;
    private JTextField usernameInput;
    private JPasswordField passwordInput;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JButton login;
    private JButton register;

    public LoginWindow() {
        frame = new JFrame("Login");
        frame.setContentPane(this.loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

        frame.setVisible(true);

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                RegisterWindow register = new RegisterWindow();
            }
        });

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    User currentUser = userService.login(usernameInput.getText(), String.valueOf(passwordInput.getPassword()));
                    frame.dispose();
                    ToDoApp app = new ToDoApp(currentUser);
                } catch (UserNotFoundException userNotFoundException) {
                    JOptionPane.showMessageDialog(frame, "The username or password is invalid", "Wrong credentials", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
