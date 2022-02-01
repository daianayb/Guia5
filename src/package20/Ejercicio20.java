
package package20;


public class Ejercicio20 {

    
    public static void main(String[] args) {
        
        int[] vec;
        vec = new int[101];
        
        for(int i=1;i<101;i++){
            vec[i]=i;
        }
        
        for(int i= (vec.length - 1); i >= 0; i--){
            System.out.print(" | "+vec[i]+" |");
        }
        
        
      
        
    }
    
}
