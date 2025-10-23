import java.util.Scanner;
public class MetrosPiesPulgadasEjercicio1{
 
         public static void main(String args[]){
       Scanner sc = new Scanner (System.in);

        System.out.print("Por favor ingrese la cantidad en metros: ");
        double metros = sc.nextDouble();

        double pies = metros * 3.28084;
        double pulgadas = metros * 39.3701;

        System.out.println("   En pies: " + pies);
        System.out.println("   En pulgadas: " + pulgadas);
    }
}