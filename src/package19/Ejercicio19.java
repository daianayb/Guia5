
package package19;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio19 {

 
    public static void main(String[] args) {
      
        double euros;
        String conversion;
        
         Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         
         System.out.println("Ingrese la cantidad de euros a convertir");
         euros=leer.nextDouble();
         System.out.println("Ingrese a que moneda desea convertir:");
         System.out.println("Dolares");
         System.out.println("Yenes");
         System.out.println("Libras");
         conversion= leer.next();
         
         while(conversion.equalsIgnoreCase("dolares")==false && conversion.equalsIgnoreCase("yenes")==false && conversion.equalsIgnoreCase("libras")==false  ){
             System.out.println("Ingrese una moneda valida");
             conversion= leer.next();
         }
         
         conversionMoneda(euros,conversion);
        
        
    }
    
public static void conversionMoneda(double cant, String moneda){
    double conv;
        
    if(moneda.equalsIgnoreCase("libras")){
        conv=cant*0.86;
                
       }else if(moneda.equalsIgnoreCase("dolares")){
           conv=cant*1.28611;
       }else{
           conv=cant*129.852;
       }

    System.out.println("La conversion a "+moneda +" es de: "+conv);


}

}
