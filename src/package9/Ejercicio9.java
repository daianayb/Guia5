
import java.util.Locale;
import java.util.Scanner;



public class Ejercicio9 {

    
    public static void main(String[] args) {
     
        String palabra;
        
        Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase o palabra de longitud 8");
        
        palabra=leer.nextLine();
        
        if( palabra.length() <= 8){
          System.out.println("CORRECTO");
        } else {
             System.out.println("INCORRECTO");
        }
        
        
    }


    
}
