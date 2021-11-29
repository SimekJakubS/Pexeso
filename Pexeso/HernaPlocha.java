public class HernaPlocha {

    private Platno platno;
    private Hra hra;
    private HernaKarta karta;
    private final Manazer manazer = new Manazer();

    public HernaPlocha(String menoHraca1, String menoHraca2, int velkostHry) {

        this.platno = Platno.dajPlatno();
        this.platno.setVisible(true);
        this.manazer.spravujObjekt(this);



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
        this.karta = new HernaKarta(600, 200, 2);
        this.karta = new HernaKarta(600, 400, 3);

        if (velkostHry == 2) {
            this.karta = new HernaKarta(800, 0, 4);
            this.karta = new HernaKarta(800, 200, 5);
            this.karta = new HernaKarta(800, 400, 6);

            this.karta = new HernaKarta(1000, 0, 7);
            this.karta = new HernaKarta(1000, 200, 8);
            this.karta = new HernaKarta(1000, 400, 9);
        }

    }
    public void vyberSuradnice(int kliknutyX, int kliknutyY) {
        int polohaKurzoraX = (kliknutyX);
        int polohaKurzoraY = (kliknutyY);

        System.out.println(kliknutyX + "+" + kliknutyY);
    }



}
