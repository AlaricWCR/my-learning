package com.alaric.java.week5Class;

/**
 * @ClassName TestBook
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/2
 **/
public class TestBook {
    public static void main (String[] args) {
        Book[] books = new Book[] {
                Book.builder().ISBN("1231231231231").bookName("Java暴力破解").price(99).build(),
        }
    }
}
