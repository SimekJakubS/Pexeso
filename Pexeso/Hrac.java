public class Hrac {

    private String meno;
    private int pocetBodov;

    public Hrac(String meno) {
        this.pocetBodov = pocetBodov;
        this.pocetBodov = 0;

        this.meno = meno;

    }

    public String getMeno() {
        return this.meno;
    }

    public int getPocetBodov() {
        return this.pocetBodov;
    }

    public void incPocetBodov () {
        this.pocetBodov++;
        System.out.println("NavysenyPocetBodov");
    }
}
