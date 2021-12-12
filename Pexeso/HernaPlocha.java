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

            for (int j = 0; j <= 2; j ++) {
                for (int i = 0; i <= 5; i ++) {
                    try {
                        this.karta = new HernaKarta(i, j, nahodneFarebneKombinacie.get(k));
                    } catch (Exception e){}

                    this.karty.add(this.karta);
                    k++;

                }
            }
        }
    }

    public void vyberSuradnice(int kliknutyX, int kliknutyY) {
        int vyberKartuX = 0;
        int vyberKartuY = 0;
        if(kliknutyY >= 50 && kliknutyX >= 50) {
            //VYBER SURADNICU PRE X
            int suradnicaX = (((kliknutyX - 50) / 100));

            if (suradnicaX % 2 == 0) {
                vyberKartuX = suradnicaX / 2;
            }

            //VYBER SURADNICU PRE Y
            int suradnicaY = ((((kliknutyY) - 50)/ 50));  // /2 ONLY IF 0 || parna

            switch (suradnicaY) {
                case 0:
                case 1:
                    vyberKartuY = 0;
                    break;
                case 3:
                case 4:
                    vyberKartuY = 1;
                    break;
                case 6:
                case 7:
                    vyberKartuY = 2;
                    break;
            }

            if(vyberKartuY == 0) {
                karty.get(vyberKartuX).otoc();
            } else if(vyberKartuY == 1) {
                karty.get(vyberKartuX+6).otoc();
            } else if(vyberKartuY == 2) {
                karty.get(vyberKartuX+12).otoc();
            }
        }
    }
}
