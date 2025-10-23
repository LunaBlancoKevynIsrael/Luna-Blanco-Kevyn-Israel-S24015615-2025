import java.util.Scanner;

public class InversioneEjercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuanto invertirá?: ");
        double capital = sc.nextDouble();

        double ganancia = capital * 0.02;
        double total = capital + ganancia;

        System.out.println("Esta sera su ganancia después de un mes: $" + ganancia);
        System.out.println("Y este su total después del mes: $" + total);
    }
}
