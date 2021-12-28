public class HernaKarta {

    private Stvorec zakryta;
    private Stvorec odokryta;
    private Kruh kruh;
    private boolean jeOdokryta = false;
    private int posunX = 0;
    private int posunY = 0;
    private int farebnaKombinacia;

    public HernaKarta(int surX, int surY, int farba) {

        this.posunX = posunX;
        this.posunY = posunY;

        this.vypocitajPosun(surX, surY);

        this.zakryta = new Stvorec();
        this.zakryta.posunVodorovne(this.posunX);
        this.zakryta.posunZvisle(this.posunY);

        this.odokryta = new Stvorec();
        this.odokryta.posunVodorovne(this.posunX);
        this.odokryta.posunZvisle(this.posunY);

        this.kruh = new Kruh();
        this.kruh.posunVodorovne(this.posunX);
        this.kruh.posunZvisle(this.posunY);

        this.vyberFarbu(farba);
        this.zakryta.zobraz();

    }

    public boolean getJeOdokryta() {
        return this.jeOdokryta;
    }

    public int getFarebnaKombinacia () {
        return this.farebnaKombinacia;
    }

    public void otoc() {
        if (this.jeOdokryta) {
            this.zakryta.skry();
            this.odokryta.zobraz();
            this.kruh.zobraz();
        } else if (!this.jeOdokryta) {
            this.odokryta.skry();
            this.kruh.skry();
            this.zakryta.zobraz();

        }

        if (!this.jeOdokryta) {
            this.jeOdokryta = true;
        } else {
            this.jeOdokryta = false;
        }
    }

    private void vypocitajPosun (int surX, int surY) {

        switch (surX) {
            case 1:
                this.posunX = 200;
                break;

            case 2:
                this.posunX = 400;
                break;

            case 3:
                this.posunX = 600;
                break;

            case 4:
                this.posunX = 800;
                break;

            case 5:
                this.posunX = 1000;
                break;

            default:
                this.posunX = 0;
                break;

        }

        switch (surY) {
            case 1:
                this.posunY = 150;
                break;

            case 2:
                this.posunY = 300;
                break;

            default:
                this.posunY = 0;
                break;
        }

    }

    private void vyberFarbu (int farebnaKombinacia) {
        switch (farebnaKombinacia) {
            case 1: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("yellow");
                this.kruh.zmenFarbu("blue");
                this.farebnaKombinacia = 1;
                break;
            }
            case 2: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("blue");
                this.kruh.zmenFarbu("yellow");
                this.farebnaKombinacia = 2;
                break;
            }
            case 3: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("green");
                this.kruh.zmenFarbu("yellow");
                this.farebnaKombinacia = 3;
                break;
            }
            case 4: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("yellow");
                this.kruh.zmenFarbu("green");
                this.farebnaKombinacia = 4;
                break;
            }
            case 5: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("blue");
                this.kruh.zmenFarbu("green");
                this.farebnaKombinacia = 5;
                break;
            }
            case 6: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("green");
                this.kruh.zmenFarbu("blue");
                this.farebnaKombinacia = 6;
                break;
            }
            case 7: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("yellow");
                this.kruh.zmenFarbu("red");
                this.farebnaKombinacia = 7;
                break;
            }
            case 8: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("blue");
                this.kruh.zmenFarbu("red");
                this.farebnaKombinacia = 8;
                break;
            }
            case 9: {
                this.zakryta.zmenFarbu("red");
                this.odokryta.zmenFarbu("green");
                this.kruh.zmenFarbu("red");
                this.farebnaKombinacia = 9;
                break;
            }
        }
    }


}
