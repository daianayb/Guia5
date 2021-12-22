
package package4;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        
        double grados,conversion;
        
        Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una cantidad de grados Centígrados");
        grados=leer.nextDouble();
        
        conversion= (32+(9*grados/5));
        
        System.out.println("La conversión en Fahrenheit es:"+conversion);
                
                
        

        
    }
    
}
