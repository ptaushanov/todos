package com.tu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                frame.dispose();
                ToDoApp app = new ToDoApp();
            }
        });
    }

    public static void main(String[] args) {
        LoginWindow login = new LoginWindow();
    }
}
