import java.util.Scanner;
public class Area{

//saber el area de un cuadrado pana
       
       public static void main(String[] agrs){
       Scanner sc = new Scanner (System.in);
       System.out.println(" Escribe cuanto mide el lado de tu cuadrado brother ");
       

       float lado;
       float area= 0;
       lado = sc.nextFloat();
       area =lado*lado;
        
       System.out.println(" El valor del área de tu cuadrado es: " + area);
       }
} 
 