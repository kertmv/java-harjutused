import java.util.InputMismatchException;
import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Sisesta kaks arvu (või 'exit' lõpetamiseks): ");
                String sisend = scanner.nextLine();

                if (sisend.equalsIgnoreCase("exit")) {
                    System.out.println("Programm lõpetab.");
                    break;
                }

                String[] arvud = sisend.split(" ");
                if (arvud.length != 2) {
                    throw new InputMismatchException("Sisesta täpselt kaks arvu.");
                }

                double arv1 = Double.parseDouble(arvud[0]);
                double arv2 = Double.parseDouble(arvud[1]);

                System.out.println("Vali tehe (+, -, *, /): ");
                String tehe = scanner.nextLine();

                double tulemus;

                switch (tehe) {
                    case "+":
                        tulemus = arv1 + arv2;
                        break;
                    case "-":
                        tulemus = arv1 - arv2;
                        break;
                    case "*":
                        tulemus = arv1 * arv2;
                        break;
                    case "/":
                        if (arv2 != 0) {
                            tulemus = arv1 / arv2;
                        } else {
                            System.out.println("Nulliga jagamine pole lubatud.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Tundmatu tehe. Kasuta '+', '-', '*', '/'");
                        continue;
                }

                System.out.println("Tulemus: " + tulemus);

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Vigane sisend. Palun sisesta kaks arvu.");
            }
        }}}

        
    
    