import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java6 {
    public static void main(String[] args) {
        // Loo uus klassi fail ja lisa oma nimega kommentaar
        // Autor: Sinu Nimi

        // Loome uue loendi täisarvude jaoks
        List<Integer> arvud = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Alamprogramm, mis lubab kasutajal sisestada täisarve ja lisab need loendisse
        while (true) {
            System.out.print("Sisesta täisarv (jäta tühi sisend lõpetamiseks): ");
            String sisend = scanner.nextLine();

            if (sisend.isEmpty()) {
                break; // Tsükkel lõpetatakse, kui sisend on tühi
            }

            try {
                int arv = Integer.parseInt(sisend);
                arvud.add(arv);
            } catch (NumberFormatException e) {
                System.out.println("Vigane sisend. Sisesta ainult täisarve.");
            }
        }

        scanner.close();

        // Leiame kogusumma
        int summa = 0;
        for (int arv : arvud) {
            summa += arv;
        }

        // Leiame keskmise
        double keskmine = arvud.isEmpty() ? 0 : (double) summa / arvud.size();

        // Salvestame arvud, summa ja keskmise tekstifaili
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tulemused.txt"))) {
            writer.write("Sisestatud täisarvud:\n");
            for (int arv : arvud) {
                writer.write(arv + "\n");
            }
            writer.write("\nKogusumma: " + summa + "\n");
            writer.write("Keskmine: " + keskmine + "\n");
            System.out.println("Andmed on salvestatud faili 'tulemused.txt'.");
        } catch (IOException e) {
            System.out.println("Faili kirjutamisel tekkis viga: " + e.getMessage());
        }
    }
}
