package agh.po.symulator;

public class SkrzyniaBiegow {
    private int aktualnyBieg;
    private int iloscBiegow;

    public SkrzyniaBiegow(String producent, String model, int iloscBiegow) {
        this.iloscBiegow = iloscBiegow;
        this.aktualnyBieg = 0; // 0 = bieg neutralny
    }
}
