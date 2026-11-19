package agh.po.symulator;

public class Silnik {
    private int maxObroty;
    private int obroty;

    public Silnik(String producent, String model, int maxObroty) {
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }

    public void uruchom() {
        if (obroty == 0) {
            this.obroty = 1100;
            System.out.println("Silnik uruchomiony, obroty: " + this.obroty);
        } else {
            System.out.println("Silnik pracuje.");
        }
    }

    public void zatrzymaj() {
        this.obroty = 0;
        System.out.println("Silnik zatrzymany.");
    }
}
