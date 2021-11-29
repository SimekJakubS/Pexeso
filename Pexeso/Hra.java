import java.util.ArrayList;

public class Hra {

    private Hrac hrac1;
    private Hrac hrac2;
    private boolean hraSkoncila;
    private int maxPocetBodov;

    //constructor
    public Hra(String menoHraca1, String menoHraca2, int velkostHry) {
        this.maxPocetBodov = maxPocetBodov;

        this.vyberVelkostHry(velkostHry);

        ArrayList<Hrac> hraci = new ArrayList<Hrac>();
        this.hrac1 = new Hrac(menoHraca1);
        this.hrac2 = new Hrac(menoHraca2);

        hraci.add(this.hrac1);
        hraci.add(this.hrac2);

    }

    private int vyberVelkostHry(int velkostHry) {
        if (velkostHry == 1) { //velkostiHry = 4x3, 6x3 [12,18] /2 pretoze 2 karty
            this.maxPocetBodov = 6;
        } else if (velkostHry == 2) {
            this.maxPocetBodov = 9;
        } else {
            this.maxPocetBodov = 9;
        }
        return this.maxPocetBodov;
    }

    public boolean getHraPokracuje() {
        if (this.hrac1.getPocetBodov() + this.hrac2.getPocetBodov() == maxPocetBodov) {
            this.hraSkoncila = true;
        }
        return this.hraSkoncila;
    }

    //TODO: dorob osetrovanie poctu bodov a vyhodnocovanie vitaza
}
