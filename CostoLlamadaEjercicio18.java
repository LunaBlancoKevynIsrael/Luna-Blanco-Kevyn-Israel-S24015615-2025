import java.util.Scanner;
public class CostoLlamadaEjercicio18{
    
         public static void main(String args[]){
         Scanner sc = new Scanner (System.in);

         
        int minutos;
        double total;

        System.out.print("  Cuantos minutos duroi tu llamada?: ");
        minutos = sc.nextInt();

        if (minutos <= 3) {
            total = 10.00;
        } else {
            total = 10.00 + (minutos - 3) * 1.00;
        }

        System.out.println("El total a pagar por el tiempo de tu llamada es de: $" + total);

        sc.close();
    }
}