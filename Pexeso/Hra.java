import java.util.ArrayList;

public class Hra {

    private Hrac hrac1;
    private Hrac hrac2;
    private boolean hraSkoncila;
    private int maxPocetBodov;
    private HernaPlocha hernaPlocha;
    private Platno platno;
    private boolean hrac1NaTahu = true;

    //constructor
    public Hra(String menoHraca1, String menoHraca2, int velkostHry) {
        this.maxPocetBodov = maxPocetBodov;
        this.hrac1NaTahu = hrac1NaTahu;

        this.vyberVelkostHry(velkostHry);

        ArrayList<Hrac> hraci = new ArrayList<Hrac>();
        this.hrac1 = new Hrac(menoHraca1);
        this.hrac2 = new Hrac(menoHraca2);

        hraci.add(this.hrac1);
        hraci.add(this.hrac2);

        this.platno = Platno.dajPlatno();
        this.platno.setVisible(true);

        this.hernaPlocha = new HernaPlocha(menoHraca1, menoHraca2, velkostHry);
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

    public boolean getHraSkoncila() {
        if (this.hrac1.getPocetBodov() + this.hrac2.getPocetBodov() == maxPocetBodov) {
            this.hraSkoncila = true;
        }
        return this.hraSkoncila;
    }

    public boolean getHrac1NaTahu() {
        return this.hrac1NaTahu;
    }

    public void pridajBody() {
        if (this.hrac1NaTahu) {
            this.hrac1.incPocetBodov();
        } else {
            this.hrac2.incPocetBodov();
        }
    }

    public int getPocetBodovHrac1 () {
        return this.hrac1.getPocetBodov();
    }

    public int getPocetBodovHrac2 () {
        return this.hrac2.getPocetBodov();
    }


    //TODO: dorob osetrovanie poctu bodov a vyhodnocovanie vitaza
}
