package com.alaric.java.week5;

/**
 * @ClassName BookException
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/2
 **/
public class BookException extends Exception {
    private String abnormal;

    public BookException() {
        super();
    }

    public  BookException(String abnormal) {
        super ();
        this.abnormal = abnormal;
    }

    public String ShowAbnormal() {
        return this.abnormal;
    }
}
