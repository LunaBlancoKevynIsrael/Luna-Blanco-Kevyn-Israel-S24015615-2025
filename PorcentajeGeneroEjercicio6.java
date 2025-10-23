import java.util.Scanner;

public class PorcentajeGeneroEjercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Po favor pon el número de hombres: ");
        int hombres = sc.nextInt();
        System.out.print("Por favior pon el número de mujeres: ");
        int mujeres = sc.nextInt();

        int total = hombres + mujeres;
        double porcentajeHombres = (double) hombres / total * 100;
        double porcentajeMujeres = (double) mujeres / total * 100;

        System.out.println("El porcentaje de hombres: " + porcentajeHombres + "% ");
        System.out.println("El porcentaje de mujeres: " + porcentajeMujeres + "% ");
    }
}
