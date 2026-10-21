package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;

public class Zgadywanie {
    public static void main(String[] args) {
        Random x = new Random();
        ArrayList<Integer> wylosowane = new ArrayList<>();
        ArrayList<Integer> twojeTypy = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            int liczba = Integer.valueOf(args[i]);
            twojeTypy.add(liczba);
        }

        while (wylosowane.size() <= 5) {
            int l = x.nextInt(1, 50);
            if (!wylosowane.contains(l)) {
                wylosowane.add(l);
            }
        }

        int trafienia = 0;

        for (int i = 0; i < twojeTypy.size(); i++) {
            int TwojaLiczba = twojeTypy.get(i);

            if (wylosowane.contains(TwojaLiczba)) {
                trafienia = trafienia + 1;
            }
        }

        System.out.println("Twoje typy: " + twojeTypy);
        System.out.println("Wylosowane liczby: " + wylosowane);
        System.out.println("Liczba trafień: " + trafienia);
    }
    }

