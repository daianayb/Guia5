
package package22;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio22 {

    
    public static void main(String[] args) {
        
        int tam;

        int [] vec;
          Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       
          System.out.println("Ingrese el tamaño del vector ");
          tam=leer.nextInt();
          
          vec=new int [tam];
          
          rellenaVec(vec);
           buscador(vec);
     
        
    }
    
     public static void rellenaVec(int[] vec){
        
        for(int i=0;i< vec.length;i++){
            vec[i] =(int) (Math.random()*1000)+1;
        }
        
    }
    
      public static void buscador(int[] vec){
        int cont=0;
        int n1dig=0,n2dig=0,n3dig=0,n4dig=0,n5dig=0;
        for(int i=0;i< vec.length;i++){
           
            while(vec[i] > 0){
                vec[i] /= 10;
                cont ++;
            }
   
            switch(cont){
            
            case 1:
              n1dig ++;
              break;
            case 2:
                n2dig ++;
                break;
            case 3:
                n3dig ++;
                break;
            case 4:
                n4dig ++;
                break;
            case 5:
                n5dig++;
                break;
                        
              
        }
           cont=0; 
        }
          
        
          System.out.println("***   CANTIDAD DE NUMEROS DE 1 DIGITOS    *** ");
          System.out.println("  "+n1dig);
           System.out.println("***  CANTIDAD DE NUMEROS DE 2 DIGITOS   *** ");
          System.out.println("  "+n2dig);
           System.out.println("***  CANTIDAD DE NUMEROS DE 3 DIGITOS  *** ");
          System.out.println("  "+n3dig);
           System.out.println("***  CANTIDAD DE NUMEROS DE 4 DIGITOS    *** ");
          System.out.println("  "+n4dig);
           System.out.println("***  CANTIDAD DE NUMEROS DE 5 DIGITOS  *** ");
          System.out.println("  "+n5dig);
    }
     
}
