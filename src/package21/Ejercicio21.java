
package package21;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio21 {

    
    public static void main(String[] args) {
       
        Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int[] vec;
        int tam,num;
        
       
        
        System.out.println("Ingrese la cantidad de elementos que desea para el vector");
        tam=leer.nextInt();
        vec=new int[tam];
        
        rellenaVec(vec);
        
        System.out.println("Ingrese un numero a buscar");
        num=leer.nextInt();
        
        buscaNum(vec,num);
        
        imprimeVector(vec);
        
        
        
    }
    
    
    public static void rellenaVec(int[] vec){
        
        for(int i=0;i< vec.length;i++){
            vec[i] =(int) (Math.random()*20)+1;
        }
        
    }
    
    
    public static void buscaNum(int[] vec,int num){
        int band=0;
        int pos;
        for(int i=0;i<vec.length ;i++){
            if(vec[i]==num){
                pos=i;
                System.out.println("Se encontro en la posicion: "+(pos+1));
                band+=1;
            }
        }
        if(band>1){
             System.out.println("Se repite:"+band+"veces");
        }
        
        if(band==0){
            System.out.println("No se encontro el numero");
        }
       
        
    }
    
     public static void imprimeVector(int[] vec){
        
        for(int i=0;i< vec.length ;i++){
            System.out.print("| "+vec[i]+ " |"); 
        }
        
    }
    
}
