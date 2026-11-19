package agh.po.symulator;

public class Pozycja {
        private double x;
        private double y;

        public Pozycja(double x, double y) {
            this.x = x;
            this.y = y;
        }
    public void aktualizujPozycje(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

     //Zwraca pozycję jako String
    public String getPozycja() {
        return "Pozycja (x: " + x + ", y: " + y + ")";
    }
}
