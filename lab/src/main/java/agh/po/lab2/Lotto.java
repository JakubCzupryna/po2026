package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        Random x = new Random();
        ArrayList<Integer> lista = new ArrayList<>();

        while (lista.size() <5) {
            int l = x.nextInt(1,49);

            if (!lista.contains(l)) {
                lista.add(l); }
        }
        System.out.println(lista);

    }
}
