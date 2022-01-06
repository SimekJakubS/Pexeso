import java.util.ArrayList;

public class Hra {

    private final Hrac hrac1;
    private final Hrac hrac2;
    private final String menoHraca1;
    private final String menoHraca2;
    private boolean hrac1NaTahu = true;

    //constructor
    public Hra(String menoHraca1, String menoHraca2) {

        this.hrac1 = new Hrac(menoHraca1);
        this.hrac2 = new Hrac(menoHraca2);

        ArrayList<Hrac> hraci = new ArrayList<Hrac>();

        hraci.add(this.hrac1);
        hraci.add(this.hrac2);

        this.hrac1NaTahu = hrac1NaTahu;
        this.menoHraca1 = menoHraca1;
        this.menoHraca2 = menoHraca2;
    }

    public void pridajBody() {
        if (this.hrac1NaTahu) {
            this.hrac1.incPocetBodov();
            System.out.println(this.menoHraca1 + " dostáva bod!");
        } else {
            this.hrac2.incPocetBodov();
            System.out.println(this.menoHraca2 + " dostáva bod!");
        }
    }

    public void dalsieKolo() {
        this.hrac1NaTahu = !this.hrac1NaTahu;
    }

    public boolean getHrac1NaTahu() {
        return this.hrac1NaTahu;
    }

    public int getPocetBodovHrac1 () {
        return this.hrac1.getPocetBodov();
    }

    public int getPocetBodovHrac2 () {
        return this.hrac2.getPocetBodov();
    }

    public String getMenoHraca1 () {
        return this.menoHraca1;
    }

    public String getMenoHraca2 () {
        return this.menoHraca2;
    }

}
