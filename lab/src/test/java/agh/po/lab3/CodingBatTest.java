package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat cb = new CodingBat();
    @org.junit.Test
    public void startHi() {
        assertEquals(true, cb.startHi("hi"));
    }
    @org.junit.Test
    public void makes10() {
        assertEquals(true, cb.makes10(1,5));
    }
    @org.junit.Test
    public void in3050() {
        assertEquals(true, cb.in3050(31,39));
    }
    @org.junit.Test
    public void max1020() {
        assertEquals(true, cb.max1020(8,12));
    }
}