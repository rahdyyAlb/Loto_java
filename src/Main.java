import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Set<Integer> grilleJoueur = new HashSet<>();

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.

        for (int i = 1; i <= 5; i++) {
            int min = 1;
            int max = 100;
            Random nbm = new Random();

            int nrdm = nbm.nextInt(max - min + 1) + min;
            grilleJoueur.add(nrdm);
            System.out.println("i = " + grilleJoueur);
        }
    }
}