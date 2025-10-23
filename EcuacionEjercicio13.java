import java.util.Scanner;
public class EcuacionEjercicio13{
    
         public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);

        double A, B, C, x1, x2, discriminante;

        System.out.print("Ingrese el valor de A: ");
        A = sc.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        B = sc.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        C = sc.nextDouble();

        if (A == 0) {
            System.out.println("No es una ecuación cuadrática porque A es igual a 0");
        } else {
            discriminante = (B * B) - (4 * A * C);

            if (discriminante < 0) {
                System.out.println(" Las raíces son imaginarias ");
            } else {
                x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                x2 = (-B - Math.sqrt(discriminante)) / (2 * A);

                System.out.println("Las raíces reales son:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        sc.close();
    }
}