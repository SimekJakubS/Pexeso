public class LogikaNadHrou {
    private Hra hra;
    private HernaPlocha hernaPlocha;
    private Manazer manazer;
    private boolean hrac1NaTahu;
    private int pricitanieBodovCounter;

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


            if(this.pricitanieBodovCounter % 2 == 0) {
                this.pricitanieBodovCounter = this.pricitanieBodovCounter % 2;
                this.hra.pridajBody();
                this.pricitanieBodovCounter++;
            }

            this.hernaPlocha.resetDveOtocene();
        }
    }
}
