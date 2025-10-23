import java.util.Scanner;

public class PromedioMateriasEjercico10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la calificación de la primera materia: ");
        double m1 = sc.nextDouble();
        System.out.print("Ingrese la calificación de la segunda materia: ");
        double m2 = sc.nextDouble();
        System.out.print("Ingrese la calificación de la tercera materia: ");
        double m3 = sc.nextDouble();

        double promedio = (m1 + m2 + m3) / 3;

        System.out.println("Su promedio es: " + promedio);
    }
}
