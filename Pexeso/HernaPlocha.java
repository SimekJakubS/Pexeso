import java.util.ArrayList;
import java.util.Collections;

public class HernaPlocha {

    private Platno platno;
    private HernaKarta karta;
    private Refresh refresh;

    private ArrayList<HernaKarta> karty = new ArrayList<>();
    private ArrayList<Integer> nahodneFarebneKombinacie = new ArrayList<>();
    private ArrayList<HernaKarta> otocenaDvojica = new ArrayList<>();
    private boolean dveOtocene;
    private boolean jeVybrata;
    private String menoHraca1;
    private String menoHraca2;

    private int cisloKarty;
    private boolean hrac1NaTahu = true;
    private boolean dveKartySuOtocene;
    private boolean vitaznaDvojica;
    private int velkostHry;
    private boolean moznostPridatBody;

    public HernaPlocha(String menoHraca1, String menoHraca2, int velkostHry) {
        this.nahodneFarebneKombinacie = nahodneFarebneKombinacie;
        this.otocenaDvojica = otocenaDvojica;
        this.dveOtocene = dveOtocene;
        this.platno = Platno.dajPlatno();
        this.platno.setVisible(true);
        this.refresh = new Refresh();
        this.velkostHry = velkostHry;
        this.vytvorKarty(velkostHry);
        this.menoHraca1 = menoHraca1;
        this.menoHraca2 = menoHraca2;
    }

    private void vytvorKarty(int velkostHry) {
        if (velkostHry == 1) {

            for (int i = 1; i <= 6; i++) {
                this.nahodneFarebneKombinacie.add(i);
                this.nahodneFarebneKombinacie.add(i);
            }

            Collections.shuffle(this.nahodneFarebneKombinacie);
            int k = 0;

            for (int j = 0; j <= 2; j++) {
                for (int i = 0; i <= 3; i++) {


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

        if (this.velkostHry == 1) {
            if (kliknutyY >= 50 && kliknutyX >= 50 && this.otocenaDvojica.size() < 2 && kliknutyX <= 750) {
                //VYBER SURADNICU PRE X
                int suradnicaX = (((kliknutyX - 50) / 200));

                vyberKartuX = suradnicaX / 2;
                int suradnicaY = ((((kliknutyY) - 50) / 50) / 3);  // /2 ONLY IF 0 || parna
                this.cisloKarty = 0;

                this.vyberKartuZoSuradnic(suradnicaX, suradnicaY, vyberKartuX, vyberKartuY);

            } else if (kliknutyX <= 30 && kliknutyY <= 30 && this.otocenaDvojica.size() == 2) { //OSETRENIE REFRESH TLACIDLA
                if (!this.vitaznaDvojica) {
                    this.prevratKarty();
                    this.dalsieKolo();
                }    //AK JE VITRAZNA DVOJICA TRIGGERED TAK TOTO NEPOJDE
                this.otocenaDvojica.clear();
            }

            if (this.jeVybrata) {  //HANDLING KARTY
                this.karty.get(this.cisloKarty).otoc();
            }

        } else {
            if (kliknutyY >= 50 && kliknutyX >= 50 && this.otocenaDvojica.size() < 2) {
                //VYBER SURADNICU PRE X
                int suradnicaX = (((kliknutyX - 50) / 100));

                if (suradnicaX % 2 == 0) {

                    vyberKartuX = suradnicaX / 2;
                    int suradnicaY = ((((kliknutyY) - 50) / 50));  // /2 ONLY IF 0 || parna
                    this.cisloKarty = 0;

                    this.vyberKartuZoSuradnic(suradnicaX, suradnicaY, vyberKartuX, vyberKartuY);
                }
            } else if (kliknutyX <= 30 && kliknutyY <= 30 && this.otocenaDvojica.size() == 2) { //OSETRENIE REFRESH TLACIDLA
                if (!this.vitaznaDvojica) {
                    this.prevratKarty();
                    this.dalsieKolo();
                }    //AK JE VITRAZNA DVOJICA TRIGGERED TAK TOTO NEPOJDE
                this.otocenaDvojica.clear();
            }

            if (this.jeVybrata) {  //HANDLING KARTY
                this.karty.get(this.cisloKarty).otoc();
            }
        }
        this.jeVybrata = false;
    }

    private void vyberKartuZoSuradnic (int suradnicaX, int suradnicaY, int vyberKartuX, int vyberKartuY) {
        if (this.velkostHry == 1) {

            switch (suradnicaY) {
                case 0:
                    if (this.karty.get(suradnicaX).getJeOdokryta()) {
                        this.otocenaDvojica.add(this.karty.get(suradnicaX));
                    }
                    this.cisloKarty = suradnicaX;
                    this.jeVybrata = true;
                    break;

                case 1:

                    if (this.karty.get(suradnicaX + 4).getJeOdokryta()) {
                        this.otocenaDvojica.add(this.karty.get(suradnicaX + 4));
                    }
                    this.cisloKarty = suradnicaX + 4;
                    this.jeVybrata = true;
                    break;

                case 2:
                    if (this.karty.get(suradnicaX + 8).getJeOdokryta()) {
                        this.otocenaDvojica.add(this.karty.get(suradnicaX + 8));
                    }
                    this.cisloKarty = suradnicaX + 8;
                    this.jeVybrata = true;
                    break;
            }

        } else if (this.velkostHry == 2) {
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

    }

    public boolean getHracNaTahu () {
        return this.hrac1NaTahu;
    }

    public ArrayList<HernaKarta> getOtocenaDvojica() {
        return this.otocenaDvojica;
    }

    public ArrayList<HernaKarta> getKarty() {
        return this.karty;
    }

    public int getVelkostHry () {
        return this.velkostHry;
    }

    private void dalsieKolo() {
        this.hrac1NaTahu = !this.hrac1NaTahu;
        if (this.hrac1NaTahu) {
            System.out.println("Na rade je: " + this.menoHraca1);
        } else {
            System.out.println("Na rade je: " + this.menoHraca2);
        }
    }

    public void prevratKarty() {
        for (HernaKarta x : this.getKarty()) {
            if (!x.getJeOdokryta() && !x.isUhadnuta()) {
                x.otoc();
            }
        }
    }

    public void kontrolujZhodnostDvojice() {
        if (this.otocenaDvojica.size() == 2 && !this.otocenaDvojica.get(0).equals(this.otocenaDvojica.get(1))) {
            this.dveKartySuOtocene = true;
            if (this.otocenaDvojica.get(0).getFarebnaKombinacia() == this.otocenaDvojica.get(1).getFarebnaKombinacia()) {
                this.dveOtocene = true;
                this.vitaznaDvojica = true;
                //TU dorob zakazanie prevracania karty
                this.moznostPridatBody = true;

            } else {
                this.dveOtocene = false;
                this.vitaznaDvojica = false;
                this.moznostPridatBody = false;
            }
        }

        this.dveKartySuOtocene = false;
    }

    public boolean isMoznostPridatBody() {
        return this.moznostPridatBody;
    }

    public boolean getDveKartySuOtocene() {
        return this.dveKartySuOtocene;
    }

    public void resetDveOtocene () {
        this.dveOtocene = false;
    }

    public boolean isDveRovnakeOtocene() {
        return this.dveOtocene;
    }
}
