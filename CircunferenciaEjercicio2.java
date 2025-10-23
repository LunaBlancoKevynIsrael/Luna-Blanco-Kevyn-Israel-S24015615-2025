import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.printf("   La longitud de la circunferencia es: " + longitud);
        System.out.printf("   El Área del círculo es de: " + area);
    }
}