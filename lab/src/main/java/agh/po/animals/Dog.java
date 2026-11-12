package agh.po.animals;

public class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
        this.legs = 4;
    }

    @Override
    public String getDescription() {
        return "Pies " + name + " ma " + legs + " nogi.";
    }
}
