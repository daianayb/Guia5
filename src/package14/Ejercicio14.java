
package package14;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio14 {

   
    public static void main(String[] args) {
        
        int n1,n2;
        int op=0;
        float tot;
        String op2;
        
         Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         
         
         
         
         
         while(op != 5){
             System.out.println("Ingrese dos numeros");
         
         n1=leer.nextInt();
         n2=leer.nextInt();
         
         System.out.println("MENU");
         System.out.println("1.Sumar");
         System.out.println("2.Restar");
         System.out.println("3.Multiplicar");
         System.out.println("4.Dividir");
         System.out.println("5.Salir");
         System.out.println("Elija opcion");
         
         op=leer.nextInt();
         
         
         switch (op){
             case 1:
                 tot=n1+n2;
                 System.out.println("SUMA:");
                 System.out.println(n1+"+"+n2+"="+tot);
                 break;
             case 2:
                 tot=n1-n2;
                 System.out.println("RESTA:");
                 System.out.println(n1+"-"+n2+"="+tot);
                 break;
                 
             case 3:
                 tot=n1*n2;
                 System.out.println("MULTIPLICACION:");
                 System.out.println(n1+"*"+n2+"="+tot);
                 break;
                 
             case 4:
                 tot=n1/n2;
                 System.out.println("DIVISION:");
                 System.out.println(n1+"/"+n2+"="+tot);
                 break;
                 
             case 5:
                 System.out.println("Esta seguro que desea salir del programa? (S/N)");
            op2=leer.next();
            if("S".equalsIgnoreCase(op2)){
               op=5;
            }else if ("N".equalsIgnoreCase(op2)){
                op=0;
            }
            break;
                 
         }
         
       
         
         
         }
         
        
    }
    
}
