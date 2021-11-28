
public class Hrac {

    private String meno;
    private int pocetBodov;

    public Hrac() {
        this.meno = meno;
        this.pocetBodov = pocetBodov;
        //tu koncia definicie THIS
        this.setMeno();
        this.pocetBodov = 0;

    }

    public void setMeno() {
        this.meno = meno;
    }

    public String getMeno() {
        return this.meno;
    }

    public int getPocetBodov() {
        return this.pocetBodov;
    }
}
