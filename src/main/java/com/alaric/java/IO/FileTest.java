package com.alaric.java.IO;

import java.io.File;
import java.time.LocalDate;

/**
 * @ClassName FileTest
 * @Description TODO file类测试
 * @Author Alaric
 * @Date 2020/11/30
 **/
public class FileTest {
    public static void main(String[] args) {
        // 1.课堂练习1：创建目录，用当前系统日期命名
//        LocalDate today = LocalDate.now();
//        String dirName = today.getYear() + "-" + today.getMonthValue()  + "-" + today.getDayOfMonth();
//        File dir = new File("F:\\code\\" + dirName);
//        if(!dir.exists()) {
//            boolean flag = dir.mkdirs();
//            System.out.println(flag);
//        }
        // 课堂练习1-2.删除刚才创建的目录，注意判断是否存在
//        if(dir.exists()){
//            boolean flag = dir.delete();
//            if (flag) {
//                System.out.println("删除成功！");
//            } else {
//                System.out.println("目录不存在！");
//            }
//        }
        //课堂练习1-3：递归创建目录，顶级目录名：Java，一级目录名：面向对象、异常、集合、io、多线程，io下目录： 字符流、字节流


        File directoriesTop = new File("F:\\Java");
        if (directoriesTop.mkdirs()) {
            System.out.println("创建多级目录成功");
        } else {
            System.out.println("创建多级目录失败");
        }
        File directoriesFirst1 = new File("F:\\Java\\面向对象");
        if (directoriesFirst1.mkdirs()) {
            System.out.println("创建多级目录成功");
        } else {
            System.out.println("创建多级目录失败");
        }
        File directoriesFirst2 = new File("F:\\Java\\异常");
        if (directoriesFirst2.mkdirs()) {
            System.out.println("创建多级目录成功");
        } else {
            System.out.println("创建多级目录失败");
        }
        File directoriesFirst3 = new File("F:\\Java\\集合");
        if (directoriesFirst3.mkdirs()) {
            System.out.println("创建多级目录成功");
        } else {
            System.out.println("创建多级目录失败");
        }
        File directoriesFirst4 = new File("F:\\Java\\io");
        if (directoriesFirst4.mkdirs()) {
            System.out.println("创建多级目录成功");
        } else {
            System.out.println("创建多级目录失败");
        }
        File directoriesFirst5 = new File("F:\\Java\\多线程");
        if (directoriesFirst5.mkdirs()) {
            System.out.println("创建多级目录成功");
        } else {
            System.out.println("创建多级目录失败");
        }
        File directoriesSecond1 = new File("F:\\Java\\io\\字符流");
        if (directoriesSecond1.mkdirs()) {
            System.out.println("创建多级目录成功");
        } else {
            System.out.println("创建多级目录失败");
        }
        File directoriesSecond2 = new File("F:\\Java\\io\\字节流");
        if (directoriesSecond2.mkdirs()) {
            System.out.println("创建多级目录成功");
        } else {
            System.out.println("创建多级目录失败");
        }
    }
}

