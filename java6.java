import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java6 {
    public static void main(String[] args) {
        
        
        List<Integer> arvud = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.print("Sisesta täisarv (jäta tühi sisend lõpetamiseks): ");
            String sisend = scanner.nextLine();

            if (sisend.isEmpty()) {
                break; 
            }

            try {
                int arv = Integer.parseInt(sisend);
                arvud.add(arv);
            } catch (NumberFormatException e) {
                System.out.println("Vigane sisend. Sisesta ainult täisarve.");
            }
        }

        scanner.close();

        
        int summa = 0;
        for (int arv : arvud) {
            summa += arv;
        }

       
        double keskmine = arvud.isEmpty() ? 0 : (double) summa / arvud.size();

      
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
