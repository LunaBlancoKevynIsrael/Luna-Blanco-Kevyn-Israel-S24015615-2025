import java.util.Scanner;
public class DescuentoSuperEjercicio20{
    
         public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
  
        double totalCompra, descuento, totalPagar;
        int numero;

        System.out.print("Digame el valor de su compra por favor: ");
        totalCompra = sc.nextDouble();
        System.out.print("Y cual fue el numero que le toco? (0 - 99): ");
        numero = sc.nextInt();

        if (numero < 74) {
            descuento = totalCompra * 0.15;
        } else {
            descuento = totalCompra * 0.20;
        }

        totalPagar = totalCompra - descuento;

        System.out.println("Su descuento sera de: $" + descuento);
        System.out.println("El total a pagar es de: $" + totalPagar);

        sc.close();
    }
}