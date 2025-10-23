import java.util.Scanner;

public class AumentoSalarioEjercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor diganos su salario actual: ");
        double salario = sc.nextDouble();

        double nuevoSalario = salario * 1.25;

        System.out.println("Su nuevo salario con el aumento del 25% es: $" + nuevoSalario);
    }
}
