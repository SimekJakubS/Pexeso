public class Refresh {
    private Stvorec stvorec;
    private Kruh kruh;
    private Kruh kruzok;

    public Refresh() {
        this.kruh = new Kruh();
        this.kruzok = new Kruh();
        this.stvorec = new Stvorec();

        this.stvorec.zmenStranu(30);
        this.stvorec.posunZvisle(-50);
        this.stvorec.posunVodorovne(-50);

        this.kruh.zmenPriemer(20);
        this.kruh.posunZvisle(-71);
        this.kruh.posunVodorovne(-71);
        this.kruh.zmenFarbu("white");

        this.kruzok.zmenPriemer(10);
        this.kruzok.posunZvisle(-71);
        this.kruzok.posunVodorovne(-71);
        this.kruzok.zmenFarbu("red");

        this.stvorec.zobraz();
        this.kruh.zobraz();
        this.kruzok.zobraz();
    }
}
