import java.util.Scanner;
public class ComisionesEjercicio14{
    
         public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);

         double venta, comision, totalComision = 0;
        int contador = 1;

        while (contador <= 4) {
            System.out.print("Por favor dinos el valor de la venta " + contador + ": ");
            venta = sc.nextDouble();

            if (venta <= 10000000) {
                comision = venta * 0.02;
            } else if (venta > 10000000 && venta < 15000000) {
                comision = venta * 0.04;
            } else {
                comision = venta * 0.10;
            }

            System.out.println("La comisión de esta venta es de: $" + comision);
            totalComision = totalComision + comision;

            contador = contador + 1;
        }

        System.out.println("Tu comisión total del mes como vendedor es de: $" + totalComision);

        sc.close();
    }
}