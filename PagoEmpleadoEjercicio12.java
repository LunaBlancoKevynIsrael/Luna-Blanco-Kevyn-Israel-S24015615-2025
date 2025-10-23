import java.util.Scanner;
public class PagoEmpleadoEjercicio12{
  
         public static void main(String args[]){
         Scanner sc = new Scanner (System.in);

          System.out.print("-------Cual es tu categoría como empleado? (1-4): ");
        int categoria = sc.nextInt();
        System.out.print("-------Por favor ingresa tus horas trabajadas en el mes: ");
        int horas = sc.nextInt();

        double tarifaHora = 0;

        switch (categoria) {
            case 1:
                tarifaHora = 20000;
                break;
            case 2:
                tarifaHora = 15000;
                break;
            case 3:
                tarifaHora = 10000;
                break;
            case 4:
                tarifaHora = 7500;
                break;
            default:
                System.out.println("   Tu categoría no es válida   ");
                sc.close();
                return;
        }

        double salarioBruto = tarifaHora * horas;

        double descuentoSalud = salarioBruto * 0.072;
        double salarioNeto = salarioBruto - descuentoSalud;

            if (salarioBruto < 1000000) {
            double subsidio = salarioBruto * 0.15;
            salarioNeto += subsidio;
            System.out.println("---Aplica subsidio del 15%: $" + subsidio);
        }

        System.out.println("---Tu salario bruto es de: $" + salarioBruto);
        System.out.println("---El descuento de salud(7.2%) fue de: $" + descuentoSalud);
        System.out.println("---Este es tu salario neto a pagar: $" + salarioNeto);

        sc.close();
    }
}