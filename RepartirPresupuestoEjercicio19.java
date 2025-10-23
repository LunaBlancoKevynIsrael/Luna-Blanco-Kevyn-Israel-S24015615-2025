import java.util.Scanner;
public class RepartirPresupuestoEjercicio19{
    
         public static void main(String args[]){
         Scanner sc = new Scanner (System.in);

        double presupuesto, gine, trauma, pedia;

        System.out.print("   Cual fue el total del presupuesto anual del hospital?   ");
        presupuesto = sc.nextDouble();

        gine = presupuesto * 0.40;
        trauma = presupuesto * 0.30;
        pedia = presupuesto * 0.30;

        System.out.println("Lo que le toca a los de Ginecología es de: $" + gine);
        System.out.println("Lo que le toca a los de Traumatología es de: $" + trauma);
        System.out.println("Lo que le toca a los de Pediatría es de: $" + pedia);

        sc.close();
    }
}