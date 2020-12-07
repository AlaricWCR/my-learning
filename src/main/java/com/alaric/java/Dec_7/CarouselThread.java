package com.alaric.java.Dec_7;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName CarouselThread
 * @Description TODO
 * @Author Alaric
 * @Date 2020/12/7
 **/
public class CarouselThread implements Runnable {
    private String[] imgs = {
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607356150015&di=e63473033122093f6023015781b13e38&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F52%2F62%2F31300542679117141195629117826.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607356445207&di=0d1b2722cacbdc4a989e32a5dcfa9ebb&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F22%2F59%2F19300001325156131228593878903.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607356479316&di=b1c9b9d17483f0e28dfa30f08385d8fd&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F45%2F36%2F14300000491308128107360639165.jpg"


    };

    //创建显示图片的组件
    private JLabel bgLabel;

    public void setBgLable(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        int index = 0;
        int len = imgs.length;
        while (true) {
            //创建网络连接
            try {
                //创建URL
                URL url = new URL(imgs[index]);
                //创建了连接
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(5000);
                //得到连接目标的字节输入流
                InputStream is = conn.getInputStream();
                //字节缓冲输出流
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                //缓冲区
                byte[] buffer = new byte[1024];
                int lenth = 0;
                //通过缓冲区读取文件
                while ((lenth = is.read(buffer)) != -1) {
                    baos.write(buffer, 0, lenth);
                }
                byte[] bytes = baos.toByteArray();
                //将字节数组通过字节输入流读入
                is.read(bytes);
                //通过btyes构建图标icon
                Icon icon = new ImageIcon(bytes);
                //将icon设置为背景标签的图标
                this.bgLabel.setIcon(icon);
                Thread.sleep(3000);
                baos.close();
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            index ++ ;
            //处理数组最后一个元素
            if (index == len) {
                index = 0;
            }
        }
    }
}
