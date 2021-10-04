package com.tu.ui;

import com.tu.base.exceptions.UserIsAlreadyExistException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import static com.tu.base.Main.userService;

public class RegisterWindow {
    private JPanel registerPanel;
    private JTextField usernameInput;
    private JPasswordField passwordInput;
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

        registerButton.setEnabled(false);

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
        iHaveReadTheCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                registerButton.setEnabled(e.getStateChange() == ItemEvent.SELECTED);
            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    userService.register(usernameInput.getText(), String.valueOf(passwordInput.getPassword()));
                    LoginWindow loginWindow = new LoginWindow();
                    frame.dispose();
                } catch (UserIsAlreadyExistException userIsAlreadyExistException) {
                    JOptionPane.showMessageDialog(frame, "The username is already taken", "Username exists", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
