package com.alaric.java.week3;

/**
 * @ClassName OverLoadTestApp
 * @Description TODO
 * @Author Alaric
 * @Date 2020/10/19
 **/
public class OverLoadTestApp {
    public static void main(String[] args) {
       int sum1 = OverLoadTest.sum(4,5);
       System.out.println(sum1);
       String sum2 = OverLoadTest.sum("","Java");
       System.out.println(sum2);
    }
}
