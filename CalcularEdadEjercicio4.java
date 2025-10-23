import java.util.Scanner;

public class CalcularEdadEjercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ponga su año de nacimiento: ");
        int anioNacimiento = sc.nextInt();

        int edad = 2025 - anioNacimiento;

        System.out.println("Su edad es: " + edad + " años.");
    }
}