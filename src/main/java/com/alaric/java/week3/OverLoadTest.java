package com.alaric.java.week3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName OverLoadTest
 * @Description TODO
 * @Author Alaric
 * @Date 2020/10/19
 **/

public class OverLoadTest {
    public static int  sum(int a, int b) {
        return a + b;
    }
    public static String sum(String s1, String s2) {
       return s1 + s2;
    }
}
