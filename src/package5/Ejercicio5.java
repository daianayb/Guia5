
package package5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

  
    public static void main(String[] args) {
       
        int numero,doble,triple,raiz;
        
         Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
         System.out.println("Ingrese un numero para saber el doble , el triple y la raiz cuadrada");
         numero=leer.nextInt();
         
         doble=numero*2;
         triple=numero*3;
         raiz=(int) Math.sqrt(numero);
         
         System.out.println("EL DOBLE DE "+ numero + " ES: "+ doble);
         System.out.println("EL TRIPLE DE "+ numero + " ES: "+ triple);
         System.out.println("LA RAIZ CUADRADA DE "+ numero + " ES: "+ raiz);
         
        
        
       
    }
    
}
