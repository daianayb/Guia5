
package package12;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio12 {

    
    public static void main(String[] args) {
       
        float nota=0;
        
        Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una nota");
        
        nota=leer.nextFloat();
        
        if(nota>=0 && nota<=10){
            
            System.out.println("Nota valida");
            
        }else{
            
            while(nota<0 || nota>10){
                System.out.println("Ingrese una nota valida");
        
                 nota=leer.nextFloat();
        }
        
        }
        
        
    }
    
}
