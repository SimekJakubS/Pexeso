import java.util.ArrayList;

public class Hra {

    private Hrac hrac1;
    private Hrac hrac2;
    private HernaPlocha hernaPlocha; //TODO: toto implementuj
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
        switch (velkostHry) { //velkostiHry = 3x4, 4x4, 6x5 [12,16,30] /2 pretoze 2 karty
            case 1:
                this.maxPocetBodov = 6;
            case 2:
                this.maxPocetBodov = 8;
            case 3:
                this.maxPocetBodov = 15;
            default:
                this.maxPocetBodov = 8;
        }
        return this.maxPocetBodov;
    }

    public boolean getHraPokracuje() {
        if (hrac1.getPocetBodov() + hrac2.getPocetBodov() == maxPocetBodov) {
            this.hraSkoncila = true;
        }
        return hraSkoncila;
    }

    //TODO: dorob osetrovanie poctu bodov a vyhodnocovanie vitaza
}
