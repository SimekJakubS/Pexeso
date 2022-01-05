import java.util.Scanner;

public class main {

    private static LogikaNadHrou logikaNadHrou;

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Zadajte meno hráča 1: ");
        String menoHraca1Scanner = scanner1.nextLine();
        System.out.println("Zadajte meno hráča 2: ");
        String menoHraca2Scanner = scanner1.nextLine();

        logikaNadHrou = new LogikaNadHrou(menoHraca1Scanner, menoHraca2Scanner, 2);
    }
}