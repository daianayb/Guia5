
package package13;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio13 {

   
    public static void main(String[] args) {
       
        float numLimite,nums,n,tot=0;
        
        Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        System.out.println("Ingrese un valor limite..");
        numLimite=leer.nextFloat();
        while(numLimite<0){
            System.out.println("Ingrese un numero positivo");
            numLimite=leer.nextFloat();
                    
        }
        
        System.out.println("Ingrese un valor");
        nums=leer.nextFloat();
        tot=tot+nums;
        while(numLimite != tot){
            System.out.println("Ingrese un valor");
              n=leer.nextFloat();
              tot=tot+n;
              
            
        }
        
        System.out.println("La suma de los numeros es igual al limite inicial: "+numLimite);
        
        
    }
    
}
