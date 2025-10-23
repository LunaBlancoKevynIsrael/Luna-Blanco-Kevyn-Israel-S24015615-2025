import java.util.Scanner;
public class ParNonEjercicio16{
    
         public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
 
         System.out.print("Ingresa un número cualquiera: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Tu número " + n + " es Par  ");
        } else {
            System.out.println("Tu número " + n + " es Non  ");
        }

        sc.close();
    }
}