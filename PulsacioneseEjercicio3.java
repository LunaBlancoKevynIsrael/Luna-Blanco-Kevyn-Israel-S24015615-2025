import java.util.Scanner;

public class PulsacioneseEjercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("cual es su edad?: ");
        int edad = sc.nextInt();

        double pulsaciones = (220 - edad) / 10.0;

        System.out.println("Su número de pulsaciones por cada 10 segundos es: " + pulsaciones);
    }
}