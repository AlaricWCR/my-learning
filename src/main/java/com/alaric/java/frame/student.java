package com.alaric.java.frame;

/**
 * @ClassName student
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/8
 **/
public class student {
    private String name;
    private Integer weight;

    public student() {
    }

    public student(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "studeng" + name + '\'' + "weight=" + weight +'}';
    }
}
