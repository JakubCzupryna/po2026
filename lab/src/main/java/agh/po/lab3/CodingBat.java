package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.startHi("Hi"));
        System.out.println(cb.makes10(9, 1));
        System.out.println(cb.makes10(10, 5));
        System.out.println(cb.makes10(2, 3));
        System.out.println(cb.in3050(31,40));
        System.out.println(cb.max1020(8,12));
        System.out.println(cb.mapAB3(new java.util.HashMap<>(java.util.Map.of("a", "aaa", "c", "cake"))));
        String[] test1 = {"a", "b", "a", "c", "b"};
        System.out.println("Test 1: " + cb.wordMultiple(test1));
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

    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        else if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();

        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }

        return map;
    }

}
