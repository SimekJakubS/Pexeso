public class HernaKarta {

    private Stvorec zakryta;
    private Stvorec odokryta;
    private Kruh kruh;
    private boolean jeOdokryta;


    public HernaKarta(int surX, int surY, int farba, int cislo) {

        this.zakryta = new Stvorec();
        this.zakryta.posunVodorovne(surX);
        this.zakryta.posunZvisle(surY);

        this.odokryta = new Stvorec();
        this.odokryta.posunVodorovne(surX);
        this.odokryta.posunZvisle(surY);

        this.vyberFarbu(farba);
        this.zakryta.zobraz();

        this.kruh = new Kruh();
        this.kruh.posunVodorovne(surX);
        this.kruh.posunZvisle(surY);
        this.kruh.zobraz();


    }

    private void vyberFarbu(int farba) {
        if (farba == 1) {
            this.zakryta.zmenFarbu("yellow");
            this.odokryta.zmenFarbu("blue");
        } else if (farba == 2) {
            this.zakryta.zmenFarbu("blue");
            this.odokryta.zmenFarbu("blue");
        } else if (farba == 3) {
            this.zakryta.zmenFarbu("green");
            this.odokryta.zmenFarbu("green");
        }
    }

    public void otoc() {
        if (this.jeOdokryta) {
            this.zakryta.skry();
            this.odokryta.zobraz();
        } else if (!this.jeOdokryta) {
            this.odokryta.skry();
            this.zakryta.zobraz();
        }

        if (jeOdokryta) {
            jeOdokryta = false;
        } else {
            jeOdokryta = true;
        }
    }

}
