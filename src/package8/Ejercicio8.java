
import java.util.Locale;
import java.util.Scanner;




public class Ejercicio8 {

   
    public static void main(String[] args) {
        String frase;
        
        Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        
        if("eureka".equalsIgnoreCase(frase)  ){
            System.out.println("Es Correcto");
        }else{
            System.out.println("Es incorrecto");
        }
        
    }

  
}
