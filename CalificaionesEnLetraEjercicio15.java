import java.util.Scanner;
public class CalificaionesEnLetraEjercicio15{
    
         public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);

        System.out.print("Ingresa tu nota (del 0.0 al 5.0): ");
        double nota = sc.nextDouble();
        String letra;

        if (nota >= 0.0 && nota <= 1.0) {
            letra = "P (Pésimo)";
        } else if (nota <= 2.0) {
            letra = "M (Mal)";
        } else if (nota <= 2.9) {
            letra = "R (Regular)";
        } else if (nota <= 4.0) {
            letra = "B (Bien)";
        } else if (nota <= 5.0) {
            letra = "E (Excelente)";
        } else {
            letra = "Tu nota no pertenece al rango bro";        
        }

        System.out.println("Tu nota en letras es: " + letra);
        sc.close();
    }
}