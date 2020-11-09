package com.alaric.java.frame;

import com.alaric.java.week2.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName StudentFrame
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/8
 **/
public class StudentForm {
    private JPanel mainPanel;
    private JButton button3;
    private JButton button4;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JButton button2;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JPanel leftPanel;
    private JTextField nameField;
    private JButton 检查Button;
    private JTextField weightField;
    private JLabel resultLable;

    public StudentForm() {
        检查Button.addActionListener(e -> {
            // 点击按钮需要做的逻辑
            System.out.println("click");
            String name = nameField.getText();
            int weight = Integer.parseInt(weightField.getText());
            student student = new student(name, weight);
            if (weight > 100) {
                resultLable.setText(student.getName() + "体检未通过");
            } else {
                resultLable.setText(student.getName() + "体检通过了");
            }
            nameField.setText("");
            weightField.setText("");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentForm");
        frame.setContentPane(new StudentForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}