package com.alaric.java.week5;

/**
 * @ClassName Book
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/2
 **/
public class Book {
    private String title;
    private String price;
    private Integer ISBN;
    public Book(String violence,String terror,Integer ISBN) {
        this.title = title;
        this.price = price;
        this.ISBN = ISBN;
    }
    public Book() {

    }
    public String getTitle() {
        return title;
    }
    public String getPrice() {
        return price;
    }
    public Integer getISBN() {
        return ISBN;
    }
}
