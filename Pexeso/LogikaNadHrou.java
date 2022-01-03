import java.util.concurrent.TimeUnit;

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

        if (hernaPlocha.isDveOtocene()) {
            System.out.println("DVE ROVNAKE KARTY SU OTOCENE");
        }
        //ak je triggernutye toto tak pripis body
    }
}
