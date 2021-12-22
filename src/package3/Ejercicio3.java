
package package3;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
      
        String frase;
        
        Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase");
        
        frase=leer.next();
        
        System.out.println("La frase en mayúsculas: "+frase.toUpperCase());
        
        System.out.println("La frase en minúsculas: "+frase.toLowerCase());
       
    }
    
}
