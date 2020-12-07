package com.alaric.java.Dec_7;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;

/**
 * @ClassName LineFrame
 * @Description TODO
 * @Author Alaric
 * @Date 2020/12/7
 **/
public class LineFrame extends JFrame {
    public LineFrame() {
        init();
        getContentPane().setBackground(new Color(0,0,0));
        setTitle("Line frame");
        setSize(1024,768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        LineThread lt = new LineThread();
        lt.setFrame(this);
        new Thread(lt).start();
    }

    public static void main(String[] args) {
        new LineFrame();
    }
}
