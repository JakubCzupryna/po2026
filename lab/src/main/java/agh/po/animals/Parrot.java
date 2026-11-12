package agh.po.animals;

public class Parrot extends Animal {

    public Parrot(String name) {
        this.name = name;
        this.legs = 2;
    }

    @Override
    public String getDescription() {
        return "Papuga " + name + " ma " + legs + " nogi.";
    }
}
