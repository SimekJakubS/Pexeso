import java.util.ArrayList;
import java.util.Collections;

public class HernaPlocha {

    private Platno platno;
    private Hra hra;
    private HernaKarta karta;
    private final Manazer manazer = new Manazer();
    ArrayList<HernaKarta> karty = new ArrayList<HernaKarta>();
    ArrayList<Integer> nahodneFarebneKombinacie = new ArrayList<>();

    public HernaPlocha(String menoHraca1, String menoHraca2, int velkostHry) {

        this.platno = Platno.dajPlatno();
        this.platno.setVisible(true);
        this.manazer.spravujObjekt(this);

        this.vytvorKarty(velkostHry);

        //System.out.println(this.nahodneFarebneKombinacie);

        //this.karty.get(0).otoc();
        //this.karty.get(3).otoc();
        //this.karty.get(6).otoc();
        System.out.println(this.karty);
    }

    private void vytvorKarty(int velkostHry) {
        if(velkostHry == 1) {

            for (int i = 1; i <= 6; i++) {
                this.nahodneFarebneKombinacie.add(i);
                this.nahodneFarebneKombinacie.add(i);
            }

            Collections.shuffle(this.nahodneFarebneKombinacie);
            int k = 0;

            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 2; j++) {

                    try {
                        this.karta = new HernaKarta(i, j, nahodneFarebneKombinacie.get(k));
                    } catch (Exception e){}

                    this.karty.add(this.karta);
                    k++;
                }
            }


        } else {

            for (int i = 1; i <= 9; i++) {
                this.nahodneFarebneKombinacie.add(i);
                this.nahodneFarebneKombinacie.add(i);
            }

            Collections.shuffle(this.nahodneFarebneKombinacie);
            int k = 0;

            for (int i = 0; i <= 5; i ++) {
                for (int j = 0; j <= 2; j ++) {

                    try {
                        this.karta = new HernaKarta(i, j, nahodneFarebneKombinacie.get(k));
                    } catch (Exception e){}

                    this.karty.add(this.karta);
                    k++;
                }
            }
        }
    }

    public void vyberSuradnice(int kliknutyX, int kliknutyY) { //TODO: DOROB KLIK
        //int polohaKurzoraX = (kliknutyX);
        //int polohaKurzoraY = (kliknutyY);

        System.out.println(kliknutyX + "+" + kliknutyY);

        switch (kliknutyX) {
            case 0:
                break;

        }

    }


    /*
    public void vyberSuradnice(int kliknutyX, int kliknutyY) {
        //switch (pocetCiselVArray)
        int polohaKurzoraX = ( kliknutyX + this.velkostX * 10 ) / 110;
        int polohaKurzoraY = ( kliknutyY + this.velkostX * 10 ) / 110;

        this.zobrazUrcenuKartu(polohaKurzoraX, polohaKurzoraY);
    }
    *
    *
    *
    * */

}
