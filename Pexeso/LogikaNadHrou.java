import javax.swing.*;

public class LogikaNadHrou {
    private Hra hra;
    private HernaPlocha hernaPlocha;
    private Manazer manazer;
    private boolean hrac1NaTahu;

    public LogikaNadHrou(String menoHraca1, String menoHraca2, int velkostHry) {
        this.hra = new Hra(menoHraca1, menoHraca2, velkostHry);
        this.hernaPlocha = new HernaPlocha(menoHraca1, menoHraca2, velkostHry);
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);

    }

    public void vyberSuradnice(int kliknutyX, int kliknutyY) {
        this.hernaPlocha.vyberSuradnice(kliknutyX, kliknutyY);
        this.hrac1NaTahu = this.hernaPlocha.getHracNaTahu();
        this.hernaPlocha.kontrolujZhodnostDvojice();
        //TU TRIGGERNI ZMENU KOlA + PRIPISANIE BODOV
        System.out.println(this.hra.getPocetBodovHrac1());
        System.out.println(this.hra.getPocetBodovHrac2());
        System.out.println("---------------------------");

        if (this.hernaPlocha.isDveRovnakeOtocene()) {
            //System.out.println("DVE ROVNAKE KARTY SU OTOCENE");
            this.hernaPlocha.getOtocenaDvojica().get(0).setUhadnuta();
            this.hernaPlocha.getOtocenaDvojica().get(1).setUhadnuta();

            if (this.hernaPlocha.getHracNaTahu() != this.hra.getHrac1NaTahu()) {
                this.hra.dalsieKolo();
            }

            if (this.hernaPlocha.isMoznostPridatBody()) {
                this.hra.pridajBody();
            }


            this.hernaPlocha.resetDveOtocene();
            this.kontrolaKoncaHry();
        }
    }

    private void kontrolaKoncaHry() {
        if (this.hernaPlocha.getVelkostHry() == 1) {
            if (this.hra.getPocetBodovHrac1() + this.hra.getPocetBodovHrac2() >= 6) {
                this.koniecHry();
            }
        } else if (this.hernaPlocha.getVelkostHry() == 2) {
            if (this.hra.getPocetBodovHrac1() + this.hra.getPocetBodovHrac2() >= 9) {
                this.koniecHry();
            }
        }
    }

    private void koniecHry() {

        if (this.hra.getPocetBodovHrac1() > this.hra.getPocetBodovHrac2()) {
            System.out.println("Vyhral " + this.hra.getMenoHraca1());
        } else if (this.hra.getPocetBodovHrac1() < this.hra.getPocetBodovHrac2()) {
            System.out.println("Vyhral " + this.hra.getMenoHraca2());
        } else if (this.hra.getPocetBodovHrac1() == this.hra.getPocetBodovHrac2()) {
            System.out.println("Remíza!");
        }

        //JOptionPane.showMessageDialog(null, "");

        System.exit(0);
    }
}
