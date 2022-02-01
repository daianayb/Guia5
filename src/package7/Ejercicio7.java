
package package7;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
        double nume;
        
        Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        System.out.println("Ingrese un numero para saber si es par o impar");
        nume=leer.nextDouble();
        
        if(nume % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
                
                
    }
    
}
