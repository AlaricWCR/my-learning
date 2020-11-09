package com.alaric.java.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName LoginFrame
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/9
 **/
public class LoginFrame extends JFrame {
        private JPanel mainPanel;
        private JPanel centerPanel;
        private JPanel topPanel;
        private JPanel bottomPanel;
        private JPanel leftPanel;
        private JPanel rightPanel;
    private JPanel logoPanel;
    private JPanel loginPanel;
    private JLabel logoLabel;
    private JTextField loginLable;
    private JTextField toptField;
    private JPasswordField accountField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JTextField textField1;

    public static void main(String[] args) {
        new LoginFrame();
    }

    public LoginFrame(){
        // 调用初始化方法
        init();
        loginButton.addActionListener(e -> {
            LoginService ll = new LoginService();
            String accout = textField1.getText();
            char[] password = passwordField.getPassword();
            String passString = new String(password);
            boolean result = ll.login(accout,passString);
            if (result) {
                JOptionPane.showMessageDialog(null, "登陆成功");
                LoginFrame.this.dispose();
            }
        });
    }

    private void init() {
        setTitle("LoginFrame");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
}
