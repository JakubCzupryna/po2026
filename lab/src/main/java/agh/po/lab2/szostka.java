package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;

public class szostka {
    public static void main(String[] args) {
        Random x = new Random();
        ArrayList<Integer> twojeTypy = new ArrayList<>();


        for (int i = 0; i < args.length; i++) {
            int liczba = Integer.valueOf(args[i]);
            twojeTypy.add(liczba);
        }

        long czasStart = System.currentTimeMillis();

        int liczbaLosowan = 0;
        int trafienia = 0;

        while (trafienia < 6) {
            liczbaLosowan++;
            trafienia = 0;
            ArrayList<Integer> wylosowane = new ArrayList<>();


            while (wylosowane.size() < 6) {
                int l = x.nextInt(1, 50);
                if (!wylosowane.contains(l)) {
                    wylosowane.add(l);
                }
            }

            for (int i = 0; i < twojeTypy.size(); i++) {
                int twojaLiczba = twojeTypy.get(i);
                if (wylosowane.contains(twojaLiczba)) {
                    trafienia++;
                }
            }
        }

        long czasKoniec = System.currentTimeMillis();
        long czasDzialania = czasKoniec - czasStart;

        System.out.println("Liczba losowań potrzebnych do pełnego trafienia: " + liczbaLosowan);
        System.out.println("Łączny czas działania programu: " + czasDzialania + " ms");
    }
}
