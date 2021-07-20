package com.tu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterWindow {
    private JPanel registerPanel;
    private JTextField usernameInput;
    private JTextField passwordInput;
    private JButton registerButton;
    private JButton loginButton;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JCheckBox iHaveReadTheCheckBox;
    private final JFrame frame;

    public RegisterWindow() {
        frame = new JFrame("Register");

        frame.setContentPane(this.registerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

        frame.setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LoginWindow login = new LoginWindow();
            }
        });
    }

    public static void main(String[] args) {
        RegisterWindow register = new RegisterWindow();
    }
}
