
package package15;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio15 {

    
    public static void main(String[] args) {
        int cont =0;
        float num,tot=0;
        
         Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         
         while(cont<20){
             System.out.println("Ingrese un numero");
             num=leer.nextFloat();
             cont=cont+1;
             if(num==0){
                 System.out.println("Se capturo el numero 0");
                 break;
             }
             else if(num>=0){
                 tot=tot+num;
             }
             
             
         }
         System.out.println("La suma de los numeros ingresados es: "+tot);
    }
    
}
