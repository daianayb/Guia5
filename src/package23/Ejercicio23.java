
package package23;

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz*/ 

public class Ejercicio23 {

   
    public static void main(String[] args) {
        int [][] matriz;
        
        matriz= new int [4][4];
        
        rellenaMat(matriz);
        
    }
    
    
      public static void rellenaMat(int[][] ma){
        
        for(int i=0 ;i< ma.length;i++){
             for(int j=0;j< ma.length;j++){
            ma[i][j] =(int) (Math.random()*20)+1;
        }
        }
    }

}
