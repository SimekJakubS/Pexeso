
public class HernaPlocha {

    private Platno platno;
    private Hra hra;
    private HernaKarta karta;

    public HernaPlocha(String menoHraca1, String menoHraca2, int velkostHry) {
        this.hra = new Hra(menoHraca1, menoHraca2, velkostHry);

        this.platno = Platno.dajPlatno();
        this.platno.setVisible(true);

        this.karta = new HernaKarta();
    }



}
