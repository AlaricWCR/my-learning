package com.alaric.java.week5Class;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Book
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/2
 **/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    public String ISBN;
    public Integer price;
    private String bookName;
}
