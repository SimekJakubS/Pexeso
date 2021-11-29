
public class HernaPlocha {

    private Platno platno;
    private Hra hra;
    private HernaKarta karta;

    public HernaPlocha(String menoHraca1, String menoHraca2, int velkostHry) {
        this.hra = new Hra(menoHraca1, menoHraca2, velkostHry);

        this.platno = Platno.dajPlatno();
        this.platno.setVisible(true);

        this.karta = new HernaKarta(0, 0, 1, 1);
        this.karta = new HernaKarta(200,200, 1,1);
        /*
        this.karta = new HernaKarta(200,0, 2,1);
        this.karta = new HernaKarta(400,0, 1, 1);
        this.karta = new HernaKarta(600,0, 3,1);
        this.karta = new HernaKarta(800,0, 2,1);
        this.karta = new HernaKarta(1000,0, 3,1);

        this.karta = new HernaKarta(0,200, 2,1);
        this.karta = new HernaKarta(200,200, 1, 1);
        this.karta = new HernaKarta(400,200, 3,1);
        this.karta = new HernaKarta(600,200, 1, 1);
        this.karta = new HernaKarta(800,200, 2,1);
        this.karta = new HernaKarta(1000,200, 1, 1);

        this.karta = new HernaKarta(0,400, 2,1);
        this.karta = new HernaKarta(200,400, 1, 1);
        this.karta = new HernaKarta(400,400, 3,1);
        this.karta = new HernaKarta(600,400, 1, 1);
        this.karta = new HernaKarta(800,400, 3,1);
        this.karta = new HernaKarta(1000,400, 1, 1);
*/



    }



}
