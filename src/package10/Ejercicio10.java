
package package10;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio10 {

    
    public static void main(String[] args) {
        
        String palabra;
        
        Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase o palabra ");
        
        palabra=leer.nextLine();
        int i=0;
     
        if( "A".equalsIgnoreCase(palabra.substring(0,1))){
          System.out.println("CORRECTO");
        } else {
             System.out.println("INCORRECTO");
        }
        
        
        
        
    }
    
}
