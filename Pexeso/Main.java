import java.util.Scanner;

public class Main {

    private static LogikaNadHrou logikaNadHrou;

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Zadajte meno hráča 1: ");
        String menoHraca1Scanner = scanner1.nextLine();
        System.out.println("Zadajte meno hráča 2: ");
        String menoHraca2Scanner = scanner1.nextLine();

        System.out.println("Zadajte veľkosť hry: ");
        String velkostHryScanner = scanner1.nextLine();
        int velkostHryScannerInt = Integer.parseInt(velkostHryScanner);

        logikaNadHrou = new LogikaNadHrou(menoHraca1Scanner, menoHraca2Scanner, velkostHryScannerInt);
    }
}