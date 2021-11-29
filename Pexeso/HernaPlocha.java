
public class HernaPlocha {

    private Platno platno;
    private Hra hra;
    private HernaKarta karta;

    public HernaPlocha(String menoHraca1, String menoHraca2, int velkostHry) {
        this.hra = new Hra(menoHraca1, menoHraca2, velkostHry);

        this.platno = Platno.dajPlatno();
        this.platno.setVisible(true);

        this.karta = new HernaKarta(0, 0, 1);
        this.karta = new HernaKarta(0, 200, 2);
        this.karta = new HernaKarta(0, 400, 3);

        this.karta = new HernaKarta(200, 0, 4);
        this.karta = new HernaKarta(200, 200, 5);
        this.karta = new HernaKarta(200, 400, 6);


        this.karta = new HernaKarta(400, 0, 7);
        this.karta = new HernaKarta(400,200, 8);
        this.karta = new HernaKarta(400, 400, 9);


        this.karta = new HernaKarta(600, 0, 1);
        this.karta = new HernaKarta(600, 200, 4);
        this.karta = new HernaKarta(600, 400, 7);



    }



}
