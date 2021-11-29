public class HernaKarta {

    private Stvorec stvorec;
    private boolean jeOdokryta;

    public HernaKarta(int surX, int surY, int farba, int cislo) {

        this.stvorec = new Stvorec();
        this.stvorec.posunVodorovne(surX);
        this.stvorec.posunZvisle(surY);
        this.stvorec.zobraz();

        this.vyberFarbu(farba);


    }

    private void vyberFarbu(int farba) {
        if (farba == 1) {
            this.stvorec.zmenFarbu("yellow");
        } else if (farba == 2) {
            this.stvorec.zmenFarbu("blue");
        } else if (farba == 3) {
            this.stvorec.zmenFarbu("green");

        }


    }

    public void otoc(boolean jeOdokryta) {
        if (!jeOdokryta) {

        }
    }

    public void zakry(boolean jeOdokryta) {

    }
}
