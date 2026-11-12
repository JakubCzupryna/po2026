package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.ArrayList;
import java.util.Random;


public class Zoo {
    ArrayList<Animal> list = new ArrayList<>();


    public Zoo() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(3);

            if (num == 0) {
                list.add(new Dog("pies" + i));
            }
            else if (num == 1) {
                list.add(new Snake("snake" + i));
            }
            else {
                list.add(new Parrot("papuga" + i));
            }
        }
    }
    int ileNog() {
        int legs = 0;
        for (Animal a : list) {
            legs = legs + a.legs;
        }
        return legs;
    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println("Legs = " + zoo.ileNog());
    }
}
