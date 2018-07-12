import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MainTab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String [] tablica = new String[5];
        System.out.println("Podaj 5 imion:");
        tablica[0] = scanner.nextLine();
        tablica[1] = scanner.nextLine();
        tablica[2] = scanner.nextLine();
        tablica[3] = scanner.nextLine();
        tablica[4] = scanner.nextLine();

        /*
        int index = 4;
        while(index < tablica.length && index >= 0){
            System.out.println("Cześć "+ tablica[index]);
            index--;
        }


        scanner.close();
        */
        for( int i = 4; i < tablica.length && i >= 0; i--) {
            System.out.println("Cześć " + tablica[i]);
        }
    }
}
