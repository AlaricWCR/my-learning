package com.alaric.java.week3;

/**
 * @ClassName Point
 * @Description TODO
 * @Author Alaric
 * @Date 2020/10/19
 **/
public class Point {
    private Integer x;
    private Integer y;
    public Point() {
        System.out.println("点背初始化了");
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("带参数的点被初始化");
    }
    public void print() {
        System.out.println("横坐标：" + this.x +",纵坐标：" + this.y);
    }
}
