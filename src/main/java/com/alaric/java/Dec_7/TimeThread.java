package com.alaric.java.Dec_7;

import javax.swing.*;
import java.time.LocalDateTime;

/**
 * @ClassName TimeThread
 * @Description TODO 时间线程
 * @Author Alaric
 * @Date 2020/12/7
 **/
public class TimeThread implements Runnable {
    private JLabel timeLabel;

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }

    @Override
    public void run() {
        while (true) {
            timeLabel.setText(LocalDateTime.now().toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
