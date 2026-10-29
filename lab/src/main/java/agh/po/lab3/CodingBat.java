package agh.po.lab3;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.print(cb.startHi("Hi"));
    }
    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        String firstTwo = str.substring(0, 2);

        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }
}
