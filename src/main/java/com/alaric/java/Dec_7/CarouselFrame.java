package com.alaric.java.Dec_7;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

/**
 * @ClassName CarouselFrame
 * @Description TODO
 * @Author Alaric
 * @Date 2020/12/7
 **/
public class CarouselFrame extends JFrame {
    private JLabel bglabel;
    private JLabel timeLabel;
    private JLabel textLabel;
    public CarouselFrame() {
        init();
        setTitle("CarouselFrame");
        setSize(1024,768);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(90, 45, 127));
    }

    private void init() {
        bglabel = new JLabel();
        CarouselThread ct = new CarouselThread();
        ct.setBgLable(bglabel);
        new Thread(ct).start();
        this.getContentPane().add(bglabel, BorderLayout.CENTER);
        //时间线程和标签
        timeLabel = new JLabel();
        timeLabel.setFont(new Font ("宋体", Font.BOLD, 28));
        this.getContentPane().add(timeLabel,BorderLayout.SOUTH);
        TimeThread tt = new TimeThread();
        tt.setTimeLabel(timeLabel);
        new Thread(tt).start();
        //文本
        textLabel = new JLabel();
        textLabel.setFont(new Font("微软雅黑",Font.BOLD,28));
        this.getContentPane().add(textLabel,BorderLayout.NORTH);
        TextThread tet = new TextThread();
        tet.setTextLabel(textLabel);
        new Thread(tet).start();
    }

    public static void main(String[] args) {
        new CarouselFrame();
    }
}
