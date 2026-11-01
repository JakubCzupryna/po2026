package agh.po.lab3;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.startHi("Hi"));
        System.out.println(cb.makes10(9, 1));
        System.out.println(cb.makes10(10, 5));
        System.out.println(cb.makes10(2, 3));
        System.out.println(cb.in3050(31,40));
        System.out.println(cb.max1020(8,12));
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
    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }
    public int max1020(int a, int b) {

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }


        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
}
