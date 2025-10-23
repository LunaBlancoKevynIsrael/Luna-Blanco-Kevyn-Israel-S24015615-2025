import java.util.Scanner;
public class PrimoONoEjercicio17{
    
         public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         
       int num, contador = 2, divisor = 0;

        System.out.print("Ingrese un número: ");
        num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Tu número " + num + " no es primo.");
        } else {
            while (contador < num) {
                if (num % contador == 0) {
                    divisor = 1;
                    break;
                }
                contador++;
            }

            if (divisor == 0) {
                System.out.println("El número " + num + " es primo.");
            } else {
                System.out.println("El número " + num + " no es primo.");
            }
        }

        sc.close();
    }
}