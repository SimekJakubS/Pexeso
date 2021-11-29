import java.util.ArrayList;

public class HernaPlocha {

    private Platno platno;
    private Hra hra;
    private HernaKarta karta;
    private final Manazer manazer = new Manazer();
    ArrayList<HernaKarta> karty = new ArrayList<HernaKarta>();

    public HernaPlocha(String menoHraca1, String menoHraca2, int velkostHry) {

        this.platno = Platno.dajPlatno();
        this.platno.setVisible(true);
        this.manazer.spravujObjekt(this);

        this.vytvorKarty(velkostHry);

    }

    private void vytvorKarty(int velkostHry) {
        if(velkostHry == 1) {
            for (int i = 0; i <= 600; i += 200) {
                for (int j = 0; j <= 400; j += 200) {

                    this.karta = new HernaKarta(i, j, 1);
                    this.karty.add(this.karta);
                }
            }

        } else {

            for (int i = 0; i <= 1000; i += 200) {
                for (int j = 0; j <= 400; j += 200) {
                this.karta = new HernaKarta(i, j, 1);
                this.karty.add(this.karta);
                }
            }
        }
    }

    public void vyberSuradnice(int kliknutyX, int kliknutyY) {
        int polohaKurzoraX = (kliknutyX);
        int polohaKurzoraY = (kliknutyY);

        System.out.println(kliknutyX + "+" + kliknutyY);
    }



}
