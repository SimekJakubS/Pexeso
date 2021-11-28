import java.util.ArrayList;

public class Hra {

    private Hrac hrac1;
    private Hrac hrac2;

    //constructor
    public Hra(String menoHraca1, String menoHraca2) {

        ArrayList<Hrac> hraci = new ArrayList<Hrac>();

        this.hrac1 = new Hrac(menoHraca1);
        hraci.add(this.hrac1);
        this.hrac2 = new Hrac(menoHraca2);
        hraci.add(this.hrac2);

    }

    //TODO: dorob osetrovanie poctu bodov a vyhodnocovanie vitaza
}
