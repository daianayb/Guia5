 
package package6;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio6 {

    
    
    public static void main(String[] args) {
        
        int num1,num2;
        
     Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
      
     System.out.println("Ingrese el primer numero");
     num1=leer.nextInt();
     System.out.println("Ingrese el segundo numero");
     num2=leer.nextInt();
     
     if (num1 > num2){
         System.out.println("El numero mayor es: "+num1);
     }else if (num1 < num2){
         System.out.println("El numero mayor es: "+num2);
     }else{
         System.out.println("Los numeros son iguales");
     }
     
      
       
    }
    
}
