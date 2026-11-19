package agh.po.symulator;

// klasa agregująca komponenty:
public class Samochod {
        private Silnik silnik;
        private SkrzyniaBiegow skrzynia;


    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
    }

    public void wlacz() {
        this.silnik.uruchom();
        System.out.println("Samochód włączony");
    }
    

}
