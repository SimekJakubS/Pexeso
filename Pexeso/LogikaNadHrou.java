public class LogikaNadHrou {
    private Hra hra;
    private HernaPlocha hernaPlocha;

    public LogikaNadHrou(String menoHraca1, String menoHraca2, int velkostHry) {
        this.hra = new Hra(menoHraca1, menoHraca2, velkostHry);
        this.hernaPlocha = new HernaPlocha(menoHraca1, menoHraca2, velkostHry);

        


    }
}
