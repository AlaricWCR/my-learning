package com.alaric.java.week4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarketEmployeeTest {

    @Test
    public void print() {
        MarketEmployee marketEmployee = new MarketEmployee("admin");
        marketEmployee.print();
    }

    @Test
    public void getSalary() {
        MarketEmployee marketEmployee = new MarketEmployee("admin");
        assertEquals(3000,marketEmployee.getSalary());
    }
}