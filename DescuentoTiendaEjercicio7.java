import java.util.Scanner;

public class DescuentoTiendaEjercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuanto fue el total de su compra?: ");
        double total = sc.nextDouble();

        double descuento = total * 0.15;
        double totalFinal = total - descuento;

        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}
