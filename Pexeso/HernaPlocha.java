import java.util.ArrayList;
import java.util.Collections;

public class HernaPlocha {

    private Platno platno;
    private Hra hra;
    private HernaKarta karta;
    private final Manazer manazer = new Manazer();
    private ArrayList<HernaKarta> karty = new ArrayList<>();
    private ArrayList<Integer> nahodneFarebneKombinacie = new ArrayList<>();
    private ArrayList<HernaKarta> otocenaDvojica = new ArrayList<>();
    private boolean dveOtocene = false;
    private boolean jeVybrata = false;
    private int cisloKarty;

    public HernaPlocha(String menoHraca1, String menoHraca2, int velkostHry) {
        this.nahodneFarebneKombinacie = nahodneFarebneKombinacie;
        this.otocenaDvojica = otocenaDvojica;
        this.dveOtocene = dveOtocene;
        this.platno = Platno.dajPlatno();
        this.platno.setVisible(true);
        this.manazer.spravujObjekt(this);

        this.vytvorKarty(velkostHry);
    }

    private void vytvorKarty(int velkostHry) {
        if (velkostHry == 1) {

            for (int i = 1; i <= 6; i++) {
                this.nahodneFarebneKombinacie.add(i);
                this.nahodneFarebneKombinacie.add(i);
            }

            Collections.shuffle(this.nahodneFarebneKombinacie);
            int k = 0;

            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 2; j++) {

                    try {
                        this.karta = new HernaKarta(i, j, this.nahodneFarebneKombinacie.get(k));
                    } catch (Exception e) { }

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

            for (int j = 0; j <= 2; j++) {
                for (int i = 0; i <= 5; i++) {
                    try {
                        this.karta = new HernaKarta(i, j, this.nahodneFarebneKombinacie.get(k));
                    } catch (Exception e) {
                    }

                    this.karty.add(this.karta);
                    k++;
                }
            }
        }
    }

    public void vyberSuradnice(int kliknutyX, int kliknutyY) {
        int vyberKartuX = 0;
        int vyberKartuY = 0;

        if (kliknutyY >= 50 && kliknutyX >= 50 && this.otocenaDvojica.size() < 2) {
            //VYBER SURADNICU PRE X
            int suradnicaX = (((kliknutyX - 50) / 100));

            if (suradnicaX % 2 == 0) {

                vyberKartuX = suradnicaX / 2;
                int suradnicaY = ((((kliknutyY) - 50) / 50));  // /2 ONLY IF 0 || parna

                this.cisloKarty = 0;

                this.vyberKartuZoSuradnic(suradnicaX, suradnicaY, vyberKartuX, vyberKartuY);
                System.out.println(this.otocenaDvojica);
            }
        }

        if (this.jeVybrata) {

            this.karty.get(this.cisloKarty).otoc();

            if (this.otocenaDvojica.size() == 2) {
                this.prevratKarty();
                this.otocenaDvojica.clear();
            }
        }
        this.jeVybrata = false;
    }

    private void vyberKartuZoSuradnic (int suradnicaX, int suradnicaY, int vyberKartuX, int vyberKartuY) {
        switch (suradnicaY) {
            case 0:
            case 1:
                vyberKartuY = 0;
                if (this.karty.get(vyberKartuX).getJeOdokryta()) {
                    this.otocenaDvojica.add(this.karty.get(vyberKartuX));
                }
                this.cisloKarty = (vyberKartuX);
                this.jeVybrata = true;
                break;

            case 3:
            case 4:
                vyberKartuY = 1;
                if (this.karty.get(vyberKartuX + 6).getJeOdokryta()) {
                    this.otocenaDvojica.add(this.karty.get(vyberKartuX + 6));
                }
                this.cisloKarty = (vyberKartuX + 6);
                this.jeVybrata = true;
                break;

            case 6:
            case 7:
                vyberKartuY = 2;
                if (this.karty.get(vyberKartuX + 12).getJeOdokryta()) {
                    this.otocenaDvojica.add(this.karty.get(vyberKartuX + 12));
                }
                this.cisloKarty = (vyberKartuX + 12);
                this.jeVybrata = true;
                break;
        }
    }

    private void porovnajDvojicu() {
            //int x1 = this.otocenaDvojica.get(0).getFarebnaKombinacia();
            //int x2 = this.otocenaDvojica.get(1).getFarebnaKombinacia();

            //if(x1 == x2) {
            //    this.hra.pridajBody();
            //    System.out.println("Body Su:" + "H1:" + hra.getPocetBodovHrac1() + "|H2:" + hra.getPocetBodovHrac2());
            //}
    }

    private void prevratKarty() {

        if (this.otocenaDvojica.size() == 2) {
            for (HernaKarta x :this.karty) {
                if (!x.getJeOdokryta()) {
                    x.otoc();
                }
            }

            try {
                System.out.println(this.hra.getHraSkoncila());
            } catch (Exception e) {
                System.out.println("Neda sa");
            }


        }

    }
}
