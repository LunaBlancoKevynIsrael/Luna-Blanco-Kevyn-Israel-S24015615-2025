import java.util.Scanner;
public class DetermineMayorMenorPromedioEjercicio11{

         public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
 
        System.out.println("Ingrese su primer numero a determinar: ");
        double prim;
        prim = sc.nextDouble();

        System.out.println("Ingrese su segundo numero a determinar: ");
        double seg;
        seg = sc.nextDouble();

        System.out.println("Ingrese su tercer numero a determinar: ");
        double ter;
        ter = sc.nextDouble();


        if (prim >= seg && prim >= ter) {
            System.out.println("El mayor es: " + prim);
        } else if (seg >= prim && seg >= ter) {
            System.out.println("El mayor es: " + seg);
        } else {
            System.out.println("El mayor es: " + ter);
        }

       
        if (prim <= seg && prim <= ter) {
            System.out.println("El menor es: " + prim);
        } else if (seg <= prim && seg <= ter) {
            System.out.println("El menor es: " + seg);
        } else {
            System.out.println("El menor es: " + ter);
        }


        if (prim == seg && seg == ter) {
            System.out.println("Hay valores iguales ");
        } else {
           
        
        double prom = (prim + seg + ter)/3;
        System.out.println("Promedio: " + prom);  
        }
       }
}
 