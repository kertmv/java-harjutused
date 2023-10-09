import java.util.Scanner;
 
public class ulesanne8 {
 
 public static void main(String[] args) {
 
 Scanner scanner = new Scanner (System.in);
 System.out.print("Rööpküliku pindala (1) \nRistküliku pindala (2) \nKolmnurga pindala  (3) \nsilindri ruumala (4) \nkoonuse ruumala  (5) \nristtahulise puramiidi ruumala (6)\nVali tegevus: "); 
 String valik = scanner.next();
 System.out.print("Sisesta alus: ");
 String alus = scanner.next();
 System.out.print("Sisesta kõrgus: ");
 String korgus = scanner.next();
 
 double s;
 switch (Integer.parseInt(valik)) {
 case 1:
 s = Pindalad.roopkylikS(alus, korgus);
 System.out.printf("Rööpküliku pindala on %.2f ",s);
 break;
 case 2:
 s = Pindalad.ristkylikS(alus, korgus);
 System.out.printf("Ristküliku pindala on %.2f ",s);
 break;
 case 3:
 s = Pindalad.kolmnurkS(alus, korgus);
 System.out.printf("Kolmnurga pindala on %.2f ",s);
 break;
case 4:
 s = ruumala.silinder(alus, korgus);
 System.out.printf("silindri ruumala on %.2f ",s);
 break;
 case 5:
 s = ruumala.koonus(alus, korgus);
 System.out.printf("koonuse ruumala on %.2f ",s);
 break;
 case 6:
 s = ruumala.risttahulisepuramiidiruumala (alus, korgus);
 System.out.printf("risttahulise puramiidi  ruumala on %.2f ",s);
 break;
 

 default:
 System.out.print("Valikust arusaamine ebaõnnestus!");
 break;
 }
 
 }
 
}