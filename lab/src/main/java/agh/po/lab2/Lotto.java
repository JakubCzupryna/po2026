package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        Random x = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i=0; i<=5; i++) {
            int l = x.nextInt(1,49);
            lista.add(l);
        }
        System.out.println(lista);

    }
}
