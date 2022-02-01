
package package18;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio18 {

   
    public static void main(String[] args) {
        
        int num;
        
        Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese 4 numeros");
        for(int i=0;i<4;i++){
            num=leer.nextInt();
            while(num>0 && num>20){
                System.out.println("Ingrese un numero de 1 al 20");
                 num=leer.nextInt();
            }
            System.out.print(num);
            for(int j=0;j<num;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
        
  
        
    
    
    }
}

