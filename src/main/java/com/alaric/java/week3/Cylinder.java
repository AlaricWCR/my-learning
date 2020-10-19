package com.alaric.java.week3;

/**
 * @ClassName Cylinder
 * @Description TODO
 * @Author Alaric
 * @Date 2020/10/19
 **/
public class Cylinder extends Circle {
    private int h;
    public Cylinder(int x, int y, int r, int n) {
        super(x, y, r);
        this.h = h;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("圆柱体的体积："+super.getArea() * this.h);
    }
}
