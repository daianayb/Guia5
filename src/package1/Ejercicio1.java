
package package1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

   
    public static void main(String[] args) {
       int num1,num2,suma;
       
       Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
      
       System.out.println("Ingrese el primer numero");
       num1= leer.nextInt();
       System.out.println("Ingrese el segundo numero");
       num2 = leer.nextInt();
       
       suma=num1+num2;
       
       System.out.println("La suma de los numeros ingresados es: "+suma);
       
               
       
    }
    
}
