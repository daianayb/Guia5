/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package17;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author daian
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         
         int n;
         
         System.out.println("Ingrese el numero de elementos por lado del cuadrado");
         
         n=leer.nextInt();
         
         for(int i=0;i<n;i++){
            System.out.print("*");
         }
         
         System.out.println(" ");
         
         for(int i=0;i<n-2;i+=1){
              System.out.print("*");
             for(int j=0;j<n-2;j+=1){
                     System.out.print(" ");
            
         }
         System.out.print("*");
             System.out.println(" "); 
    }
    
         for(int i=0;i<n;i++){
            System.out.print("*");
         }
         System.out.println(" ");
}
}
