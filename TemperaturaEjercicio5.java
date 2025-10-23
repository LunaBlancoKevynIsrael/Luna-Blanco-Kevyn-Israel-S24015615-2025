import java.util.Scanner;

public class TemperaturaEjercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados centígrados: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura Kelvin: " + kelvin);
    }
}
