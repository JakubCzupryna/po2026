package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat cb = new CodingBat();
    @org.junit.Test
    public void startHi() {
        assertEquals(true, cb.startHi("hi"));
    }
}