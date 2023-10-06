import java.util.Scanner;

public class java5 { 

    private static Scanner scanner=new Scanner(System.in);
    public static  void main(String[] args) {
        jagamine();
    }

    static void jagamine() {
        System.out.print("Sisesta esimene number: ");
        int arv1=scanner.nextInt();
        System.out.print("Sisesta teine number: ");
        int arv2=scanner.nextInt();

        if(arv1>=0 && arv2>0) {
            double jagatis=(double)arv1/arv2;
            System.out.println(jagatis);
        } else {
            System.out.println("arvud peavad olema positiivsed");
        }
    }
}