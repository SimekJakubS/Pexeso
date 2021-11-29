public class HernaKarta {

    private Stvorec zakryta;
    private Stvorec odokryta;
    private Kruh kruh;
    private boolean jeOdokryta = true;


    public HernaKarta(int surX, int surY, int farba) {

        this.zakryta = new Stvorec();
        this.zakryta.posunVodorovne(surX);
        this.zakryta.posunZvisle(surY);

        this.odokryta = new Stvorec();
        this.odokryta.posunVodorovne(surX);
        this.odokryta.posunZvisle(surY);

        this.kruh = new Kruh();
        this.kruh.posunVodorovne(surX);
        this.kruh.posunZvisle(surY);

        this.vyberFarbu(farba);
        this.zakryta.zobraz();

    }

    private void vyberFarbu(int farebnaKombinacia) {
        switch (farebnaKombinacia) {
            case 1: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("yellow");
                this.kruh.zmenFarbu("blue");
            }
            case 2: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("blue");
                this.kruh.zmenFarbu("yellow");
            }
            case 3: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("green");
                this.kruh.zmenFarbu("yellow");
            }
            case 4: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("yellow");
                this.kruh.zmenFarbu("green");
            }
            case 5: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("blue");
                this.kruh.zmenFarbu("green");
            }
            case 6: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("green");
                this.kruh.zmenFarbu("blue");
            }
            case 7: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("yellow");
                this.kruh.zmenFarbu("red");
            }
            case 8: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("blue");
                this.kruh.zmenFarbu("red");
            }
            case 9: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("green");
                this.kruh.zmenFarbu("red");
            }
        }
    }

    public void otoc() {
        if (this.jeOdokryta) {
            this.zakryta.skry();
            this.odokryta.zobraz();
            this.kruh.zobraz();
        } else if (this.jeOdokryta == false) {
            this.odokryta.skry();
            this.kruh.skry();
            this.zakryta.zobraz();

        }

        if (!jeOdokryta) jeOdokryta = true;
        else jeOdokryta = false;
    }

}
