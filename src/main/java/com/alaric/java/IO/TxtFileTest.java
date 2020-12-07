package com.alaric.java.IO;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

/**
 * @ClassName TxtFileTest
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/30
 **/
public class TxtFileTest {
    public static void main(String[] args) throws IOException {
//        //1.将键盘输入的一串文本保存在文件中
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入");
//        String s = scanner.nextLine();
//        char[] chars = s.toCharArray();
//        String fileName = UUID.randomUUID().toString();
//        File file = new File("F:\\code\\result" + fileName + ".txt");
//        Writer out = new FileWriter(file,true);
//        out.write(chars);
//        out.close();
//    }

        String fileName1 = UUID.randomUUID().toString();
        String fileName2 = UUID.randomUUID().toString();
        String fileName3 = UUID.randomUUID().toString();
        //方法1
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();

        File file1 = new File("F:\\code" + fileName1 + ".txt");
        Writer out = new FileWriter(file1, true);
        out.write(chars);
        out.close();
        //方法二
        File file2 = new File("F:\\code" + fileName2 + ".txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2, true));
        bufferedWriter.write(s);
        bufferedWriter.flush();
        bufferedWriter.close();
        //方法三
        File file3 = new File("F:\\code" + fileName3 + ".txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        PrintWriter printWriter = new PrintWriter(fileOutputStream, true);
        printWriter.print(s);
        printWriter.close();
    }
}
