
package package2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

   
    public static void main(String[] args) {
    
        String nombre ;
        
        
        Scanner leer1=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese su nombre");
        
        nombre=leer1.next();
        
        System.out.println("Su nombre es: "+nombre);
        
    }
    
}
